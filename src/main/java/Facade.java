public class Facade {
    TextWriter textWriter;
    Compiler compiller;
    StatusProgram clr;
    public Facade(TextWriter text){
        this.textWriter = text;
        this.compiller = new Compiler();
        this.clr = new StatusProgram();
    }
    public void start() {
        textWriter.createCode();
        textWriter.save();
        compiller.Compile();
        clr.execute();
    }
    public void stop(){
        clr.finish();
    }
}
