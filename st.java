// Parent class

class Student {

 String name;
 int rollNumber;
 void setStudentData(String name, int rollNumber) {
   this.name = name;
   this.rollNumber = rollNumber;

}

void displayStudentData() {

    System.out.println("Name: " + name);
    System.out.println("Roll Number: " + rollNumber);

}

}

// Child class

class Marks extends Student {

   int marks;
   void setMarks(int marks) {
   this.marks = marks;

}

void displayMarks() {

   System.out.println("Marks: " + marks);

}

}

// Main class

public class st {

  public static void main(String[] args) {

   Marks student = new Marks();

// Set data

   student.setStudentData("Aashish", 101);
   student.setMarks(88);

// Display data

   student.displayStudentData();
   student.displayMarks();

}

}