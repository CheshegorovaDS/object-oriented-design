package check;

import user.User;

public class CheckPassword extends Check {

    public boolean check(User user) {
        System.out.println("Check accordance password.");
        //сверяеися с сервером
       if(!user.getPassword().equals("1234567")){
           System.out.println("Wrong password");
           return false;
       }else {
           return checkNext(user);
       }
    }
}
