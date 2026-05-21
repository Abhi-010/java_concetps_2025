package abstract_class_interfaces.interfaces.natwest;

public class Client {
    public static void main(String[] args) {
        ABCServiceImpl abcService = new ABCServiceImpl();
        abcService.absMethod();
        abcService.defMethod();
        abcService.newDefMethod();
    }
}
