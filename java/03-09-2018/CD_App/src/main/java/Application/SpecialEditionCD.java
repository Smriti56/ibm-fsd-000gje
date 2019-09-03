package Application;


import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("special_edition_cd")
public class SpecialEditionCD extends CD {
	private String newfeature;

	public SpecialEditionCD() {
	}

	public SpecialEditionCD(String title, String artist, Date purchaseDate, double cost, String features) {
		super(title, artist, purchaseDate, cost);
		newfeature = features;
	}

	public void setNewfeatures(String s) {
		newfeature = s;
	}

	public String getNewfeatures() {
		return newfeature;
	}
}