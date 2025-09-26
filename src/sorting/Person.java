package sorting;

public class Person implements Comparable<Person>{
    String name;
    Long mobileNo;

    public Person(String name, Long mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
