package oop2_1;
import java.time.LocalDate;

public class Student {
	protected int studentID;
	protected String studentName;
	protected String studentProgramme;
	protected LocalDate studentDateEnrolled;
	
	Student (int studentID ,String studentName, String studentProgramme, LocalDate studentDateEnrolled){
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentProgramme = studentProgramme;
		this.studentDateEnrolled = studentDateEnrolled;
	}

	

}
