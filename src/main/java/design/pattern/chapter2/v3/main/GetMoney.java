package design.pattern.chapter2.v3.main;

import design.pattern.chapter2.v3.cash.CashFactory;
import design.pattern.chapter2.v3.cash.CashSuper;

import java.util.Scanner;

/**
 * 收钱主程序.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class GetMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("单价: ");
        String strPrice = scanner.nextLine();
        double price = Double.parseDouble(strPrice);

        System.out.println("数量: ");
        String strNumber = scanner.nextLine();
        double number = Double.parseDouble(strNumber);

        System.out.println("计费方式: ");
        System.out.println("正常收费");
        System.out.println("打八折");
        System.out.println("满300返100");
        String select = scanner.nextLine();

        double total = price * number;

        CashSuper cashAccept = CashFactory.createCashAccept(select);
        double cash = cashAccept.accetpCash(total);
        System.out.println("需要收钱: " + cash);
    }
}
