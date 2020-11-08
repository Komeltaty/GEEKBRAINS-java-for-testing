package HW1;

public class Robot {
    protected String name;
    protected int lengh;
    protected int high;
    protected boolean can;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLengh() {
        return lengh;
    }

    public void setLengh(int lengh) {
        this.lengh = lengh;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public Robot (String name, int lengh, int high){
        this.name = name;
        this.lengh = lengh;
        this.high = high;
        this.can = true;
    }

    public boolean isCan() {
        return can;
    }

    public void run (int runLengh){
        if ( runLengh <= lengh ){
            System.out.println("Robot " + name + " runed " + runLengh);}
        else{
            System.out.println("Robot " + name + " can't run " + runLengh);
            this.can = false;
        }
    }
    public void jump (int wallHigh){
        if ( wallHigh <= high){
            System.out.println("Robot " + name + " jumped " + wallHigh);}
        else {
            System.out.println("Robot " + name + " can't jump " + wallHigh);
            this.can = false;
        }
    }
}

