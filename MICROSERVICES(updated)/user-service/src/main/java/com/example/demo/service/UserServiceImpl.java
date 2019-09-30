package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.model.UserResponse;
import com.example.demo.repository.UserRepository;

@Service
@Component
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
		UserDto user1 = getUserByEmail(userdto.getEmail());
		if (user1 != null) {
			return null;
		} else {
			ModelMapper mapper = new ModelMapper();
			mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
			User user = mapper.map(userdto, User.class);
			// becryptpassword
			String bpass = bCryptPasswordEncoder.encode(user.getPassword());
			user.setPassword(bpass);

			// setting bmi
			double bmi = (user.getWeight() * 10000) / (user.getHeight() * user.getHeight());
			user.setBmi(bmi);

			// setting category
			if (user.getGender().equals("male")) {
				if (bmi < (double) 18.50) {
					user.setCategory("underweight_male");
				} else if (bmi >= 18.50 && bmi <= 24.90) {
					user.setCategory("normal_male");
				} else {
					user.setCategory("overweight_male");
				}
			} else {
				if (bmi < 18.50) {
					user.setCategory("underweight_female");
				} else if (bmi >= 18.50 && bmi <= 24.90) {
					user.setCategory("normal_female");
				} else {
					user.setCategory("overweight_female");
				}

			}
			System.out.println("Sending Email...");
			try {
				SimpleMailMessage helper= new SimpleMailMessage();
				 helper.setTo(user.getEmail());
				 helper.setSubject("Welcome to Fitness Tracker");
				 helper.setText("Congratulations,You are our customer now!! We are so happy that now you are a part of our family and we promise to keep u fit and healthy ThankYou :)");
				    
				    javaMailSender.send(helper);
			} catch (MailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				userRepository.save(user);
				
				UserDto userDto = mapper.map(user, UserDto.class);
				return userDto;
			}
			       	 
			

		}
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
		System.out.println(email);
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		User user = userRepository.findByEmail(email);
		if (user == null) {
			return null;
		} else {
			UserDto userDto = mapper.map(user, UserDto.class);
			return userDto;
		}
	}

	@Override
	public List<UserResponse> getAllUsers() {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<User> users = userRepository.findAll();
		List<UserResponse> userlist = new ArrayList<UserResponse>();
		for (User u : users) {
			userlist.add(mapper.map(u, UserResponse.class));
		}
		return userlist;
	}

	@Override
	public UserDto verifyUser(UserDto userdto) {

		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		String email = userdto.getEmail();
		String password = userdto.getPassword();
		User user = userRepository.findByEmail(email);
		if (user == null) {
			return null;
		} else {
			UserDto userDto = mapper.map(user, UserDto.class);
			if (userDto.getEmail().equals(email) && bCryptPasswordEncoder.matches(password, userDto.getPassword())) {
				return userDto;
			} else {
				return null;
			}

		}

	}
	
	@Override
	public User sendPassword(UserDto userDto) {
		User user = userRepository.findByEmail(userDto.getEmail());
		if (user == null) {
			return null;
		} else {
		SimpleMailMessage helper= new SimpleMailMessage();
		 helper.setTo(user.getEmail());
		 helper.setSubject("Password Reset");
		 helper.setText("your token is: " + user.getPassword());	    
	    javaMailSender.send(helper);	
	    return user;
	    }
	}
	
	@Override
	public UserDto updatePassword(UserDto userDto) {
		User user = userRepository.findByEmail(userDto.getEmail());
		if (user == null) {
			return null;
		} else {
		String bpass = bCryptPasswordEncoder.encode(userDto.getPassword());
		user.setPassword(bpass);
	    userRepository.save(user);
	    ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserDto userdto = mapper.map(user, UserDto.class);
		return userdto;
	    }
	}
	
	
	@Override
	public UserDto verifyUserbyBcrypt(UserDto userdto) {

		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		String email = userdto.getEmail();
		String password = userdto.getPassword();
		User user = userRepository.findByEmail(email);
		if (user == null) {
			return null;
		} else {
			UserDto userDto = mapper.map(user, UserDto.class);
			if (userDto.getEmail().equals(email) && password.equals(user.getPassword())) {
				return userDto;
			} else {
				return null;
			}

		}

	}

	@Override
	public UserDto verifyUserGmail(UserDto userdto) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		String email = userdto.getEmail();
		String password = userdto.getPassword();
		User user = userRepository.findByEmail(email);
		if (user == null) {
			return null;
		} else {
			UserDto userDto = mapper.map(user, UserDto.class);
			if (userDto.getEmail().equals(email)) {
				return userDto;
			} else {
				return null;
			}

		}
	} 
}