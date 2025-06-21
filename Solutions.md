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

# Question 5 Create a class named Employee with fields firstname,lastname,age and designation. The class should: 1. have all types of constructors to initialize the object 2. class should also have setter methods to update a particular field 3. Override its toString method to display a meaningful message using all these fields.

# Answer 5

```java
    class Employee {
      private String firstName;
      private String lastName;
      private int age;
      private String designation;

      // Default Constructor
      public Employee() {
        firstName = "Sahil";
        lastName = "Jalandhara";
        age = 24;
        designation = "Software Developer Trainee";
      }

      // parameterized Constructor
      public Employee(String firstName, String lastName, int age,
                      String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
      }

      // copy Constructor
      public Employee(Employee other) {
        firstName = other.firstName;
        lastName = other.lastName;
        age = other.age;
        designation = other.designation;
      }

      public void setFirstName(String firstName) { 
          this.firstName = firstName; 
      }

      public void setLastName(String lastName) {
          this.lastName = lastName; 
      }

      public void setAge(int age) { 
          this.age = age; 
      }

      public void setDesignation(String designation) {
        this.designation = designation;
      }

      @Override
      public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee Name is : ")
            .append(firstName + " ")
            .append(lastName+ " \n")
            .append("Age is: ")
            .append(age+"\n")
            .append("Designation is: ")
            .append(designation);
        return sb.toString();
      }
    }
```

# Question 6 Implement a banking system using java. Create 3 sub class of Bank : SBI, BOI, ICICI Classes should have attributes like Name, headofficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate. All 3 should have following methods: 1. add getters and setters for the fields 2. print details of every bank (override toString)

# Answer 6

```java
    public abstract class Bank {
        String name;
        String headOfficeAddress;
        String chairmanName;
        int branchCount;
        double fdInterestRate;
        double personalLoanInterestRate;
        double homeLoanInterestRate;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getHeadOfficeAddress() {
            return headOfficeAddress;
        }
        public void setHeadOfficeAddress(String headOfficeAddress) {
            this.headOfficeAddress = headOfficeAddress;
        }
        public String getChairmanName() {
            return chairmanName;
        }
        public void setChairmanName(String chairmanName) {
            this.chairmanName = chairmanName;
        }
        public int getBranchCount() {
            return branchCount;
        }
        public void setBranchCount(int branchCount) {
            this.branchCount = branchCount;
        }
        public double getFdInterestRate() {
            return fdInterestRate;
        }
        public void setFdInterestRate(double fdInterestRate) {
            this.fdInterestRate = fdInterestRate;
        }
        public double getPersonalLoanInterestRate() {
            return personalLoanInterestRate;
        }
        public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
            this.personalLoanInterestRate = personalLoanInterestRate;
        }
        public double getHomeLoanInterestRate() {
            return homeLoanInterestRate;
        }
        public void setHomeLoanInterestRate(double homeLoanInterestRate) {
            this.homeLoanInterestRate = homeLoanInterestRate;
        }

        @Override
        public String toString() {
            return "Bank name = " + name + ", headOfficeAddress = " + headOfficeAddress + ", chairmanName = " + chairmanName
                    + ", branchCount =" + branchCount + ", fdInterestRate =" + fdInterestRate + ", personalLoanInterestRate = "
                    + personalLoanInterestRate + ", homeLoanInterestRate = " + homeLoanInterestRate;
        }

    }

    class SBI extends Bank{

         public SBI(String name, String headOfficeAddress, String chairmanName,
                   int branchCount, double fdRate, double personalLoanRate, double homeLoanRate) {
            this.name = name;
            this.headOfficeAddress = headOfficeAddress;
            this.chairmanName = chairmanName;
            this.branchCount = branchCount;
            this.fdInterestRate = fdRate;
            this.personalLoanInterestRate = personalLoanRate;
            this.homeLoanInterestRate = homeLoanRate;
        }

        @Override
        public String toString(){
            return " SBI Bank Details \n" + super.toString();
        }
    }

    class BOI extends Bank{

         public BOI(String name, String headOfficeAddress, String chairmanName,
                   int branchCount, double fdRate, double personalLoanRate, double homeLoanRate) {
            this.name = name;
            this.headOfficeAddress = headOfficeAddress;
            this.chairmanName = chairmanName;
            this.branchCount = branchCount;
            this.fdInterestRate = fdRate;
            this.personalLoanInterestRate = personalLoanRate;
            this.homeLoanInterestRate = homeLoanRate;
        }

        @Override
        public String toString(){
            return " BOI Bank Details \n" + super.toString();
        }
    }

    class ICICI extends Bank{

         public ICICI(String name, String headOfficeAddress, String chairmanName,
                   int branchCount, double fdRate, double personalLoanRate, double homeLoanRate) {
            this.name = name;
            this.headOfficeAddress = headOfficeAddress;
            this.chairmanName = chairmanName;
            this.branchCount = branchCount;
            this.fdInterestRate = fdRate;
            this.personalLoanInterestRate = personalLoanRate;
            this.homeLoanInterestRate = homeLoanRate;
        }

        @Override
        public String toString(){
            return " ICICI Bank Details \n" + super.toString();
        }
    }
```

# Question 7 WAP showing try, multi-catch and finally blocks.

# Answer 7

```java

public class MultiExcep {
    public static void main(String[] args) {
        String[] names = {"Alice", null, "Charlie"};

        try {
            int length = names[1].length(); // null error 
            int len = names[5].length(); // index out of bound
            System.out.println("Name length: " + length);

        } catch (NullPointerException e) {
            System.out.println("Caught error: " + e);
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Caught error: " + e);
        }finally {
            System.out.println("Finished checking name.");
        }
    }
}

```

# Question 8 WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
# Answer 8

```java

```
# Question 9 Create a custom exception that do not have any stack trace.

#  Answer 9

```java
public class Sol9 {
    public static void main(String[] args) {

        try {
            new CustomException("Caused Error ");
        } catch (CustomException e) {
            e.printStackTrace();
        } 
    }
}

class CustomException extends RuntimeException {

    public CustomException(String message){
        // calling constructor of RuntimeException class with parameter (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
        super(message,null,false,false);
    }
}


```
