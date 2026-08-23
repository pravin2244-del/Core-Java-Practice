package Abstraction;


public class abstractmethod {

    public static void main(String[] args) {

        Truck t = new Tatamotors();
        t.start("Virat Kohli");
    }
}

abstract class Truck {

    abstract public void start(String i);
}

class Tatamotors extends Truck {

    @Override
    public void start(String i) {
        System.out.println("8987yty6");
        System.out.println(i);
        System.out.println(i.toUpperCase());
    }
}
