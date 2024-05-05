package PART_1;

public class Garbage_Collection_Example {
    public static void main(String[] args) {

        Collector some_object;

        for (int i = 0; i < 1000000000; i++) {
        some_object = new Collector("Some Object Created");
            System.out.println(some_object.name);
        }

    }
}

class Collector {
    String name;

    Collector(String name) {
        this.name = name;
    }

    // Annotation
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is Destroyed");
    }
}
