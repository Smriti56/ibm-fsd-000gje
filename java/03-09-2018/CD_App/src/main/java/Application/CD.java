package Application;


import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name ="cd" )
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "cdtype")
@DiscriminatorValue("CD")

public class CD {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String title;
	String artist;
	Date purchasedate;
	double cost;
	
	public CD() {
	}

	public CD(String title, String artist, Date purchasedate, double cost) {
		this.title = title;
		this.artist = artist;
		this.purchasedate = purchasedate;
		this.cost = cost;
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

public String getArtist() {

return artist;
}

	public void setPurchasedate(Date purchaseDate) {
		this.purchasedate = purchaseDate;
	}

	public Date getPurchasedate() {
		return purchasedate;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}
}