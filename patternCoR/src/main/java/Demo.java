import check.*;
import user.User;

public class Demo {

    public static void main(String[] args){
        Check c = new BaseCheck();

        //при регистрации
        String email = "ggg@mail.ru";
        String password = "1234567";
        String phone = "8 913 100 10 10";
        User user =  new User("Boris",email,phone,18);
        user.setPassword(password);
        System.out.println("Registration");
        c.setNext(new CheckRegistration());
        c.check(user);
        System.out.println("----------------------------------------");
        //при входе в личный кабинет
        Check login = new BaseCheck();

        login.setNext(new CheckRequest(System.currentTimeMillis())).setNext(new CheckPassword());
        login.check(user);
        System.out.println("----------------------------------------");
        for(int i = 0; i<7;i++){
            System.out.println("Iteration "+(i+2));
            login.check(user);
            System.out.println("----------------------------------------");
        }

    }
}
