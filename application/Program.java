package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import assets.Appointments;
import assets.Calendar;

public class Program {
	
	public String intro(Calendar calendar) {
		
		return "Hello" + calendar.getOwner();
	}
	
	static public void breaker() {
		System.out.print("\n----------------------------------------------------------\n\n");
	}
	
	public static void mainMenu(Calendar calendar) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy'T'HH:mm");
		Scanner sc = new Scanner(System.in);
		System.out.println("Chose your option:" + "\n"
				+ "1 - Add appointment" + "\n"
				+ "2 - Remove appointment" + "\n"
				+ "3 - Check appointments"  + "\n"
				+ "4 - Finish program");
		
		int option = sc.nextInt();
		switch(option){
		case 1:
			
			breaker();
			
			System.out.print("Date of the appointment (DD/MM/YYYY hh:mm): ");
			Date date = sdf.parse(sc.next());
			sc.nextLine();
			System.out.print("Title: ");
			String title = sc.nextLine();
			System.out.print("Description: ");
			String desc = sc.nextLine();
			
			Appointments apt = new Appointments(date, title, desc);
			calendar.addAppointment(apt);
			breaker();
			mainMenu(calendar);
			
			break;
			
		case 2:
			breaker();
			System.out.println("List of Apointments");
			for (int i=0; i<calendar.getAppointments().size(); i++) {
				System.out.print((i+1) + " - " + calendar.getAppointments().toString());
			}
			System.out.print("Number of the appointment to be deleted: ");
			int choise = sc.nextInt();
			
			calendar.getAppointments().remove(choise - 1);
			breaker();
			mainMenu(calendar);
		
		case 3:
			
			breaker();
			System.out.println(calendar.toString());
			breaker();
			mainMenu(calendar);
			
		case 4:
			
			System.out.println("Bye bye Danya!");
			break;
		}
		
		sc.close();
	}
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello There!");
		System.out.print("Enter your name, General: ");
		String name = sc.nextLine();
		System.out.print("Enter your email: ");
		String email = sc.nextLine();
				
		Calendar c = new Calendar(name, email);
		
		breaker();
		System.out.println("Welcome " + c.getOwner() + "!\n");
		mainMenu(c);
		sc.close();
	}
}
