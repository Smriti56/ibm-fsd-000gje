package enumeration;

public class TennisCoach implements Coach{
	private String name;
	private Level level;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice back today";
	}

	
	public TennisCoach() {
		super();
	}


	public TennisCoach(String name, Level level) {
		super();
		this.name = name;
		this.level = level;
	}


	
	public String getName() {
		return name;
	}


	
	public void setName(String name) {
		this.name = name;
	}


	public Level getLevel() {
		return level;
	}


	public void setLevel(Level level) {
		this.level = level;
	}
	
	public String getCoachDetails()
	{
		StringBuilder sb =new StringBuilder();
		sb.append("today's workout plan is "+ getDailyWorkout()+"\n");
		sb.append(" name of coach is "+getName()+"\n");
		sb.append(" level of coach is "+level+"\n");
		sb.append(" Coach's level rank is"+level.getLevelCode());
		return sb.toString();
		
	}
	
	public void createCoach(String name,Level level)
	{
		this.name = name;
		this.level = level;
		
	}
	
	
	
	

}
