package design.pattern.chapter7;

/**
 * 实际追求者类.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class Pursuit implements GiveGift {
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm.getName() +"送你洋娃娃");
    }

    @Override
    public void giveFollers() {
        System.out.println(mm.getName() + "送你花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + "送你巧克力");
    }
}
