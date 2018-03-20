package javacourses;

public class Person {
    private static int counter = 0;
    private int id;
    private String firstname;
    private String LastName;
    private String Phone;

    public Person() {
        counter++;
        id = counter;
        //   System.out.println("I'm a new person"); sout
    }

    public int getId() {
        return id;
    }

    public String getfirstname() {
        return firstname;
    }

    public void setFirstname(String Firstname) {
        this.firstname = Firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
