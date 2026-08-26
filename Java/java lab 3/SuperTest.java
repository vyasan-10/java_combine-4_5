class Animal {

    String name = "Animal";
}
class Dog extends Animal {

    String name = "Dog";

    void display() {

        System.out.println(name);

        System.out.println(super.name);
    }
}
public class SuperTest {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.display();
    }
}
