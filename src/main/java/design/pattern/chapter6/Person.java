package design.pattern.chapter6;

/**
 * Person类.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void wearTShirts() {
        System.out.println("大T恤");
    }
    public void wearBigTrouser() {
        System.out.println("垮裤");
    }
    public void wearSneakers() {
        System.out.println("破球鞋");
    }
    public void wearSuit() {
        System.out.println("西装");
    }
    public void wearTie() {
        System.out.println("领带");
    }
    public void wearLeatherShoes() {
        System.out.println("皮鞋");
    }
    public void show() {
        System.out.printf("装扮的%s",name);
    }
}
