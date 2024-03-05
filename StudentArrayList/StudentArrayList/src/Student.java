import java.util.ArrayList;

public class Student {
    //Name is set to private and we will therefore need a getter method to retrieve it
    private String name;
    //Same with ID here as name
    private int ID;
    private ArrayList<String> coursesList;

    //Our student constructor that takes 2 parameters and initializes coursesList to a new ArrayList
    public Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
        this.coursesList = new ArrayList<>();

    }

    //Adds the course to our courseList ArrayList
    public void enrollInCourse(String courseName) {
        coursesList.add(courseName);
    }

    //A getter method to retrieve name, as name is set as private
    public String getName() {
        return this.name;
    }

    //Same ass getName
    public int getID() {
        return this.ID;
    }

    //Same as the two getters above
    public ArrayList<String> getCourses() {
        return coursesList;
    }

}
