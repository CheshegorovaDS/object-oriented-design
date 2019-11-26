package editor;

import history.History;
import history.Memento;
import photo_elements.Filter;
import photo_elements.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Editor {
  //  private History history;
    private String text;
    private List<Image> images= new ArrayList<>();
    private List<Filter> filteres = new ArrayList<>();

    public Editor() {
        //history = new History();
    }

    public void addText(String text){
        this.text = text;
        System.out.println("Add text "+ text+".");
    }

    public void loadImages(Image...images){
        Collections.addAll(this.images, images);
        System.out.println();
    }

    public void addFilter(Filter filter){
        filteres.add(filter);
        System.out.println("Add filter "+filter.getName()+".");
    }

    public Memento createSnapshot(){
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

    /* public String backup() {

        return "";
    }

    public void restore(String state) {

    }*/
}
