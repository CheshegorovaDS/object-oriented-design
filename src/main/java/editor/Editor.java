package editor;

import command.Command;
import history.History;
import history.Memento;
import photo_elements.Filter;
import photo_elements.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Editor {

    private String text;
    private List<Image> images= new ArrayList<>();
    private List<Filter> filteres = new ArrayList<>();
    private History history;

    public Editor() {
        history = new History();
    }

    public void addText(String text){
        history.push(new Command(this,"Text: "+text),createSnapshot());
        this.text = text;
        System.out.println("Add text "+ text+".");
    }

    public void loadImages(Image image){
        history.push(new Command(this,"Image: "+image.getName()),createSnapshot());
        Collections.addAll(this.images, image);
        System.out.println("Add image" + image.getName());
    }

    public void addFilter(Filter filter){
        history.push(new Command(this,"Filter" + filter.getName()),createSnapshot());
        filteres.add(filter);
        System.out.println("Add filter "+filter.getName()+".");
    }

    // Класс создателя должен иметь специальный метод, который
    // сохраняет состояние создателя в новом объекте-снимке.

    public Memento createSnapshot(){
        // Снимок — неизменяемый объект, поэтому Создатель
        // передаёт все своё состояние через параметры
        // конструктора.
        return new Memento(this,text,images,filteres);
    }

    public String getText() {
        System.out.println("Text: ");
        System.out.println(text);
        return text;
    }

    public List<Image> getImages() {
        System.out.println("Images:");
        for(Image im: images){
            System.out.println(im.getName());
        }
        return images;
    }

    public List<Filter> getFilteres() {
        System.out.println("Filtres:");
        for(Filter fil: filteres){
            System.out.println(fil.getName());
        }
        return filteres;
    }

    public void restore(Memento memento){
        images = memento.getImages();
        text = memento.getText();
        filteres = memento.getFilteres();
    }

    public void undo(){
        history.undo();
    }
}
