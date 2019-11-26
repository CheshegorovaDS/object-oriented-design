import editor.Editor;
import photo_elements.Filter;

public class Demo {

    public static void main(String[] args){
        Editor editor = new Editor();
        editor.addFilter(Filter.LOMO);
        editor.addText("Hello");


    }
}
