# Question 1 Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)

# Answer 1

```java
public class EnumDisplay {

    public static void main(String[] args) {
       for (Houses h : Houses.values()) {
           System.out.println("Price of " + h.name()+" house is "+h.getPrice());
       } 
    }

}

enum Houses {
    SMALL(500000), MEDIUM(800000), LARGE(900000), MANSION(10000000);

    private int price;

    Houses(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    
}
```

![photo3](./static/photo3.png) 

# Question 2 Create a User class with fields: firstname, lastname, age, phonenumber. Write a program which accepts values of user fields from commandline, create object and append that to a text file. After every user creation the program should prompt: "Do you want to continue creating users? (Type QUIT to exit)" and keep on accepting values and writing to file unitl user quits.

# Answer 2

### Java Code

```java

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sol2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File file = new File("sol2.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Failed to create file");
            e.printStackTrace();
        }
        do {
            try (var br = new BufferedWriter(new FileWriter(file,true))) {
                System.out.println("Create a new User.");
                System.out.print("Enter First Name : ");
                String firstName = input.nextLine();
                System.out.print("Enter Last Name : ");
                String lastName = input.nextLine();
                System.out.print("Enter Age : ");
                int age = input.nextInt();
                input.nextLine();
                System.out.print("Enter Phone Number : ");
                String number = input.nextLine();
                br.write(new User(firstName, lastName, age, number).toString());
                br.newLine();
                br.flush();
                System.out.print("Do you want to create another user ? Type QUIT to exit or Enter to keep creating new user: ");
                String line = input.nextLine();
                if (line.equalsIgnoreCase("QUIT")) {
                   break; 
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        } while (true);
        input.close();
    }

}

class User {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    public User(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phoneNumber="
                + phoneNumber + "}";
    }
}

```

###  Images
![photo1](./static/photo1.png) 
![photo1](./static/photo2.png) 


