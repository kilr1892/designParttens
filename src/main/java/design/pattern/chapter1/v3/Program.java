package design.pattern.chapter1.v3;

import java.util.Scanner;

/**
 * 客户端main方法.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v3.0
 */
public class Program {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入数字A: ");
            String stringNumberA = scanner.nextLine();
            double numberA = Double.parseDouble(stringNumberA);

            System.out.println("选择运算符号 + - * / : ");
            String stringOperate = scanner.nextLine();

            System.out.println("输入数字B: ");
            String stringNumberB = scanner.nextLine();
            double numberB = Double.parseDouble(stringNumberB);

            String result = Operation.getResult(numberA, numberB, stringOperate);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}