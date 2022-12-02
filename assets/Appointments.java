package assets;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointments {
	
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm");

	private Date moment;
	private String Title;
	private String Description;
	
	public Appointments() {}
	
	public Appointments(Date moment, String title, String description) {
		this.moment = moment;
		Title = title;
		Description = description;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "Time: " + sdf.format(this.getMoment()) + " | " + this.getTitle().toUpperCase() + " - " + this.getDescription();
	}
	
	
}
