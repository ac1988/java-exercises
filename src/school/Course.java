package school;

public class Course {

    private String courseName;
    private Student[] students;
    private int capacity;
    private int currentEnrollment;

    public Course(String courseName, int capacity){
        this.courseName = courseName;
        this.capacity = capacity;
        students = new Student[capacity];
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int aCapacity) {
        capacity = aCapacity;
    }

    public boolean addStudent(Student s) {
        if (currentEnrollment >= capacity) {
            currentEnrollment++;
            return true;
        }
        else {
            return false;
        }
    }

    public void removeStudent(Student s) {
        currentEnrollment--;
    }

}
