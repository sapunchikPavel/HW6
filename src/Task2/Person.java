package Task2;

public class Person {
    private int age;
    private Cloths cloths;
    private double cash;
    private boolean isDrunk;

    public int getAge() {
        return age;
    }

    public Cloths getCloths() {
        return cloths;
    }

    public double getCash() {
        return cash;
    }

    public boolean isDrunk() {
        return isDrunk;
    }

    public Person(int age, double cash, boolean isDrunk, Cloths.ClothTypes clothType, Cloths.ClothPurity clothPurity) {
        this.cloths = new Cloths(clothType, clothPurity);
        this.age = age;
        this.cash = cash;
        this.isDrunk = isDrunk;
    }
}
