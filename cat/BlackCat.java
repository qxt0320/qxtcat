package cat;

public class BlackCat extends Cat{
    public BlackCat(String catName, int catAge, int sex) {

        super(catName, catAge, sex, 350);
    }

    @Override
    public String toString() {
        return "BlackCat{" +
                "catName='" + catName + '\'' +
                ", catAge=" + catAge +
                ", sex=" + sex +
                ", price=" + price +
                '}';
    }
}
