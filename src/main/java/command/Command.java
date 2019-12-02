package command;

import editor.Editor;
import history.Memento;

// Опекуном может выступать класс команд (см. паттерн Команда).
// В этом случае команда сохраняет снимок состояния объекта-
// получателя, перед тем как передать ему своё действие. А в
// случае отмены команда вернёт объект в прежнее состояние.
public class Command {
    private Editor editor;
    private String name;

    public Command(Editor editor, String name) {
        this.editor = editor;
        this.name = name;
    }

    public void makeBackup(){
        editor.createSnapshot();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
