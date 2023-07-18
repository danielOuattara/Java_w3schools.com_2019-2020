package _03_Java_Classes._06_modifiers.tests.fields_public_private_default_protected;

public class FoodFields {


    public String name;
    public String color;
    protected String origin;
    Boolean isProfitable;
    private int purchasePricePerTon;
    public int salePricePerKilogram;

    public FoodFields(
            String name,
            String color,
            String origin,
            Boolean isProfitable,
            int purchasePricePerTon,
            int salePricePerKilogram
    ) {
        this.name = name;
        this.color = color;
        this.origin = origin;
        this.isProfitable = isProfitable;
        this.purchasePricePerTon = purchasePricePerTon;
        this.salePricePerKilogram = salePricePerKilogram;
    }

    public void showFood() {
        System.out.println(this.name + " " + this.color + " " + this.origin);
    }

    public void showTasty() {
        System.out.println(this.name + " " + this.color + " " + this.origin);
    }

    public static void main(String[] args) {
        FoodFields orange = new FoodFields(
                "orange",
                "yellow",
                "Morocco",
                true,
                1500,
                4);

        System.out.println(orange.purchasePricePerTon);
    }



}
