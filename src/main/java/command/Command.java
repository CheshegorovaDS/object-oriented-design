package command;

import editor.Editor;
import history.Memento;

public class Command {
    private Memento backup;
    private Editor editor;

    public void makeBackup(){
        backup = editor.createSnapshot();
    }

    public void undo(){
        if(backup!= null){
            backup.restore();
        }
    }
}
