package JavaHomeWork.Zadaha3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Сергей"); 
        Dog dog = new Dog("Барбос", "гав-гав"); 
        Cat cat = new Cat("Мурзик", "мяу-мяу"); 
        Fish fish = new Fish("Золотко", 10); 
        Fish whale = new Fish("Сом", 20000); 
        Fish shark = new Fish("Акула", 4000); 
        Fish carp = new Fish("Карп", 30); 
        Fish petyshok = new Fish("Петушок", 9); 
        Fish barbus = new Fish("Барбус", 15);

        person.choice(); 
        int personChoise = person.call(dog, cat);
        if (personChoise == 1) { 
            dog.moving(); 
            person.getFeed(); 
            dog.eat(); 
        } else if (personChoise == 2) {
            cat.moving(); 
            person.getFeed(); 
            cat.eat(); 
        } else if (personChoise == 3) {
            person.getFeed(); 
            fish.moving();
            fish.eat(); 
        }

        ArrayList<Fish> fishArray = new ArrayList<>();
        fishArray.add(whale);
        fishArray.add(shark);
        fishArray.add(carp);
        fishArray.add(petyshok);
        fishArray.add(barbus);
        Collections.sort(fishArray, new FishSizeComparator());
        System.out.println("\nСортируем рыбок по размеру:");
        for (Fish element : fishArray) {
            System.out.println(element);
        }
        System.out.println("\nАквариумные рыбки:");
        for (Fish element : fishArray) {
            if (element.getSize() < 15) {
                System.out.println(element);
            }      
        }
    }
}
