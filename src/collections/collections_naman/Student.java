package collections.collections_naman;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(){

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age){
            return 1 ;
        }
        else if(this.age < that.age){
            return -1 ;
        }
        return 0 ;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

