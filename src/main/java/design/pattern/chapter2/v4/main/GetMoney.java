package design.pattern.chapter2.v4.main;

import design.pattern.chapter2.v4.cash.CashContext;
import design.pattern.chapter2.v4.cash.impl.CashNormal;
import design.pattern.chapter2.v4.cash.impl.CashRebate;
import design.pattern.chapter2.v4.cash.impl.CashReturn;

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
        CashContext cashContext = null;


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

        switch (select) {
            case "正常收费":
                cashContext = new CashContext(new CashNormal());
                break;
            case "打八折":
                cashContext = new CashContext(new CashRebate("0.8"));
                break;
            case "满300返100":
                cashContext = new CashContext(new CashReturn("300", "100"));
                break;
            default:
                throw new RuntimeException("输入错误");
        }
        double cash = cashContext.getResult(total);
        System.out.println("需要收钱: " + cash);
    }
}
