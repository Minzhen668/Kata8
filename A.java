import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("请选择购买的产品编号：");
        System.out.println("1.Java资料    2.老九大礼包    3.自学宝典");

        String isShop = "y";
        int itemCount=1;
        int itemNumber=1;
        double litterTotal = 0;
        double total = 0;
        do {
            System.out.println("请输入产品编号：");
            itemNumber = in.nextInt();
            System.out.println("请输入购买数量：");
            itemCount = in.nextInt();
            switch (itemNumber) {
                case 1:
                    litterTotal = 99 * itemCount;
                    System.out.printf("Java 资料 ￥99.0    数量：%d   合计：￥%6.1f", itemCount, litterTotal);
                    break;
                case 2:
                    litterTotal = 199 * itemCount;
                    System.out.printf("老九大礼包 ￥199.0    数量：%d   合计：￥%6.1f", itemCount, litterTotal);
                    break;
                case 3:
                    litterTotal = 299 * itemCount;
                    System.out.printf("老九大礼包 ￥199.0    数量：%d   合计：￥%6.1f", itemCount, litterTotal);
                    break;
                default:
                    System.out.println("输入异常，程序退出！");
                    System.exit(0);
            }

            total += litterTotal;
            System.out.println();
            System.out.println("是否继续（y|n）");
            isShop=in.next();
        } while ("y".equalsIgnoreCase(isShop));
        System.out.println("应付金额："+total);
        System.out.print("实际金额：");
        double realPay = in.nextDouble();
        System.out.println("找零："+(realPay-total));
    }
}
