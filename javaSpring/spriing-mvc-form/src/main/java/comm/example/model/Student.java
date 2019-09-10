package comm.example.model;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private LinkedHashMap<String,String> countryOptions;
	private String[] operatingSystems;
	private String favouriteLanguage;
	private String country;
	private String value;
	private String type;
	
	
	
	
	public Student() {
		countryOptions=new LinkedHashMap<String, String>();
		countryOptions.put("IN", "India");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("US", "America");
		countryOptions.put("CH", "China");
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LinkedHashMap<String,String> getCountryOptions() {
		return countryOptions;
	}
	public void setCountryOptions(LinkedHashMap<String,String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	
	public String getCountry() {
		return countryOptions.get(country);
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	@Override
	public String toString() {
		return "id="+id+"firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", operatingSystems=" + operatingSystems + ", favouriteLanguage=" + favouriteLanguage;
	}
	
	

	public void setOperatingSystems(String string) {
		this.operatingSystems = operatingSystems;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	

}
