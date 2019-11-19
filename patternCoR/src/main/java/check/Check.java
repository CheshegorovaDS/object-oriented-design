package check;

import user.User;

public abstract class Check {
    private Check next;

    /**
     * Помогает строить цепь из объектов-проверок.
     */
    public Check setNext(Check next) {
        this.next = next;
        return next;
    }

    /**
     * Подклассы реализуют в этом методе конкретные проверки.
     */
    public abstract boolean check(User user);

    /**
     * Запускает проверку в следующем объекте или завершает проверку, если мы в
     * последнем элементе цепи.
     */
    protected boolean checkNext(User user) {

        if (next == null) {
            System.out.println("Successful check.");
            return true;
        }

        return next.check(user);
    }
}
