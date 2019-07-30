package design.pattern.chapter1.v3;

/**
 * 面向对象设计.
 * 封装运算符操作类
 *
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version V3.0
 */
public class Operation {
    public static String getResult(double numberA, double numberB, String operation) {
        String result = "";
        switch (operation) {
            case "+":
                result = numberA + numberB + "";
                break;
            case "-":
                result = numberA - numberB + "";
                break;
            case "*":
                result = numberA * numberB + "";
            case "/":
                if (numberB == 0) {
                    result = "除数不能为0";
                } else {
                    result = numberA / numberB + "";
                }
                break;
            default:
                result = "输入错误";
                break;
        }
        return result;
    }
}
