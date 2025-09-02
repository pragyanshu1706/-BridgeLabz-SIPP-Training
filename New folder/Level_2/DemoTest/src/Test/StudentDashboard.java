package Test;
import java.util.*;
public class StudentDashboard {

	String name;
	int id;
	Map<String, Integer> subjectMarks;
	
	public StudentDashboard(String name, int id, Map<String, Integer> subjectMarks) {
		this.name=name;
		this.id=id;
		this.subjectMarks=subjectMarks;
	}
	
	public int getTotalMarks() {
		int totalMarks=0;
		for(int marks:subjectMarks.values())
			totalMarks+=marks;
		return totalMarks;
	}
	
	
	
	void mergeSort() {
		
	}

	
	public static void main(String[] args) {
		
	}

}
