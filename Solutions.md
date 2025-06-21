# Question 1 Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.

# Ans 1.
```java
   public class Sol1{

        private static String firstName;
        private static String lastName;
        private static int age = 20;

        static{
            firstName = "Sahil";
            System.out.println("First Name:"+ firstName +" is printed using static block");
        }

        static void printLastName(){
            lastName = "Jalandhara";
            System.out.println("Last Name:"+ lastName +" is printed using static method");
        }

        public static void main(String[] agrs){
            // static block run automatically when class is loaded
                
            // printing last name using static method
            printLastName();

            // printing age through static variable
            System.out.println("Age is " + age);
        }

   }
```
