public class Main {
    public static void main(String[] args) throws InterruptedException {

        Campana c = new Campana();
        Suono din = new Suono ("din", c);
        Suono don = new Suono ("don", c);
        Suono dan = new Suono ("dan", c);

        din.start();
        don.start();
        dan.start();
        Thread.sleep(10000);
        System.exit(0);
    }
}