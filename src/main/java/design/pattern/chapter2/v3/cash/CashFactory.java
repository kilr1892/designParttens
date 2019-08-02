package design.pattern.chapter2.v3.cash;

import design.pattern.chapter2.v3.cash.impl.CashNormal;
import design.pattern.chapter2.v3.cash.impl.CashRebate;
import design.pattern.chapter2.v3.cash.impl.CashReturn;

/**
 * 收款方式工厂类.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class CashFactory {

    public static CashSuper createCashAccept(String cashAccept) {
        switch (cashAccept) {
            case "正常收费":
                return new CashNormal();
            case "打八折":
                return new CashRebate("0.8");
            case "满300返100":
                return new CashReturn("300", "100");
            default:
                throw new RuntimeException("参数错误");
        }
    }
}
