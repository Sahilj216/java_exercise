public class CombinedExceptionDemo {

    public static void main(String[] args) {

        // 1. ClassNotFoundException (Checked Exception)
        try {
            Class.forName("com.example.RandomClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException:");
            System.out.println(e);
        }

        // 2. NoClassDefFoundError (Unchecked Error)
        try {
            Cat cat = new Cat();
            cat.display();
        } catch (NoClassDefFoundError e) {
            System.out.println("Caught NoClassDefFoundError:");
            System.out.println(e);
        }
    }
}

// delete Cat.class after compilation and before running the main class
class Cat {
    public void display() {
        System.out.println("Cat class is available at runtime");
    }
}

