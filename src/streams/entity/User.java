package streams.entity;

public class User {
    private long id;
    private String name;
    private String region ;

    public User(long id, String name,String region) {
        this.id = id;
        this.name = name;
        this.region = region ;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegion(){
        return region ;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
