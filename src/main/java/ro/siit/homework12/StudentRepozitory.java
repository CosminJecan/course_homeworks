package ro.siit.homework12;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class StudentRepozitory {
     static List<Student> studentsList;

     static void addStud(Student student) throws TratareExceptii {
         if(student.firstName.trim() == "" || student.lastName.trim() == "") throw new
                 TratareExceptii("Numele trebuie sa contina cel putin o litera!");
         if(student.gender.trim().equalsIgnoreCase("m") == false &&
                 student.gender.trim().equalsIgnoreCase("f") == false &&
                 student.gender.trim().equalsIgnoreCase("male") == false &&
                 student.gender.trim().equalsIgnoreCase("female") == false) throw new
                 TratareExceptii("Format invalid pentru sex!");
         if(parseData(student.dateOfBirth) <= 1900 ||
                 parseData(student.dateOfBirth) > Calendar.getInstance().get(Calendar.YEAR)) throw new
                 TratareExceptii("An nastere introdus gresit!");
         if (student.cnp.length() != 13) throw new TratareExceptii("CNP invalid! Diferenta lungime CNP = " +
                 (student.cnp.length()-13) + " cifre.");

         studentsList.add(student);
         System.out.println(student);
    }

    public static int parseData(String dateOfBirth){
        int anNastere = Integer.parseInt(dateOfBirth.substring(6));
         try{

             if(anNastere >= 0);
         } catch (NumberFormatException nfe) {
             System.out.println("Anul este negativ ! " + nfe);
         }

        return anNastere;
    }



    static void deleteStud(Student student) throws TratareExceptii {
        if(student.cnp.isEmpty()) throw new TratareExceptii("Studentul cautat nu exista!");

//        if(student.cnp == )
        studentsList.remove(student);
        System.out.println(student);
    }

     public static void main(String[] args) {
        studentsList = new ArrayList<>();

            Student s1 = new Student("e", "ert", "12.08.2010", "female","1123456789127");
            Student s2 = new Student("lok", "r", "01.12.1904","M","2345678912345");
            Student s3 = new Student("tyu", "adfsg", "01.12.1989","M","2225678912345");


        try {
            addStud(s1);
            addStud(s2);
            addStud(s3);
            deleteStud(s2);

        } catch (TratareExceptii msg){
            System.out.println("Invalid operation: " +   msg.getMessage());
        }


//        for (Student student: studentsList) {
//            System.out.println(student);
//        }


     }
}
