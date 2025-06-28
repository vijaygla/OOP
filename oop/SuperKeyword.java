public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.play();
    }
}


class Animals {
    String name;
    int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void play() {
        System.out.println("Animal is playing");
    }
}

class Dog extends Animals {
    int weight;
    
    public Dog() {
        super("DefaultName", 0);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Dog is playing");
    }
}

