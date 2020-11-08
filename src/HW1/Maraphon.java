package HW1;

//ДОМАШНЕЕ ЗАДАНИЕ:
//Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять соответствующие действия (бежать или прыгать),
// результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
// Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
//* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
// Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
public class Maraphon {


    public static void main(String[] args) {

        HW1.Cat c1 = new HW1.Cat("Moshka", 5000, 5);
        Person p1 =new Person("Vasya", 1000, 2);
        Robot r1 = new Robot("Kosmos", 300, 1);

        Object[] participants = {c1, p1,r1};
        Object[] obstructions = new Object[5];

        obstructions[0] = new Treadmill(500);
        obstructions[1] = new Wall(1);
        obstructions[2] = new Treadmill(1000);
        obstructions[3] = new Wall(2);
        obstructions[4] = new Treadmill(2000);

        for (int i = 0; i< participants.length; i++){
            for (int j= 0; j< obstructions.length; j++ ){
                checkObstract(participants[i], obstructions[j]);

            }


        }
    }
    public static void checkObstract (Object o, Object o1){
        if (o instanceof HW1.Cat) {
            HW1.Cat b = (HW1.Cat) o;
            if (!b.isCan()){
                return;
            }
            if (o1 instanceof Treadmill) {
                Treadmill t = (Treadmill) o1;
                b.run(t.getLengh());
            } else {
                Wall w = (Wall) o1;
                b.run(w.getHigh());
            }
        }
        if (o instanceof Person){
            Person p = (Person) o;
            if (!p.isCan()){
                return;
            }
            if (o1 instanceof Treadmill){
                Treadmill t = (Treadmill) o1;
                p.run(t.getLengh());
            }
            else {
                Wall w = (Wall) o1;
                p.run(w.getHigh());
            }
        }
        if (o instanceof Robot){
            Robot r = (Robot) o;
            if (!r.isCan()){
                return;
            }
            if (o1 instanceof Treadmill){
                Treadmill t = (Treadmill) o1;
                r.run(t.getLengh());
            }
            else {
                Wall w = (Wall) o1;
                r.run(w.getHigh());
            }
        }

    }
}