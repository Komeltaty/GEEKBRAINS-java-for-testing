package HW1;

public class Cat {
    protected String name;
    protected int lengh;
    protected int high;
    protected boolean can;

    public Cat (String name, int lengh, int high){
        this.name = name;
        this.lengh = lengh;
        this.high = high;
        this.can = true;
    }

    public boolean isCan() {
        return can;
    }

    public String getName() {
        return name;
    }

    public int getLengh() {
        return lengh;
    }

    public int getHigh() {
        return high;
    }

    public void run (int runLengh){
        if ( runLengh <= lengh ){

            System.out.println("Cat " + name + " runed " + runLengh);}
        else{
            System.out.println("Cat " + name + " can't run " + runLengh);
            this.can = false;
        }
    }
    public void jump (int wallHigh){
        if ( wallHigh <= high){
            System.out.println("Cat " + name + " jumped " + wallHigh);}
        else {
            System.out.println("Cat " + name + " can't jump " + wallHigh);
            this.can = false;
        }
    }

}