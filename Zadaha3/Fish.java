package JavaHomeWork.Zadaha3;

public class Fish extends Animal implements Moving, Eat {
    private int size;

    public Fish(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void moving() {
        System.out.println("рыбка " + name + " подплыла к кормушке");
    }

    @Override
    public void eat() {
        System.out.println("рыбка " + name + " поела");
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "рыбка " + name + " имеет размер "+ size;
    }
}
