package _C_Java_Classes._13_interface.test_1;


interface Animal {
    void animalSound();

    void sleep();
    String COUNTRY = "France";
}

class Dog implements Animal {

    String name;
    int age;



    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String countryOrigin = COUNTRY;

    @Override
    public void animalSound() {
        System.out.println(this.name + " barks: wof wof");
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " sleep: ZZzzZZzz");
    }
}

public class MainTest {
    public static void main(String[] args) {
        Dog ruben = new Dog("Ruben", 4);
        ruben.sleep();
        ruben.animalSound();
        System.out.println(ruben.countryOrigin);

        Dog marcus = new Dog("Marcus", 5);
        marcus.sleep();
        marcus.animalSound();
    }
}
