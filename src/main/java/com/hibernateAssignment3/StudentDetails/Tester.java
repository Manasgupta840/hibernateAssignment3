package com.hibernateAssignment3.StudentDetails;

import java.util.Scanner;

import PStudentDAO.StudentDAO;
import pStudent.Student;

/**
 * Hello world!
 *
 */
public class Tester 
{
    public static void main( String[] args )
    {
    	try {
//			
    		Student st1 = new Student();

    		st1.setName("Thomas Varghese");
	    	st1.setAge(12);
	    	st1.setClassSection("6A");
	    	st1.setAddress("Trivandrum");
	    	
//	    	//Second Student
	    	Student st2 = new Student();
//	    	
    		st2.setName("Hari Krishna");
	    	st2.setAge(12);
	    	st2.setClassSection("6A");
	    	st2.setAddress("Kollam");
	    	
	    	//third Student
	    	Student st3 = new Student();
//	   
    		st3.setName("Arjun Varma");
	    	st3.setAge(12);
	    	st3.setClassSection("6A");
	    	st3.setAddress("Trivandrum");
	    	
	    	StudentDAO st = new StudentDAO();
	    	st.addDetails(st1);
	    	st.addDetails(st2);
	    	st.addDetails(st3);
	    	System.out.println(st1);
	    	System.out.println(st2);
	    	System.out.println(st3);
	    	
//	    
	    	System.out.println(st.getDetails(st2.getRollNo()));
	    	System.out.println(st.getDetails(st3.getRollNo()));
	    	
	    	
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}
