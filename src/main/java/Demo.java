import editor.Editor;
import photo_elements.Filter;

public class Demo {

    public static void main(String[] args){
        Editor editor = new Editor();
        editor.addFilter(Filter.LOMO);
        System.out.println("------------------------");
        editor.addText("Hello");
        System.out.println("------------------------");
        editor.getImages();
        editor.getText();
        editor.getFilteres();
        System.out.println("------------------------");
        editor.undo();
        System.out.println("------------------------");
        editor.getImages();
        editor.getText();
        editor.getFilteres();
        editor.undo();
    }
}
