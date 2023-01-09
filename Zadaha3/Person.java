package JavaHomeWork.Zadaha3;

import java.util.Scanner;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void choice() {
        System.out.println("Что вы хотите сделать? \n"
                + "1 - покормить собаку \n"
                + "2 - покормить кошку \n"
                + "3 - покормить рыбку");
    }

    public int call(Dog dog, Cat cat) {
        Scanner in = new Scanner(System.in);
        int personChoice = in.nextInt();
        in.close();
        if (personChoice == 1) {
            System.out.println(dog.name + ", иди сюда");
        } else if (personChoice == 2) {
            System.out.println(cat.name + ", иди сюда");
        }
        return personChoice;   
    }

    public void getFeed() {
        System.out.println(name + " насыпал корм");
    }
}
