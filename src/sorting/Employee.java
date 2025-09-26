package sorting;

public class Employee extends Person{
    Integer id;
    Double sal;


    public Employee(Integer id,String name,Double sal,Long mobileNo) {
        super(name, mobileNo);
        this.id = id;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", sal=" + sal +
                ", name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}
