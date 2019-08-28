package assessment3;

public class State implements Comparable<State>{

	String stateName;

	public State(String stateName) {
		super();
		this.stateName = stateName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public int compareTo(State st) {

		if(this.getStateName().compareTo(getStateName())==0)
		{
			return 0;
		}
		else if(this.getStateName().compareTo(getStateName())<0)
		{
			return -1;
		}
		else
		{
			return 1;
		}
		
	}
	
}
