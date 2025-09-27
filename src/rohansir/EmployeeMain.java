package rohansir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(23,"chetan",8.7));
        list.add(new Employee(28,"harish",7.7));
        list.add(new Employee(17,"rohan",6.0));

        Comparator<Employee> emp = (s1,s2) -> Integer.compare(s1.getId(),s2.getId());
        Collections.sort(list,emp);

        for(Employee em : list){
            System.out.println(em);
        }
    }
}
