public class FlyingFish extends Fish implements FLyer {
    public FlyingFish(String name) {
    super(name);
    }

    @Override
    public void swim() {
        System.out.println("飞鱼游泳");
    }

    @Override
    public void fly() {
        System.out.println("飞鱼会飞");
    }

}
