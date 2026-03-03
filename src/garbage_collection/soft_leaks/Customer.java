package garbage_collection.soft_leaks;

public class Customer {
    private String name ;
    private int id ;

    public void setId(int id) {
        this.id = id;
    }

    public Customer(String name){
        this.name = name ;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
