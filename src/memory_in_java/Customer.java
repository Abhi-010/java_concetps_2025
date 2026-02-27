package memory_in_java;

public class Customer {
    private String name ;
    public Customer(String name){
        this.name = name ;
    }

    public void setName(String newName){
        this.name = newName ;
    }
    public String getName(){
        return this.name ;
    }
}
