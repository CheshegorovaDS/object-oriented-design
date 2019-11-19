package check;

import user.User;

public class CheckRequest extends Check {

    private long timeFirstRequest;
    private int request;
    private long currentTime;

    public CheckRequest(long timeFirstRequest) {
        this.timeFirstRequest = timeFirstRequest;
        this.currentTime = System.currentTimeMillis();
    }

    public boolean check(User user) {
        System.out.println("Check count of request.");
        if (System.currentTimeMillis() > timeFirstRequest + 60000) {
            request = 0;
            timeFirstRequest = System.currentTimeMillis();
        }

        request++;

        if (request > 5) {
            System.out.println("Request limit exceeded!");
            return false;
        }
        return checkNext(user);
    }

}
