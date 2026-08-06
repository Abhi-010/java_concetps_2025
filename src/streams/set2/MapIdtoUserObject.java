package streams.set2;

import streams.entity.User;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapIdtoUserObject {
    public static void main(String[] args) {
        List<User> userList = User.getListOfUser() ;

        Map<Long,List<User>> map = userList.stream()
                .collect(Collectors.groupingBy(User::getId)) ;

        map.forEach((key,value) -> System.out.println(key + ":" + value));

        map.forEach((key, value) -> System.out.println(key + ":" + value));

    }
}
