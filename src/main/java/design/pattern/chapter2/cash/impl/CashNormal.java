package design.pattern.chapter2.cash.impl;

import design.pattern.chapter2.cash.CashSuper;

/**
 * 普通收款方式, 不打折.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class CashNormal implements CashSuper {
    @Override
    public double accetpCash(double money) {
        return money;
    }
}
