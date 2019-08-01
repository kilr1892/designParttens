package design.pattern.chapter2.v1;

import java.util.Scanner;

/**
 * 商场收银软件 第一版.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class Cashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("单价: ");
        String strPrice = scanner.nextLine();
        double price = Double.parseDouble(strPrice);

        System.out.println("数量: ");
        String strNumber = scanner.nextLine();
        double number = Double.parseDouble(strNumber);

        System.out.println("总价为: " + (price * number));
    }
}
