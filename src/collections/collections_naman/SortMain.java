package collections.collections_naman;

public class SortMain {
    public static void main(String[] args) {

        String json = "{\"hello\":\"world\",\"hi\":\"hello\",\"you\":\"me\"}" ;

        System.out.println(json.substring(1, json.length() - 1));

        //System.out.println(json.substring(0));

        String[] keyValuePairs = json.substring(1, json.length() - 1).split(",");

        System.out.println("key value pairs");
        for(String s : keyValuePairs){
            System.out.println(s);
        }

    }
}
