package design.pattern.chapter2.v4.cash.impl;

import design.pattern.chapter2.v4.cash.CashSuper;

/**
 * 返利收费子类.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class CashReturn implements CashSuper {

    private double moneyCondition = 0d;
    private double moneyReturn = 0d;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double accetpCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
