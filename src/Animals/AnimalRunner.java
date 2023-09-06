package Animals;

public class AnimalRunner {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.eat());
        System.out.println(cat.talk());
        System.out.println(cat.walk());

        Dog dog = new Dog();
        System.out.println("\n");
        System.out.println(dog.eat());
        System.out.println(dog.talk());
        System.out.println(dog.walk());

        Mouse mouse = new Mouse();
        System.out.println("\n");
        System.out.println(mouse.eat());
        System.out.println(mouse.talk());
        System.out.println(mouse.walk());

        Chicken chicken = new Chicken();
        System.out.println("\n");
        System.out.println(chicken.eat());
        System.out.println(chicken.talk());
        System.out.println(chicken.walk());

        Duck duck = new Duck();
        System.out.println("\n");
        System.out.println(duck.eat());
        System.out.println(duck.talk());
        System.out.println(duck.walk());
    }

}
