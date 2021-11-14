package cat;

public abstract class Cat{

    String catName;

    int catAge;

    int sex;

    double price;

    public Cat(String catName, int catAge, int sex, double price) {
        this.catName = catName;
        this.catAge = catAge;
        this.sex = sex;
        this.price = price;
    }

    @Override
    public abstract String toString();
}
