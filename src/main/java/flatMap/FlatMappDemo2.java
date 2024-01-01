package flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class student
	{
		int sid;
		String sname;
		char grade;
		
		student(int sid, String sname, char grade)
		{
			this.sname=sname;
			this.grade=grade;
			this.sid=sid;
		}
		
	}


public class FlatMappDemo2 {	

	public static void main(String[] args) {

		List<student> studentList = new ArrayList<student>();
		studentList.add(new student(101, "Smith", 'A'));
		studentList.add(new student(102, "Tom", 'B'));
		studentList.add(new student(103, "Skinner", 'A'));
		studentList.add(new student(104, "Martha", 'C'));
		
		List<student> studentList1 = new ArrayList<student>();
		studentList1.add(new student(105, "Goldsmith", 'A'));
		studentList1.add(new student(106, "Rockson", 'B'));
		studentList1.add(new student(107, "Ampadu", 'A'));
		studentList1.add(new student(108, "Foyoo", 'C'));
		List<List<student>> grandList = Arrays.asList(studentList,studentList1);
		
		//Before java 8
		for(List<student> s: grandList)
		{
			for(student stu:s)
			{
				System.out.println(stu.sname);
			}
		}
		
		//Using streams
		
		List<String> studentNames = grandList.stream().flatMap(s->s.stream()).map(p->p.sname).collect(Collectors.toList());
		
		System.out.println(studentNames);
		

	}

}
