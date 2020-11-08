package HW1;


public class Person {
    protected String name;
    protected int lengh;
    protected int high;
    protected boolean can;

    public boolean isCan() {
        return can;
    }

    public Person (String name, int lengh, int high){
        this.name = name;
        this.lengh = lengh;
        this.high = high;
        this.can = true;
    }

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

    public void run (int runLengh){
        if ( runLengh <= lengh ){
            System.out.println("Person " + name + " runed " + runLengh);}
        else{
            System.out.println("Person " + name + " can't run " + runLengh);
            this.can = false;
        }
    }
    public void jump (int wallHigh){
        if ( wallHigh <= high){
            System.out.println("Person " + name + " jumped " + wallHigh);}
        else {
            System.out.println("Person " + name + " can't jump " + wallHigh);
            this.can = false;
        }
    }
}