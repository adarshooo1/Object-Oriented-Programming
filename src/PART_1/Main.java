package PART_1;

public class Main {
    public static void main(String[] args) {

        //  Creating a Data-structure which store name of 5 students:
        int[] name = new int[5];

        //  Creating a Data-structure which store marks of 5 students:
        float[] marks = new float[5];


        //  Create a Data-structure which store the students data: (roll number, name, marks)
        Student student1 = new Student();
        System.out.println(student1.rno + ", " + student1.name + " & " + student1.marks);

    /*  # new :
        new is a keyword which helps to create a new object, or in-case if the class is not static then
        creating an object inside a static class with the help of non-static classes then new keyword helps to use that
        non-static class.

        # Constructor:
        Example:- student(): This refers to constructors basically defines what happen when object is created.
        - By default constructor is special function which is empty.

    */
        student1.rno = 1;
        student1.name = "Adarsh";
        student1.marks = 33.33f;

        System.out.println(student1.rno); //output: 1
        System.out.println(student1.name); //output: Adarsh
        System.out.println(student1.marks); //output: 33.33

        Student student2 = new Student(2, "Anshu", 12.55f);
        System.out.println(student2.rno + ", " + student2.name + " & " + student2.marks); // output: 2, Anshu & 12.55

        // Accessing student class default function:
        student2.greeting(); // output: Hello Anshu

        // Access Name changing function:
        student2.changeName("Anshuman");
        System.out.println(student2.name); // output: Anshuman

        // Accessing method which takes object as argument and amke a copy of that object:
        Student student_2_copy = new Student(student2);
        System.out.println(student_2_copy.rno + ", " + student_2_copy.name + " & "+ student_2_copy.marks);

        // Passing the reference isn't the copy of the existing object or student. It is just simply pointing to the same object but with a different names.
        Student reference_Student = student_2_copy;
        System.out.println(reference_Student.name);

        // Trying to making changes in the student_2_copy with the help of reference_student which calling change name method.
        reference_Student.changeName("Kyle");

        System.out.println(student_2_copy.name); //output: Kyle
        System.out.println(reference_Student.name); //output: Kyle






    }
}

// Created a Student Class:
// - Has some properties through which we can pass a student those properties.
// - Classes is an Object in Java.
// - Variables inside a class aka instance variable.
class Student {
    int rno;
    String name;
    float marks;
    // 1.
    //  Default Constructor
    //  Student(){}

    // 2.
    // Return type is the class name itself which takes 3 argument as default.
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    // 3.
    // It is an inbuilt method inside this class to greet.
    void greeting() {
        System.out.println("Hello " + this.name);
    }

    // 4.
    // It is an update name method inside the class,
    void changeName(String new_Name){
        this.name = new_Name;
    }

    // 5.
    // Make copy of the existing student;
    Student(Student student_object) {
        this.rno = student_object.rno;
        this.name = student_object.name;
        this.marks = student_object.marks;
    }

    // 6.
    // Constructor Chaining || Calling a constructor inside a constructor:
    Student(){
        //Calling constructor which takes 3 arguments:
        this(0, null, 0.0f);
    }
}