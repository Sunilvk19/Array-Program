package sorting;

import java.util.ArrayList;
import java.util.Comparator;

public class PersonMain {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee(25,"RohanSir",200000.0,9876543210L));
        people.add(new Student("Rakesh",980765434L,21,78.4));
        people.add(new Student("Vinay",9087665412L,27,89.9));
        people.add(new Employee(29,"Raghu sir",9000000.0,8765432908L));

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1 instanceof Employee && p2 instanceof Student) {
                    return Integer.compare(((Employee) p1).id, ((Student) p2).rollNo);
                } else if (p1 instanceof Student && p2 instanceof Employee) {
                    return Integer.compare(((Student) p1).rollNo, ((Employee) p2).id);
                }
                else if(p1 instanceof Student && p2 instanceof Student){
                    return Integer.compare(((Student)p1).rollNo,((Student)p2).rollNo);
                }
                return ((Employee)p1).id.compareTo(((Employee)p2).id);
            }
        });
        for(Person per : people){
//            if(per instanceof Student st){
//                System.out.println("Student "+st.name+".RollNo: "+st.rollNo);
//            } else if (per instanceof Employee em) {
//                System.out.println("Employee Name: "+em.name+"Employee Id: "+em.id);
//            }

            System.out.println(per);
        }
    }
}
