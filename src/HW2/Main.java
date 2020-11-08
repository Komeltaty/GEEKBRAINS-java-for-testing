package HW2;

//1. Написать метод, на вход которому подается двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе преобразование не удалось (например, если в ячейке лежит символ или текст вместо числа),
// надо бросить исключение MyArrayDataException с детализацией, в какой ячейке неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException и вывести результат расчета.
public class Main {

    public static void main(String[] args) {
        String [][]array = new String[4][4];
        int count =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = String.valueOf(count);
                count++;

            }
        }
        array[1][1]="f";
        array[0][1]="r";

        try {
            System.out.println(changeNomberAndSum(array));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }

    public static int changeNomberAndSum (String [][] array) throws MyArraySizeException,MyArrayDataException{
        int sum=0;
        if (array.length > 4){
            throw new MyArraySizeException("Массив неверного размера");
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (!checkString(array[i][j])){
//                    throw new MyArrayDataException(i,j);
//                    если оставить выброс исключения, то подсчет суммы не будет выполнен
                    System.out.println("В ячейке " + i + ", " +j+ " содержится текстовая информация.");
                }
                else sum+=Integer.parseInt(array[i][j]);

            }
        }
        return sum;
    }

    public static boolean checkString(String string) {

        char c;
        for (int i = 0; i < string.length(); i++) {
            c = string.charAt(i);
            if (!(c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }
}