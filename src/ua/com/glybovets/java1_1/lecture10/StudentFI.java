package ua.com.glybovets.java1_1.lecture10;

public class StudentFI extends StudentUKMA{

	public StudentFI(String fio) {
		super(fio);
		oopKnowledgeLevel=0;
		networksKnowledgeLevel=0;
	}
	
	public StudentFI(String fio, String group) {
		super(fio, group);
		oopKnowledgeLevel=0;
		networksKnowledgeLevel=0;
	}

	public String toString(){
		return "Студент - " + getFio()+", групи - "+ getGroup()+", має середній бал " + getAverageBal()+", прослухав - " + getNumberOfCourses()+" курсів. Знання ООП - "+oopKnowledgeLevel+", знання мережних технологій - "+networksKnowledgeLevel;
	}
	
	private int oopKnowledgeLevel;
	private int networksKnowledgeLevel;
}
