package JavaHomeWork.Zadaha3;

public class Cat extends Animal implements Moving, Eat {
    private String sound;

    public Cat(String name, String sound) {
        super(name);
        this.sound = sound;
    }

    @Override
    public void moving() {
        System.out.println("кошка " + name + " подошла и сказала " + sound);   
    }

    @Override
    public void eat() {
        System.out.println("кошка " + name + " поела");   
    }
}
