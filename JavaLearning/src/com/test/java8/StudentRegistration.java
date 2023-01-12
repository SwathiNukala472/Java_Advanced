package com.test.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRegistration {

	class RegistrationPortal{
		List<Student> list;
		
		void RegistrationPortal() {
			list=Collections.synchronizedList(new ArrayList<Student>());
		}
		RegistrationPortal getRegistrationPortal() {
			return new RegistrationPortal();
		}
		void register(Student student) {
			list.add(student);
		}
		List<Student> getRegisteredStudents(){
			return list;
		}
	}
	public class Student{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
