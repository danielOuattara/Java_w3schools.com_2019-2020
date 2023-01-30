package _03_Java_Classes._11_inner_classes.tests;


// Test for private inner class
class OuterClassTwo {
    int x = 10;

    private class InnerClassTwo {
        int y = 6;
    }
}

public class MainTwo {
    public static void main(String[] args) {
        OuterClassTwo myOuter = new OuterClassTwo();
        // Error: test OK
        //OuterClassTwo.InnerClassTwo myInner = myOuter.new InnerClassTwo();
        System.out.println(myOuter.x);
        // System.out.println(myInner.y);
        // System.out.println(myInner.y + myOuter.x);
    }
}
