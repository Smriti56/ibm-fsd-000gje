package assessment3;

import java.util.ArrayList;
import java.util.List;

public class Country {
	
	String name;
	List<String> stateList=new ArrayList<String>();
	
	
	public Country(String name) {
		super();
		this.name = name;
	}
	
	
	
	public Country(String name, List<String> state) {
		super();
		this.name = name;
		this.stateList = state;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getStateList() {
		return stateList;
	}
	public void setStateList(List<String> stateList) {
		this.stateList = stateList;
	}
	
	public void addState(String state)
	{
		stateList.add(state);
		
	}
	
	public List getStateList1()
	{
		
		return stateList;
		
	}

}
