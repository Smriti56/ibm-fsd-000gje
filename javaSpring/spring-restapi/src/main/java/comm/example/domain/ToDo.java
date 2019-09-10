package comm.example.domain;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class ToDo {
	
	private String id;
	private String description;
	private Date scheduleTime;
	public ToDo() {
		super();
	}
	public ToDo(String description, Date scheduleTime) {
		super();
		this.id=UUID.randomUUID().toString();
		this.description = description;
		this.scheduleTime = scheduleTime;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(Date scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	
	

}