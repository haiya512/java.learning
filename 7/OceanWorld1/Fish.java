public abstract class Fish implements Swimmer {
    protected String name;
    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract void swim();
}

//public class Anemonefish extends Fish {
//    public Anemonefish(String name) {
//        super(name);
//    }
//
//    @Override
//
//    public void swim() {
//        System.out.printf("小丑鱼 %s 游泳%n", name);
//    }
//}
//
//public class Shark extends Fish {
//    public Shark(String name) {
//        super(name);
//    }
//
//    @Override
//
//    public void swim() {
//        System.out.printf("鲨鱼 %s 游泳%n", name);
//    }
//}
//
//public class Firanha extends Fish {
//    public Firanha(String name) {
//        super(name);
//    }
//
//    @Override
//
//    public void swim() {
//        System.out.printf("食人鱼 %s 游泳%n", name);
//    }
//}
