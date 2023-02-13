public abstract class Match{
    private int currentscore;
    private float currentover;
    private int target;

    
    public int getcurrentscore(){
        return currentscore;
    }
    public void setcurrentscore(int currentscore){
        this.currentscore=currentscore;
    }
    public float getcurrentover(){
        return currentover;
    }
    public void setcurrentover(float currentover){
        this.currentover=currentover;
    }
    public int gettarget(){
        return target;
    }
    public void settarget(int target){
        this.target=target;
    }
    public abstract float calulateRunRate();
    public abstract int caluculateBalls();
    public abstract void display(double reqRunrate,int balls);
}