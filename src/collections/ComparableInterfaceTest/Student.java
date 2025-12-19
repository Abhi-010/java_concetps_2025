package collections.ComparableInterfaceTest;

public class Student implements Comparable<Student> {

    private String name ;
    private int age ;
    private int roll_no ;

    public Student(int age, String name, int roll_no) {
        this.age = age;
        this.name = name;
        this.roll_no = roll_no;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public int compareTo(Student that) {
        if(this.age < that.age){
            return -1 ;
        }
        else if(this.age > that.age){
            return 1;
        }
        else {
            if(this.roll_no < that.roll_no){
                return -1;
            }
            else{
                return 1;
            }
        }
    }

    @Override
    public String toString() {
        return "comparator.Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }
}
