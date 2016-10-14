import com.tw.rs.model.User;
import com.tw.rs.service.UserService;

import java.util.List;

/**
 * Created by zhyingjia on 16-10-14.
 */
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        List<User> users = userService.findAllUsers();
        users.forEach(System.out::println);
//        users.forEach(item -> System.out.println(item));
    }
}
