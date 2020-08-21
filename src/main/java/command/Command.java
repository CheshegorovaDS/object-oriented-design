package command;

import editor.Editor;
import history.Memento;

public class Command {
    private Editor editor;
    private String name;
    private Memento memento;

    public Command(Editor editor, String name) {
        this.editor = editor;
        this.name = name;
    }

    public void makeBackup(){
        memento = editor.createSnapshot();
    }

    public void undo(){
        if(memento != null){
            memento.restore();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Memento getMemento() {
        return memento;
    }
}
