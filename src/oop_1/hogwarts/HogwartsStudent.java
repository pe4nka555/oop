package oop_1.hogwarts;
public abstract class HogwartsStudent {

    private final String name;
    private final int magicPower;
    private final int transgressionDistance;


    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }


    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void compareTo(HogwartsStudent other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.printf("При сравнении %s и %s сильнее %s%n", this.getName(), other.getName(), other.getName());
        } else if (this.scoreSum() > other.scoreSum()){
            System.out.printf("При сравнении %s и %s сильнее %s%n", this.getName(), other.getName(), this.getName());
        } else {
            System.out.printf("При сравнении %s и %s студенты равны %n", this.getName(), other.getName());
        }
    }

    private int scoreSum() {
        return magicPower + transgressionDistance;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance;
    }
}

