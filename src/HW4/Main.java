package HW4;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
//1.Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.
public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int count =0;
        for (int i = 0;i<15; i++){
            list.add("word"+count);
            count++;
            if (count%3==0){
                list.add("word");
            }
        }

        findAndPrint(list);
//2.Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.
        Phonebook phonebook = new Phonebook();
        phonebook.addAutomatic("Vasilev", "+7-987-987-66-66");
        phonebook.addAutomatic("Petrov", "+7-444-987-66-66");
        phonebook.addAutomatic("Anatoliev", "+7-987-888-66-66");
        phonebook.addAutomatic("Vasilev", "+7-987-333-66-66");
        phonebook.add();
        phonebook.print();
        System.out.println("Номер телефона \"Petrov\": " + phonebook.getNumber("Petrov"));
        System.out.println("Номер телефона \"Vasilev\": " +phonebook.getNumber("Vasilev"));


    }

    public static void findAndPrint(ArrayList<String> list){
        Map <String, Integer> map = new TreeMap<>();
        for (int i = 0;i<list.size(); i++){
            if (map.containsKey(list.get(i))){
                int count = map.get(list.get(i));
                map.put(list.get(i), count+1);
            }
            else map.put(list.get(i), 1);
        }
        for (Map.Entry<String, Integer> pair: map.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

}
