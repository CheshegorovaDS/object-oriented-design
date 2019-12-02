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
      System.out.println("Записали состояние.");
      this.editor = editor;
      this.text = text;
      this.images = images;
      this.filteres = filteres;
   }

   // В нужный момент владелец снимка может восстановить
   // состояние редактора.
   public void restore(){
      editor.restore(this);
   }

   public String getText() {
      return text;
   }

   public List<Image> getImages() {
      return images;
   }

   public List<Filter> getFilteres() {
      return filteres;
   }
}
