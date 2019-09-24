package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
  
	@Autowired
	private Environment env;
	UserRepository userRepository;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	 @Autowired
	 private JavaMailSender javaMailSender;

	
	
	public UserServiceImpl(Environment env, UserRepository userRepository,
			BCryptPasswordEncoder bCryptPasswordEncoder) {
		super();
		this.env = env;
		this.userRepository = userRepository;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}

	@Override
	public UserDto createUser(UserDto userdto) {
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		User user = mapper.map(userdto, User.class);
		//becryptpassword
		String bpass=bCryptPasswordEncoder.encode(user.getPassword());
		user.setPassword(bpass);
		
		//setting bmi
		double bmi =( user.getWeight()*10000 )/ (user.getHeight() * user.getHeight());
		user.setBmi(bmi);
		
		//setting category
		if (user.getGender().equals("male")) {
			if (bmi < (double)18.50) {
				user.setCategory("underweight_male");
			}
			else if (bmi >= 18.50 && bmi <= 24.90) {
				user.setCategory("normal_male");
			} else {
				user.setCategory("overweight_male");
			}
		} else {
			if (bmi < 18.50) {
				user.setCategory("underweight_female");
			}
			else if (bmi >= 18.50 && bmi <= 24.90) {
				user.setCategory("normal_female");
			} else {
				user.setCategory("overweight_female");
			}

		}
		userRepository.save(user);
		
		
			System.out.println("Sending Email...");
			MimeMessage msg = javaMailSender.createMimeMessage();
	        MimeMessageHelper helper;
			try {
				helper = new MimeMessageHelper(msg, true);
				 helper.setTo(user.getEmail());
			        helper.setSubject("Welcome to Fitness Tracker");
			        helper.setText("<h3><b>Congratulations,You are our customer now!!<b></h3>");
			        helper.setText("<p>We are so happy that now you are a part of our family and we promise to keep u fit and healthy</p><hr><p>ThankYou :)</p>", true);
			        helper.addAttachment("my_photo.png", new ClassPathResource("android.png"));
			        javaMailSender.send(msg);	
			        System.out.println("Done");	
			} catch (MessagingException e) {
			
				e.printStackTrace();
			} 
	       
		
		
		
		UserDto userDto = mapper.map(user, UserDto.class);
		return userDto;
	}

	@Override
	public UserDto getUserById(int id) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		User user = userRepository.findById(id).get();
		UserDto userDto = mapper.map(user, UserDto.class);
		return userDto;
	}

	@Override
	public void deleteUser(int id) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		userRepository.deleteById(id);
	}

	@Override
	public UserDto updateUser(UserDto userdto) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		User user = mapper.map(userdto, User.class);
		userRepository.save(user);
		UserDto userDto = mapper.map(user, UserDto.class);
		return userDto;
	}

	@Override
	public UserDto getUserByEmail(String email) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		User user = userRepository.findByEmail(email);
		UserDto userDto = mapper.map(user, UserDto.class);
		return userDto;
	}

	@Override
	public List<UserDto> getAllUsers() {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<User> users = userRepository.findAll();
		List<UserDto> userlist = new ArrayList<UserDto>();
		for (User u : users) {
			userlist.add(mapper.map(u, UserDto.class));
		}
		return userlist;
	}

	@Override
	public UserDto verifyUser(UserDto userdto) {
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		String email=userdto.getEmail();
		String password=userdto.getPassword();
		String originalpass=bCryptPasswordEncoder.encode(userdto.getPassword());
		
		User user = userRepository.findByEmail(email);
		
		if (user == null)
		{
			return null;
		} else
		{
			UserDto userDto = mapper.map(user, UserDto.class);
			if (userDto.getEmail().equals(email) && bCryptPasswordEncoder.matches(password, userDto.getPassword()))
			{
				return userDto;
			}
			else
			{
				return null;
			}

		
		}
		
	}

}
