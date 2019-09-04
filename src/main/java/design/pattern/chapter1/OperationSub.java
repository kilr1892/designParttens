package design.pattern.chapter1;

/**
 * 减法类.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v4.0
 */
public class OperationSub extends Operation {
    @Override
    public double getResult(){
        return numberA - numberB;
    }

}
