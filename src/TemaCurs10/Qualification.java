package TemaCurs10;

public class Qualification extends Teacher {

	public Qualification(String course, int experienceYears , String schedule ) {
		
		this.course = course;
		this.experienceYears = experienceYears;
		this.schedule = schedule;
		
	}
	
	public void  Verify() {
		
		if(experienceYears > 3 && course.equals("Java") && schedule.equals("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}
		
	}
	
	
}
