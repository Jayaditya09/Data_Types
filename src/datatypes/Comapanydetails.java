package datatypes;

import java.util.Scanner;

public class Comapanydetails {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		byte empId = 90;
        String empName = "Aditya";
        String empEmail ="b.jayadtya@gmail.com";
        long empPhoneno = 809695674;
        float empSalary = 4000.45f;
        char empGender='M';
        String empCity="Tirupathi";
        
        System.out.println("Id is "+empId);
        System.out.println("Name is "+empName);
        System.out.println("Email ID is "+empEmail);
        System.out.println("Contact No is "+empPhoneno);
        System.out.println("Salary is "+empSalary);
        System.out.println("Gender "+empGender);
        System.out.println("Place is "+empCity);
        
        for(int i=0;i<10;i++) {
        	System.out.println(i);
        }

	}

}
