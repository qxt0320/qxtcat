package cat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCatCafe implements CatCafe{

    private double balance = 2000;

    List<Cat> catList = new ArrayList<>();

    List<Customer> customerList = new ArrayList<>();

    int i=0,j=0;


    @Override
    public void  buyBlackCat() {

        Random rand = new Random();

        catList.add(new BlackCat("黑猫" + i + "",rand.nextInt(10) + 1,rand.nextInt(1)));

        if (catList.get(i).price > balance){
            try {
                catList.remove(i);
                throw new InsufficientBalanceException("您的余额不足");
            } catch (InsufficientBalanceException e) {
                e.printStackTrace();
            }
        }else {
            balance -= catList.get(i).price;
            System.out.println("购买成功");
            System.out.println(balance);
            i++;
        }
    }

    @Override
    public void buyOrangeCat() {

        Random rand = new Random();

        catList.add(new OrangeCat("橘猫" + i +"",rand.nextInt(10) + 1,rand.nextInt(1)));


        if (catList.get(i).price > balance){
            try {
                catList.remove(i);
                throw new InsufficientBalanceException("您的余额不足");
            } catch (InsufficientBalanceException e) {
                e.printStackTrace();
            }
        }else {
            balance -= catList.get(i).price;
            System.out.println("购买成功");
            System.out.println(balance);
            i++;
        }

    }

    @Override
    public void helloCustomer() {

        Random rand = new Random();


        customerList.add(new Customer("顾客" + j +"", rand.nextInt(3)+1,LocalDate.now()));

        if(customerList.get(j).rua > catList.size()){

            try {
                customerList.get(j).rua = 0;
                throw new CatNotFoundException("店里的猫的数量不够");
            } catch (CatNotFoundException e) {
                e.printStackTrace();
            }
        }else {

            balance = balance + customerList.get(j).rua * 15;

            for (int k = 0; k <= customerList.get(j).rua-1; k++) {
                System.out.println(catList.get(catList.size() - rand.nextInt(catList.size())));
            }
        }j++;

    }

    @Override
    public void close() {

        int profit = 0;

        for ( Customer customer : customerList)
        {
            System.out.println(customer);
            profit+= customer.rua * 15;
        }

        System.out.println("获取的利润为" + profit);

    }
}
