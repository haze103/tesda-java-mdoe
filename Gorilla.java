public class Gorilla implements Animal {
    
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Feeding time! Putting gorilla food into cage.");
            return true;
        } else {
            System.out.println("It is not yet feeding time.");
            return false;}
    }

    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming: lather, rinse, repeat.");
    }

    public void pet() {
        // pet at your own risk
        System.out.println("Careful\u2014petting the gorilla at your own risk!");
    }

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}