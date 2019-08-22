package design.pattern.chapter8;

import design.pattern.chapter8.factory.IFactory;
import design.pattern.chapter8.factory.SimpleFactory;
import design.pattern.chapter8.factory.UndergraduateFactory;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
//        LeiFeng studentA = SimpleFactory.createLeiFeng("大学生");
//        studentA.BuyRice();
//        LeiFeng studentB = SimpleFactory.createLeiFeng("大学生");
//        studentB.Sweep();
//        LeiFeng studentC = SimpleFactory.createLeiFeng("大学生");
//        studentC.Wash();

        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();

        student.BuyRice();
        student.Wash();
        student.Sweep();
    }
}
