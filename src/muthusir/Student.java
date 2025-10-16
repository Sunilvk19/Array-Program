package muthusir;

public class Student {
    private int studentId;
    private String studentName;
    private int studentAge;
    private float studentPercentage;

    public Student(int studentId, String studentName, int studentAge, float studentPercentage) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentPercentage = studentPercentage;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public float getStudentPercentage() {
        return studentPercentage;
    }

    public void setStudentPercentage(float studentPercentage) {
        this.studentPercentage = studentPercentage;
    }

    @Override
    public String toString() {
        return "Student[" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentPercentage=" + studentPercentage +
                ']';
    }
}
