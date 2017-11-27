package school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;
    private String gradeLevel;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
        numberOfCredits = numberOfCredits + courseCredits;
        // need to add grade points counter
        gpa = (courseCredits * grade)/numberOfCredits;
    }

    public String getGradeLevel() {
        if (numberOfCredits < 30){
            gradeLevel = "Freshman";
        } else if(numberOfCredits > 29 & numberOfCredits < 60){
            gradeLevel = "Sophomore";
        } else if(numberOfCredits > 59 & numberOfCredits < 90){
            gradeLevel = "Junior";
        } else {
            gradeLevel = "Senior";
        }
        return gradeLevel;
    }

    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + studentId;
        result = 31 * result + numberOfCredits;
        temp = Double.doubleToLongBits(gpa);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        //studentId = aStudentId;
        aStudentId = 0;

        if (aStudentId < 0) {
            throw new IllegalArgumentException("ID is invalid");
        }
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    protected int setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
        return aNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    protected double setGpa(double aGPA) {
        gpa = aGPA;
        return aGPA;
    }
}
