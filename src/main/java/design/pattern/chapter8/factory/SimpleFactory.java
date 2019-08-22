package design.pattern.chapter8.factory;

import design.pattern.chapter8.LeiFeng;
import design.pattern.chapter8.Undergradute;
import design.pattern.chapter8.Volunteer;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class SimpleFactory {
    public static LeiFeng createLeiFeng(String type) {
        LeiFeng result = null;
        switch (type) {
            case "大学生":
                result = new Undergradute();
                break;
            case "志愿者":
                result = new Volunteer();
                break;
            default:
                return null;
        }
        return result;
    }
}
