public class Suono extends Thread{
    Campana c;

    public Suono(String name, Campana c) {
        super(name);
        this.c = c;
    }

    @Override
    public void run(){
        while(true){
            c.emettiSuono();
        }
    }
}
