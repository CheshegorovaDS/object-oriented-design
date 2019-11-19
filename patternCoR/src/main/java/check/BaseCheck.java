package check;

import user.User;

import java.util.regex.Pattern;

public class BaseCheck extends Check{

    public boolean check(User user) {
        System.out.println("Check email and length password");
        if(!checkEmail(user.getEmail())){
            System.out.println("Wrong email.");
            return false;
        }
        if(!checkPassword(user.getPassword())){
            System.out.println("Wrong password");
            return false;
        }
        return checkNext(user);
    }

    private boolean checkEmail(String email){
        String checkLogin = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
        return Pattern.matches(checkLogin, email);
    }

    private boolean checkPassword(String pass){
        return pass.length()>6;
    }

}
