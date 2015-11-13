package com.afroz.third;

public class StudentService {
	int top = 0;
	Student[] students;
	
	public StudentService() {
		students = new Student[]{};
	}
	
	public String addStudent(Object o){
		Student s = (Student) o;
		students[top] = s;
		top++;
		return "Added";
	}
	
	public Student[] getStudents(){
		return students;
	}
	
	public String removeStudent(int i){
		students[i]=new Student();
		return "removed";
	}
}