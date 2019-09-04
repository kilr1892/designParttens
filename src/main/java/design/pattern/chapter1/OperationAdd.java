package design.pattern.chapter1;

/**
 * 加法类.
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v4.0
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult(){
        return numberA + numberB;
    }
}
