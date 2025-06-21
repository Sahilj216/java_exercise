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

# Question 3  Write a java program to show following menu to the user: Menu 1. Calculate Area of Circle 2. Calculate Circumference of a Circle 3. Exit. Choose an option (1-3): Take radius as user input. Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static

# Answer 3

```java
    import java.util.Scanner;

    public class MenuClass {

        public static void main(String[] agrs) {
            Scanner inp = new Scanner(System.in);
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of Circle");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int val = inp.nextInt();
            if (val == 3) {
                System.out.println("Exit Program");
                inp.close();
                return;
            }

            double radius;

            do {
                System.out.print("Enter value of radius: ");
                if (inp.hasNextDouble()) {
                    radius = inp.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid Input please enter a number.");
                    inp.next();
                }
            } while (true);

            switch (val) {
                case 1:
                    System.out.printf("Area of Circle is : %.3f", calArea(radius));
                    System.out.println();
                    break;
                case 2:
                    System.out.printf("Circumference of Circle is : %.3f", calCircumference(radius));
                    System.out.println();
                    break;
            }

            inp.close();
        }

        public static double calCircumference(double radius) {
            return Math.PI * radius;
        }

        public static double calArea(double radius) {
            return Math.PI * radius * radius;
        }
    }
```

# Question 4 Create a two dimensional array of integers and display: 1. sum of all elements of each column 2. sum of all elements of each row

# Answer 4

```java
    public class TwoD {

      public static void main(String[] agrs) {
        int[][] twoD = {{2, 3, 4}, {5, 4, 2}, {10, 3, 5}};
        int row = twoD.length;
        int col = twoD[0].length;
        colSum(twoD, row, col);
        rowSum(twoD, row, col);
      }

      public static void colSum(int[][] arr, int row, int col) {
        for (int i = 0; i < col; i++) {
          int sum = 0;
          for (int j = 0; j < row; j++) {
            sum += arr[j][i];
          }
          System.out.printf("Sum of %d column elements : %d", i + 1, sum);
          System.out.println();
        }
      }

      public static void rowSum(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
          int sum = 0;
          for (int j = 0; j < col; j++) {
            sum += arr[i][j];
          }
          System.out.printf("Sum of %d row elements : %d", i + 1, sum);
          System.out.println();
        }
      }
    }
```
