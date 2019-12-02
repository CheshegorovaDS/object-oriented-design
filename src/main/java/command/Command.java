package command;

import editor.Editor;
import history.Memento;

// Опекуном может выступать класс команд (см. паттерн Команда).
// В этом случае команда сохраняет снимок состояния объекта-
// получателя, перед тем как передать ему своё действие. А в
// случае отмены команда вернёт объект в прежнее состояние.

//Команда и позволяет хранить резервные копии сложного состояния
// текстового редактора и восстанавливать его, если потребуется.

//Объекты команд выступают в роли опекунов и запрашивают снимки
// у редактора перед тем, как выполнить своё действие.
// Если потребуется отменить операцию, команда сможет
// восстановить состояние редактора, используя сохранённый снимок.

// Абстрактная команда задаёт общий интерфейс для конкретных
// классов команд и содержит базовое поведение отмены операции.
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
