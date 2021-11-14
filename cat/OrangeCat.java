package cat;
public class OrangeCat extends Cat{


    public OrangeCat(String catName, int catAge, int sex) {
        super(catName,catAge,sex,200);
        this.catName = catName;
        this.catAge = catAge;
        this.sex = sex;
        this.price = 200;
    }

    @Override
    public String toString() {
        return "OrangeCat{" +
                "catName='" + catName + '\'' +
                ", catAge=" + catAge +
                ", sex=" + sex +
                ", price=" + price +
                '}';
    }
}
