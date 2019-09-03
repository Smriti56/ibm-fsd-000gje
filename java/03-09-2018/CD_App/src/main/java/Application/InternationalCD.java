package Application;

import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("international_cd")
public class InternationalCD extends CD {
	private String language;
	private int region;

	public InternationalCD() {
	}

	public InternationalCD(String title, String artist, Date purchaseDate, double cost, String language, int region) {
		super(title, artist, purchaseDate, cost);
		language = language;
		this.region = region;
	}

	public void setLanguages(String s) {
		language = s;
	}

	public String getLanguages() {
		return language;
	}

	public void setRegion(int i) {
		region = i;
	}

	public int getRegion() {
		return region;
	}
}