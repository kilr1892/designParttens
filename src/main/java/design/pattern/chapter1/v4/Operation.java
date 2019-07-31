package design.pattern.chapter1.v4;

/**
 * 面向对象设计.
 * 封装运算符操作类, 松耦合结构
 *
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version V4.0
 */
public abstract class Operation {

    public double numberA;
    public double numberB;

    public abstract double getResult();

}
