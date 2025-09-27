package rohansir;

public class Employee {
    Integer id;
    String empName;
    Double sal;

    public Employee(Integer id, String empName, Double sal) {
        this.id = id;
        this.empName = empName;
        this.sal = sal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", sal=" + sal +
                ']';
    }

}
