package _03_Java_Classes._10_polymorphism.tests;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says: meow meow");
    }
}

class MainTest {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        myAnimal.animalSound();

        Animal myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        Pig myPig2 = new Pig();  // Create a Pig object
        myPig2.animalSound();

        Animal myDog = new Dog();  // Create a Dog object
        myDog.animalSound();

        Animal myCat = new Cat();  // Create a Cat object
        myCat.animalSound();
    }
}
