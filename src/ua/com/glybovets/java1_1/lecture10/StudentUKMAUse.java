package ua.com.glybovets.java1_1.lecture10;

import acm.program.*;

public class StudentUKMAUse extends ConsoleProgram{
	
	public void run(){
		
		StudentUKMA st1 = new StudentUKMA("Андрій","");
		println("Загальна кількість студентів - "+st1.getNumberOfStudents());
		println(st1);
		StudentUKMA st2 = new StudentUKMA("Микола","група2");
		println("Загальна кількість студентів - "+st1.getNumberOfStudents());
		println(st2);
		st1.setGroup("Група 1");
		st1.addResult(76);
		st2.addResult(76);
		st2.addResult(78);
		println(st1);
		println(st2);
		
		
	}

}
