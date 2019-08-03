package design.pattern.chapter2.v5.cash;

import design.pattern.chapter2.v5.cash.impl.CashNormal;
import design.pattern.chapter2.v5.cash.impl.CashRebate;
import design.pattern.chapter2.v5.cash.impl.CashReturn;

/**
 * 策略模式上下文.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "打八折":
                cashSuper = new CashRebate("0.8");
                break;
            case "满300返100":
                cashSuper = new CashReturn("300", "100");
                break;
            default:
                throw new RuntimeException("输入错误");
        }
    }

    public double getResult(double money) {
        return cashSuper.accetpCash(money);
    }
}
