package sorting;

public class Student extends Person{

    Integer rollNo;
    Double marks;

    public Student(String name, Long mobileNo, Integer rollNo, Double marks) {
        super(name, mobileNo);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}
