package design.pattern.chapter2.v2;

import java.util.Scanner;

/**
 * 商场收银软件 增加打折.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v2.0
 */
public class Cashier {
    public static void main(String[] args) {
        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("单价: ");
            String strPrice = scanner.nextLine();
            double price = Double.parseDouble(strPrice);

            System.out.println("数量: ");
            String strNumber = scanner.nextLine();
            double number = Double.parseDouble(strNumber);

            System.out.println("计费方式: (输入数字)");
            System.out.println("10 正常价");
            System.out.println("8 打八折");
            System.out.println("7 打七折");
            System.out.println("5 打五折");
            String select = scanner.nextLine();

            double total = price * number;
            System.out.println("总价为: ");
            switch (select) {
                case "10":
                    System.out.println(total);
                    break;
                case "8":
                    System.out.println(total * 0.8);
                    break;
                case "7":
                    System.out.println(total * 0.7);
                    break;
                case "5":
                    System.out.println(total * 0.5);
                    break;
                default:
                    throw new RuntimeException("计算方式输入错误");
            }
        }
    }
}
