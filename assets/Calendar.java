package assets;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
	
	SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy HH:mm");
	
	private String owner;
	private String email;
	
	private List<Appointments> appointments = new ArrayList<>();
	
	public Calendar() {}

	public Calendar(String owner, String email) {
		this.owner = owner;
		this.email = email;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void addAppointment(Appointments Appointment) {
		
		this.appointments.add(Appointment);
	}
	
public void removeAppointment(Appointments Appointment) {
		
		this.appointments.remove(Appointment);
	}

public List<Appointments> getAppointments() {
	return appointments;
}

@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("Here are your Appointments:\n\n");
	for (Appointments x : appointments) {
		
		sb.append(x + "\n");	
	}
	
	
	return sb.toString();
}
}
