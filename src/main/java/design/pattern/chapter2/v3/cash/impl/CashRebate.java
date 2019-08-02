package design.pattern.chapter2.v3.cash.impl;

import design.pattern.chapter2.v3.cash.CashSuper;

/**
 * 打折.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class CashRebate implements CashSuper {

    private double moneyRebate = 1d;
    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double accetpCash(double money) {
        return money * moneyRebate;
    }
}
