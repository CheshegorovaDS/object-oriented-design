package history;

import command.Command;
import java.util.Stack;

public class History {
    private Stack<Pair> history = new Stack<>();

    private class Pair {
        Command command;
        Memento memento;
        Pair(Command c, Memento m) {
            command = c;
            memento = m;
        }

        private Command getCommand() {
            return command;
        }

        private Memento getMemento() {
            return memento;
        }
    }


    public void push(Command c, Memento m) {
        history.add(new Pair(c, m));
        System.out.println("Add in history command " + c.getName());
    }

    public boolean undo() {
        Pair pair = history.pop();
        if (pair == null) {
            return false;
        }
        System.out.println("Undoing: " + pair.getCommand().getName());
        pair.command.undo();
        pair.getMemento().restore();
        return true;
    }

}
