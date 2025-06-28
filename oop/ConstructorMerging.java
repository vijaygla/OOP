public class ConstructorMerging {
    public static void main(String[] args) {
        Dog d = new Dog("Dog", 20, 40, 10);
        System.out.println(d.name);
        System.out.println(d.age);
        System.out.println(d.weight);
        System.out.println(d.sleepHour);
        d.play();
    }
}


class Animals {
    String name;
    int age;
    int weight;

    Animals(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void play() {
        System.out.println("Animals is playing");
    }
}


class Dog extends Animals {
    int sleepHour;

    public Dog(String name, int age, int weight, int sleepHour) {
        super(name, age, weight);
        this.sleepHour = sleepHour;
    }

    void play() {
        super.play();
        System.out.println("Dog is playing");
    }
}

