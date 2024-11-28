// Create a class Student that stores rollno and name with member functions getData() and 
// putData(). From this derive a class Test with data members mark1 and mark2 and member 
// functions getMarks() and putMarks(). Create an interface Sports that stores sport’s mark in
// data member sportMark. From Test and Sports classes derive the class Result that stores 
// total mark in data member total. Write a program to test the class.

import java.util.*;
class Student {
    int rollNo;
    String name;

    public void getData(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void putData() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class Test extends Student {
    double mark1;
    double mark2;

    public void getMarks(double m1, double m2) {
        mark1 = m1;
        mark2 = m2;
    }

    public void putMarks() {
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}

interface Sports {
    double sportMark = 0;  // Data member to store sport mark

    // Method to get sport mark
    void getSportMark(double sportM);

    // Method to display sport mark
    void putSportMark();
}

// Class Result inheriting from Test and implementing Sports
class Result extends Test implements Sports {
    double sportMark;
    double total;

    public void getSportMark(double sportM) {
        sportMark = sportM;
    }


    public void putSportMark() {
        System.out.println("Sports Mark: " + sportMark);
    }

    public void calculateTotal() {
        total = mark1 + mark2 + sportMark;
        System.out.println("Total Marks: " + total);
    }
}

public class StudentInfo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Result studentResult = new Result();

        System.out.println("Enter roll no. ");
        int rollno=s.nextInt();

        System.out.println("Enter name  ");
        String name=s.next();

        System.out.println("Enter mark-1 ");
        double m1=s.nextDouble();

        System.out.println("Enter mark-2 ");
        double m2=s.nextDouble();

        System.out.println("Enter Sports mark ");
        double sm=s.nextDouble();


        studentResult.getData(rollno,name);
        studentResult.getMarks(m1,m2);
        studentResult.getSportMark(sm);

        // Displaying the student's details and marks
        studentResult.putData();
        studentResult.putMarks();
        studentResult.putSportMark();

        // Calculating and displaying the total marks
        studentResult.calculateTotal();
        s.close();
    }
}
