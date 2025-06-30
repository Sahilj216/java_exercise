public class Answer1 {

    private static String firstName;
    private static String lastName;
    private static int age = 20;

    static {
        firstName = "Sahil";
        System.out.println("First Name: " + firstName + " (via static block)");
    }

    static void printLastName() {
        lastName = "Jalandhara";
        System.out.println("Last Name: " + lastName + " (via static method)");
    }

    public static void main(String[] args) {
        printLastName();
        System.out.println("Age: " + age + " (via static variable)");
    }
}

