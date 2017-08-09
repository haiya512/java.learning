public class Seaplane extends Airplane implements Swimmer {
    public Seaplane(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.printf("海上");
        super.fly();
    }

    @Override
    public void swim() {
        System.out.printf("海上飞机 %s 航行海面%n", name);
    }
}

public class Helicopter extends Airplane {
    public Helicopter(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.printf("飞机 %s 在飞%n", name);
    }
}
