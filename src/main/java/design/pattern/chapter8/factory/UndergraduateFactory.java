package design.pattern.chapter8.factory;

import design.pattern.chapter8.LeiFeng;
import design.pattern.chapter8.Undergradute;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergradute();
    }
}
