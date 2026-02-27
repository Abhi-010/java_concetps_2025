package internals_hashmap;

public class Customer {
    private String name ;
    private long id ;


    public Customer(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Customer c2){
        if(this.id != c2.id){
            return false;
        }
        return true;
    }

    public int hashCode(){
        return (int)id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
