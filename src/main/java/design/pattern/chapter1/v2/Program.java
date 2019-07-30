package design.pattern.chapter1.v2;

import java.util.Scanner;

/**
 * 大话设计模式第一章 减少 if 判断.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version V2.0
 */
public class Program {
    public static void main(String[] args) {
        try {


            Scanner scanner = new Scanner(System.in);
            System.out.println("输入数字A: ");
            String stringNumberA = scanner.nextLine();

            System.out.println("选择运算符号 + - * / : ");
            String stringOperate = scanner.nextLine();

            System.out.println("输入数字B: ");
            String stringNumberB = scanner.nextLine();

            String stringResult = "";

            switch (stringOperate) {
                case "+":
                    stringResult = (Double.parseDouble(stringNumberA) + Double.parseDouble(stringNumberB)) + "";
                    break;
                case "-":
                    stringResult = (Double.parseDouble(stringNumberA) - Double.parseDouble(stringNumberB)) + "";
                    break;
                case "*":
                    stringResult = (Double.parseDouble(stringNumberA) * Double.parseDouble(stringNumberB)) + "";
                    break;
                case "/":
                    if ("0".equals(stringNumberB)) {
                        stringResult = "除数不能为0";
                    } else {
                        stringResult = (Double.parseDouble(stringNumberA) / Double.parseDouble(stringNumberB)) + "";
                    }
                    break;
                default:
                    stringResult = "运算符输入错误";
            }

            System.out.println("计算结果是: " + stringResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
