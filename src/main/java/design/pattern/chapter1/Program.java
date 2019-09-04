package design.pattern.chapter1;

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
        Scanner scanner = new Scanner(System.in);


        System.out.println("请输入数字A: ");
        String strNumberA = scanner.nextLine();
        System.out.println("请输入操作符: ");
        String strOperation = scanner.nextLine();
        System.out.println("请输入数字B: ");
        String strNumberB = scanner.nextLine();

        Operation operation = OperationFactory.createOperate(strOperation);
        operation.numberA = Double.parseDouble(strNumberA);
        operation.numberB = Double.parseDouble(strNumberB);

        double result = operation.getResult();
        System.out.println("结果是: " + result);
    }
}