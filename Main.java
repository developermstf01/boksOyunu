public class Main {
    public static void main(String[] args) {

        double r1 = Math.random() * 100, r2 = Math.random() * 100;

        Fighter f1 = new Fighter("Ninja",15,100,80,r1);
        Fighter f2 = new Fighter("Süvari",20,90,90,r2);

        Match match = new Match(f1,f2,100,80);
        match.run();
    }
}
