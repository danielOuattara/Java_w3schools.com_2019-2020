package _C_Java_Classes._12_abstraction.tests;


abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("zzZZzzZZzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class MainTest {
    public static void main(String[] args) {
        Pig pepaPig = new Pig();
        pepaPig.animalSound();
        pepaPig.sleep();
    }
}




