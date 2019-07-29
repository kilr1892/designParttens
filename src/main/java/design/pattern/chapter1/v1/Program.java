package design.pattern.chapter1.v1;

import java.util.Scanner;

/**
 * 大话设计模式第一章  菜鸟最初的版本.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version V1.0
 */
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数字A: ");
        String a = scanner.nextLine();

        System.out.println("选择运算符号 + - * / : ");
        String b = scanner.nextLine();

        System.out.println("输入数字B: ");
        String c = scanner.nextLine();

        String d = "";

        if ("+".equals(b)) {
            d = (Double.parseDouble(a) + Double.parseDouble(c)) + "";
        }
        if ("-".equals(b)) {
            d = (Double.parseDouble(a) - Double.parseDouble(c)) + "";
        }
        if ("*".equals(b)) {
            d = (Double.parseDouble(a) * Double.parseDouble(c)) + "";
        }
        if ("/".equals(b)) {
            d = (Double.parseDouble(a) / Double.parseDouble(c)) + "";
        }

        System.out.println("结果是: " + d);
    }
}
