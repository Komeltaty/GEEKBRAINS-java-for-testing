package HW4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    //    protected String surname;
//    protected String number;
    Map<String, String> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

//    public Phonebook(String surname, String number) {
//        this.surname = surname;
//        this.number= number;
//    }

    public String getNumber(String surname) {
        String number = null;
        if (phonebook.containsKey(surname)){
           number = phonebook.get(surname);
        }
        return number;
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String surname = scanner.nextLine();
        System.out.println("Введите номер в формате +7-999-999-99-99:");
        String number = scanner.nextLine();
        if (phonebook.size() > 1 && phonebook.containsKey(surname)) {
            System.out.println(111);
            String temp = phonebook.get(surname) + ", " + number;
            phonebook.put(surname, temp);
        } else phonebook.put(surname, number);
    }

    public void addAutomatic(String surname, String number) {
        if ( phonebook.containsKey(surname)) {
            String temp = phonebook.get(surname) + ", " + number;
            phonebook.put(surname, temp);
        } else phonebook.put(surname, number);
    }
    
    public void print (){
        for (Map.Entry<String,String>pair: phonebook.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}