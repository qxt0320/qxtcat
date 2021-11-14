package cat;
import java.util.Scanner;
public class CatTest {
    public static void main(String[] args) {
        MyCatCafe myCatCafe = new MyCatCafe();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=================================");
            System.out.println("=========欢迎光临本店 =========");
            System.out.println("=========请选择您要进行的操作 =========");
            System.out.println("=        1 购买橘猫                                 =");
            System.out.println("=        2 购买黑猫                                 =");
            System.out.println("=        3 招待顾客                                 =");
            System.out.println("=        4 关店                                =");
            System.out.println("==================================");
            System.out.println("请输入您的选择");
            int choose;
            if (sc.hasNextInt()) {
                choose = sc.nextInt();
                if (choose > 0 && choose < 5) {
                    switch (choose) {
                        case 1:
                            myCatCafe.buyOrangeCat();
                            break;
                        case 2:
                            myCatCafe.buyBlackCat();
                            break;
                        case 3:
                            myCatCafe.helloCustomer();
                            break;
                        case 4:
                            myCatCafe.close();
                            System.out.println("成功退出……");
                            System.out.println("欢迎下次使用");
                            System.exit(0);
                            break;
                    }
                } else {
                    System.out.println("请正确输入");
                }

            } else {
                System.out.println("请您输入正确的选项");
            }
        }

    }
}
