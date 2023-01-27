package _03_Java_Classes.tests._06_modifiers;

// import _03_Java_Classes.tests._06_modifiers.classes_default.MainDefault;
import _03_Java_Classes.tests._06_modifiers.classes_public.MainPublic;
import _03_Java_Classes.tests._06_modifiers.fields_public_private_default_protected.CarFields;
import _03_Java_Classes.tests._06_modifiers.fields_public_private_default_protected.FoodFields;

public class MainRoot {
    public static void main(String[] args) {
        MainPublic my_obj = new MainPublic();
        my_obj.sayHello();

//      MainDefault my_obj2 = new MainDefault();
//      my_obj2.sayHello();

        CarFields my_car = new CarFields(1980, "505","Peugeot");
        my_car.showMe();

        FoodFields orange = new FoodFields(
                "orange",
                "yellow",
                "Morocco",
                true,
                1500,
                4);

        System.out.println(orange.salePricePerKilogram);

    }
}
