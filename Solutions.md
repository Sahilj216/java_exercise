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
# Question 2 Write a program to read user input until user writes XDONE and then show the entered text by the user on command line 

# Ans 2

```java
    import java.util.Scanner;

    public class Input {

      public static void main(String[] agrs) {

        Scanner inp = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Enter input , type XDONE to terminate");
        do {
          String line = inp.nextLine();
          if (line.contains("XDONE")) {
            int idx = line.indexOf("XDONE");
            sb.append(line, 0, idx);
            break;
          }
          sb.append(line).append("\n");
        } while (true);

        inp.close();
        System.out.println();
        System.out.println(sb.toString());
      }
    }

```
