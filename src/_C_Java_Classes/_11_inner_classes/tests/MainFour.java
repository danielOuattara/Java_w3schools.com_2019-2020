package _C_Java_Classes._11_inner_classes.tests;


// Test for private inner class
class OuterClassFour {
    int x = 17;
    void sayHello(){
        System.out.println("Outer class says Hello there");
    }

    class InnerClassFour {
        public int myInnerMethod() {
            return x;
        }

        public void myInnerSayHello(){
            sayHello();
        }
    }
}

public class MainFour {
    public static void main(String[] args) {
        OuterClassFour myOuter = new OuterClassFour();

        OuterClassFour.InnerClassFour myInner = myOuter.new InnerClassFour();
        System.out.println(myInner.myInnerMethod());
        myInner.myInnerSayHello();


    }
}
