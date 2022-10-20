package com.exam;

import java.util.Scanner;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMgt {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure(); 
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
	
	        // Creating Scanner Object to read input
	        Scanner input = new Scanner(System.in);
	 
	        // Creating option integer variable
	        int option = 0;
	 
	        // Do - While loop
	        do {
	            menu();
	            option = input.nextInt();
	 	            // Switch case
	            switch (option) {
	 
	            // Case 1
	            case 1:
	               Student st1=new Student();
	                System.out.print(" Student id : ");
	                 int id = input.nextInt();
	                 st1.setSid(id);
	                 
	                 System.out.print(" Student Name : ");
	                 String name= input.next();
	                 st1.setSname(name);
	                 
	                 System.out.print(" Student Age : ");
	                 int age= input.nextInt();
	                 st1.setAge(age);
	                 
	             
	                System.out.print("Student contact Number : ");
	                String contact=input.next();
	                st1.setContact(contact);
	                Transaction t=session.beginTransaction();
	                session.save(st1);
	                t.commit();
	                break;
	 
	            // Case 2
	            case 2:
	 
	                // Display message
	                System.out.print(" Student id to be deleted : ");
	                int  sid = input.nextInt();
	                Student st2=session.get(Student.class, sid);
	                Transaction t1=session.beginTransaction();
	                session.delete(st2);
	                t1.commit();
	                break;
	 
	            // Case 3
	            case 3:
	 
	               
	              
	                break;
	 
	            // Case 4
	            case 4:
	 
	              
	                break;
	 
	            // Case 5
	            case 5:
	                break;
	 
	            // Case 6
	            case 9:
	 
	                // Display message
	                System.out.println(
	                    "\nThank you for using the program. Goodbye!\n");
	                System.exit(0);
	 
	                break;
	 
	            // Case 7: Default case
	            // If none above case executes
	            default:
	 
	                // Print statement
	                System.out.println("\nInvalid input\n");
	                break;
	            }
	        }
	 
	        // Checking condition
	        while (option != 9);
}
	 
	    // Method 2
	    // Menu - Static menu for displaying options
	    public static void menu()
	    {
	 
	        // Printing statements displaying menu on console
	        System.out.println("MENU");
	        System.out.println("1: Add Student");
	        System.out.println("2: Delete Student");
	        System.out.println("3: Update Student");
	        System.out.println("4: Search Student");
	        System.out.println("5: Display Students");
	        System.out.println("9: Exit program");
	        System.out.print("Enter your selection : ");
	    }

	

}
