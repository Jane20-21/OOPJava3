package JavaHomeWork.Zadaha3;

public class Dog extends Animal implements Moving, Eat {
    private String sound;

    public Dog(String name, String sound) {
        super(name);
        this.sound = sound;
    }

    @Override
    public void moving() {
        System.out.println("собака " + name + " подошла и сказала " + sound);
    }

    @Override
    public void eat() {
        System.out.println("собака " + name + " поела");
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
