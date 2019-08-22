package design.pattern.chapter7;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl("李娇娇");

        Proxy daili = new Proxy(jiaojiao);
        daili.giveDolls();
        daili.giveFollers();
        daili.giveFollers();
    }

}
