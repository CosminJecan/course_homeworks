package ro.siit.homework12;


public class Student {
      String firstName;
      String lastName;
      String dateOfBirth;
      String gender;
      String cnp;


    public Student(String firstName, String lastName, String dateOfBirth, String gender, String cnp) {
        this(cnp);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;

    }

    public Student(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", cnp='" + cnp + '\'' +
                '}';
    }
}