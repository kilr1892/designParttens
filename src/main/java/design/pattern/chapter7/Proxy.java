package design.pattern.chapter7;

/**
 * 代理类.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class Proxy implements GiveGift {
    Pursuit gg;

    public Proxy(SchoolGirl mm) {
        gg = new Pursuit(mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFollers() {
        gg.giveFollers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
