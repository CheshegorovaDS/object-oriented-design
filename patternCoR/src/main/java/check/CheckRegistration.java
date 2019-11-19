package check;

import user.User;

import java.util.regex.Pattern;

public class CheckRegistration extends Check {

    public boolean check(User user) {
        System.out.println("Check phone number.");
        String checkPhone = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
        if(!Pattern.matches(checkPhone, user.getPhone())){
            System.out.println("Wrong phone");
            return false;
        }
        return checkNext(user);
    }
}
