package _03_Java_Classes.tests._06_modifiers.fields_public_private_default_protected;

public class CarFields {
    int modelYear;
    String modelName;
    String brandName;

    public CarFields(int year, String name, String brand) {
        modelYear = year;
        modelName = name;
        brandName = brand;
    }

    public void showMe(){
        System.out.println(this.brandName + " " + this.modelName + " " + this.modelYear);
    }
}
