package design.pattern.chapter8.factory;

import design.pattern.chapter8.LeiFeng;
import design.pattern.chapter8.Volunteer;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
