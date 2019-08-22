package design.pattern.chapter6;

/**
 * 客户端代码.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class Main {

    public static void main(String[] args) {
        Person xc = new Person("小菜");

        System.out.println("\n第一种装扮: ");
        xc.wearTShirts();
        xc.wearBigTrouser();
        xc.wearSneakers();
        xc.show();

        System.out.println("\n第二种装扮");
        xc.wearSuit();
        xc.wearTie();
        xc.wearLeatherShoes();
        xc.show();
    }

}
