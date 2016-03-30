package ua.com.glybovets.java1_1.lecture10;

public class StudentUKMA {
	
	public StudentUKMA(String fio){
	
		this.fio = fio;
		group = "";
		averageBal=0;
		numberOfCourses=0;
		numberOfStudents++;
	}
	
	public StudentUKMA(String fio, String group){
		this.fio = fio;
		this.group = group;
		averageBal=0;
		numberOfCourses=0;
		numberOfStudents++;
	}
	
	public String getFio(){
		return fio;
	}
	
	public String getGroup(){
		return group;
	}
	
	public void setGroup(String group){
		this.group=group;
	}
	
	public double getAverageBal(){
		return averageBal;
	}
	
	public double getNumberOfCourses(){
		return numberOfCourses;
	}
	
	public boolean addResult(double bal){
		if (bal<=maxBal){
			averageBal=(averageBal*numberOfCourses +bal)/(numberOfCourses+1);
			numberOfCourses++;
			return true;
		}
		else return false;
	}
	
	public String getFaculty(){
		return facultyName;
	}
	
	public void setFaculty(String fn){
		facultyName=fn;
	}
	
	public int getNumberOfStudents(){
		return numberOfStudents;
	}
	
	public String toString(){
		return "Студент - "+fio+", групи - "+group+", має середній бал "+averageBal+", прослухав - "+numberOfCourses+" курсів";
	}
	
	public static final double maxBal =  100.0;
	
	private static int numberOfStudents=0;
	
	private String fio;
	private String group;
	private double averageBal;
	private int numberOfCourses;
	private String facultyName;
	

}
