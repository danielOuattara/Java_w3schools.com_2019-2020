package _03_Java_Classes._11_inner_classes.tests;


// Basic test case
class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}


public class MainOne {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myOuter.x + myInner.y);
    }

}
