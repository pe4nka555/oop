package oop_1.hogwarts;

public class HufflepuffStudent extends HogwartsStudent {

    private final int hardworking;
    private final int loyalty;
    private final int honesty;


    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int hardworking, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void innerCompareTo(HufflepuffStudent other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println("Сильнее студент " + other.getName());
        } else if (this.scoreSum() > other.scoreSum()){
            System.out.println("Сильнее студент " + this.getName());
        } else {
            System.out.printf("Студенты %s и %s равны по силе %n ", this.getName(), other.getName());
        }
    }

    private int scoreSum() {
        return hardworking + loyalty + honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }

}



