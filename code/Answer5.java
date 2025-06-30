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
                .append(lastName + " \n")
                .append("Age is: ")
                .append(age + "\n")
                .append("Designation is: ")
                .append(designation);
        return sb.toString();
    }
}
