import java.text.DecimalFormat;

public class ODIMatch extends Match{
    private final int maxovers=50;

    private static final DecimalFormat df = new DecimalFormat("0.00");
 @Override
    public float calulateRunRate(){
        return (gettarget() - getcurrentscore()) / (maxovers - getcurrentover());
    }
 @Override
    public int caluculateBalls() {
        return (int) ((maxovers - getcurrentover()) * 6);
    }
 @Override
    public void display(double reqRunrate, int balls) {
        System.out.println("Need " + (gettarget() - getcurrentscore()) + " runs in " + caluculateBalls() + " balls");
        System.out.println("Required Runrate: " + df.format(reqRunrate));
    }
}