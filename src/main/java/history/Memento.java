package history;

import editor.Editor;
import photo_elements.Filter;
import photo_elements.Image;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private Editor editor;
    private String text;
    private List<Image> images= new ArrayList<>();
    private List<Filter> filteres = new ArrayList<>();

    public Memento(Editor editor, String text, List<Image> images, List<Filter> filteres) {
        this.editor = editor;
        this.text = text;
        this.images = images;
        this.filteres = filteres;
    }

    public void restore(){
        editor.getText();
        editor.getFilteres();
        editor.getImages();
    }
}
