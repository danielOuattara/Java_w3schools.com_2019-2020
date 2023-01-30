package _03_Java_Classes._11_inner_classes.tests;


class OuterClassThree {
    int x = 5;

    static class InnerClassThree {
        int y = 10;
    }
}

public class MainThree {
    public static void main(String[] args) {
        OuterClassThree.InnerClassThree myInner = new OuterClassThree.InnerClassThree();
        System.out.println(myInner.y);
    }
}
