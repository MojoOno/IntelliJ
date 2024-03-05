//Because we have used ArrayLists and Random we have to import those in the global scope

import java.util.ArrayList;
import java.util.Random;

//Our main class
public class Main {
    //Our main method
    public static void main(String[] args) {
        //We're making an ArrayList containing the names of our students.
        ArrayList<String> studentNames = new ArrayList<>();
        //Adding names to our studentNames ArrayList
        studentNames.add("Franck");
        studentNames.add("Arendt");
        studentNames.add("Ottesen");
        studentNames.add("Jones");
        studentNames.add("Bødlen");
        studentNames.add("Bergli");
        //As an exercise we removed the last student on the list by his index number
        studentNames.remove(5);
        //Printing the names of our studentNames ArrayList
        printStudentNames(studentNames);
        //Initializing our grades ArrayList to our RandomGrades method + printing it
        ArrayList<Integer> grades = generateRandomGrades(studentNames);
        System.out.println("Generated grades: " + grades);
        //We're initializing a variable called averageGrade by setting it to our method
        double averageGrade = calculateAverageGrade(grades);
        System.out.println("Average grade: " + averageGrade);
        //Adding a "sout" in order to add a new line.
        System.out.println();

        //We're setting our studentList array equal to our createStudentList ArrayList
        ArrayList<Student> studentList = createStudentList();
        //Calling our method to print info of the students inside our studentList ArrayList above
        printStudentInfo(studentList);


    }

    private static ArrayList<Student> createStudentList() {
        ArrayList<Student> students = new ArrayList<>();

        //Creating a new Student, in this case, called john to our "ArrayList students"
        Student franck = new Student("Franck", 1);
        franck.enrollInCourse("Matematik");
        franck.enrollInCourse("Dansk");
        students.add(franck);

        //We're doing the same but with a new student
        Student arendt = new Student("Arendt", 2);
        arendt.enrollInCourse("Matematik");
        arendt.enrollInCourse("Engelsk");
        students.add(arendt);

        Student ottesen = new Student("Ottesen", 3);
        ottesen.enrollInCourse("Matematik");
        ottesen.enrollInCourse("Spansk");
        students.add(ottesen);

        Student jones = new Student("Jones", 4);
        jones.enrollInCourse("Matematik");
        jones.enrollInCourse("Spansk");
        students.add(jones);

        Student bødlen = new Student("Bødlen", 5);
        bødlen.enrollInCourse("Matematik");
        bødlen.enrollInCourse("Dansk");
        students.add(bødlen);
        //Because our return type is an array list, we must return an array list
        return students;
    }

    private static void printStudentInfo(ArrayList<Student> students) {
        System.out.println("Student information: ");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getID());
            System.out.println("Enrolled courses :" + student.getCourses());
            System.out.println();
        }

    }

    private static double calculateAverageGrade(ArrayList<Integer> grades) {
        //A fail safe if statement, that returns 0.0 in case our grades AL is empty
        if (grades.isEmpty()) {
            return 0.0;
        }
        //Sum variable is default = 0
        int sum = 0;
        for (int grade : grades) {
            //We then says sum = sum + grade in order to get the add all the grades together (1/2)
            sum += grade;
        }
        //before returning the average by dividing the sum with all the grades in the array (2/2
        return (double) sum / grades.size();

    }

    private static ArrayList<Integer> generateRandomGrades(ArrayList<String> names) {
        ArrayList<Integer> grades = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < names.size(); i++) {
            // Generate a random number between 0 - 100
            int randomGrade = random.nextInt(101);
            grades.add(randomGrade);
        }
        return grades;
    }

    private static void printStudentNames(ArrayList<String> names) {
        System.out.println("Student Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
