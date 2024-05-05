package PART_1;

public class WrapperExample {
    public static void main(String[] args) {

        // In Java, everything is passed by values.
        int a = 12;
        int b = 11;

        swap(a, b); // {11 , 12} Swapped But Internally
        System.out.println(a + " " + b); // But originally it isn't swapped. { 12 , 11}, Because it is not an object is just passed by values.

        // Using Integer which is a wrapper class has comes with many method, Because it is an inbuilt java class. And we know that classes are the type object, But Integer class has Final keyword which indicates immutability but only with primitive datatype, not with referenced or object reference type.
        Integer num1 = 1;
        Integer num2 = 2;
        swap(num1, num2); // Swapped but internally.
        System.out.println(num1 + " " + num2); // So because of Final it isn't swapped;

        /* If we declare something with final then its always be same and can't to be
        changed or modified and must be initialized.
        Errors:
        - Cannot assign a value to final variable 'THOUSAND'
        - Variable 'THOUSAND' might not have been initialized
        */

        final int THOUSAND = 1000;

        // Making a object type final.
        final A adarsh = new A("Adarsh");
        System.out.println(adarsh.name);

        // Cannot assign a value to final variable 'adarsh'. If it is not declared then we can.
        // adarsh = new A("Random Name");

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // Inside the function it changed the value.
        System.out.println(a + " " + b);
    }
}

class A {
    final int num = 10;
    String name;

    A(String name) {
        this.name = name;
    }
}
