package _03_Java_Classes._10_polymorphism;

    /* Java Polymorphism
    =======================

    (inherit + override inherited methods )

    Polymorphism means "many forms", and it occurs when we have
    many classes that are related to each other by inheritance.

    Like we specified in the previous chapter, 'Inheritance' let's
    inherit attributes and methods from a parent class.

    Polymorphism uses those methods to perform different tasks.
    This allows us to perform a single action in different ways.

    For example, think of a superclass called 'Animal' that has a
    method called animalSound(). Subclasses of Animals could be Pigs,
    Cats, Dogs, Birds, etc... and they also have their own
    implementation of an animal sound: the pig oinks, and the cat meows,
    etc...

    //--------------------------------------------------
    class Animal {
      public void animalSound() {
        System.out.println("The animal makes a sound");
      }
    }

    //--------------------------------------------------
    class Pig extends Animal {
      public void animalSound() {
        System.out.println("The pig says: wee wee");
      }
    }

    //--------------------------------------------------
    class Dog extends Animal {
      public void animalSound() {
        System.out.println("The dog says: bow wow");
      }
    }

    Remember from the Inheritance chapter that we use the 'extends' keyword
    to inherit from a class.

    Now we can create Pig and Dog objects and call the animalSound() method on
    both of them */


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

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        myAnimal.animalSound();

        Animal myPig = new Pig();  // Create a Pig object
        myPig.animalSound();

        Animal myDog = new Dog();  // Create a Dog object
        myDog.animalSound();

        Animal myCat = new Cat();  // Create a Cat object
        myCat.animalSound();
    }
}

    /*
    Why And When To Use "Inheritance" and "Polymorphism" ?
    ------------------------------------------------------
    It is useful for code re-usability: reuse attributes and methods
    of an existing class when you create a new class.  */

