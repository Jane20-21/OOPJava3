package JavaHomeWork.Zadaha1;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) throws IOException {
            Person irina = new Person("Ирина", 50);
            Person ilya = new Person("Илья", 60);
            Person vasya = new Person("Вася", 31);
            Person masha = new Person("Маша", 21);
            Person jane = new Person("Женя", 18);
            Person ivan = new Person("Ваня", 5);
            GeoTree gt = new GeoTree();
            gt.appendPerentChild(irina, vasya); 
            gt.appendPerentChild(irina, masha);
            gt.appendPerentChild(vasya, jane); 
            gt.appendPerentChild(vasya, ivan); 
            gt.appendVifeHusbent(irina, ilya);
            gt.appendPerentChild(ilya, vasya); 
            gt.appendPerentChild(ilya, masha); 

            Reserch newReserch = new Reserch(gt);

            System.out.println("Дети Ирины");
            ArrayList<String> result = new Reserch(gt).spend(irina, Relationship.parent);
            System.out.println(result);
            System.out.println("Хотите записать результат в файл? (Yes или No)");
            newReserch.writeInFile(result);

            System.out.println("Дети Игоря");
            ArrayList<String> result1 = new Reserch(gt).spend(ilya, Relationship.parent);
            System.out.println(result1);
            System.out.println("Хотите записать результат в файл? (Yes или No)");
            newReserch.writeInFile(result1);

            System.out.println("Муж Ирины");
            ArrayList<String> result2 = new Reserch(gt).spend(irina, Relationship.wife);
            System.out.println(result2);
            System.out.println("Хотите записать результат в файл? (Yes или No)");
            newReserch.writeInFile(result2);

            ArrayList<String> result3 = new Reserch(gt).searchAge();
            System.out.println(result3);
            System.out.println("Хотите записать результат в файл? (Yes или No)");
            newReserch.writeInFile(result3);
        }
}
