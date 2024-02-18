// package OOPS;

class Student{
    int sid; // instance variable 
    String Name; // instance variable --> memory will be allocated as per the object creation

    static String country = "India";  // It is a static variable memory is allocated only once

    // Instance Blkock
    {
        System.out.println("Instance Block");
    }

    static{
        System.out.println("Static Block");
    }

    // constructor

    Student(){
        System.out.println("This is a Default Constructor...");
    }

    Student(int x){
        System.out.println("Constructor with parameter" + x);
    }

    void showDetails(){
        System.out.println("This is instance method");
    }

    static void showFeeDetails(){
        System.out.println("This is static method in student class");
    }
}

public class hello {
    public static void main(String[] args) throws Exception{
        
        // Student s1 = new Student();
        // Student s2 = new Student();

        // System.out.println(Student.country);

        Student s3 = new Student();
        // Student s4 = new Student(10);

        s3.showDetails();
        // Student.showFeeDetails();

        // Class.forName("OOPS.Student");
    }
}
