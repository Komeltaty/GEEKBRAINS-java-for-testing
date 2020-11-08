package HW2;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(int i, int j) {
        System.out.println("В ячейке " + i + ", " +j+ " содержится текстовая информация.");
    }
}
