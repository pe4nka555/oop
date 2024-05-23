package oop_1.hogwarts;

public class GryffindorStudent extends HogwartsStudent{

    private final int nobility;
    private final int honor;
    private final int bravery;


    public GryffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void innerCompareTo(GryffindorStudent other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println("Сильнее студент " + other.getName());
        } else if (this.scoreSum() > other.scoreSum()){
            System.out.println("Сильнее студент " + this.getName());
        } else {
            System.out.printf("Студенты %s и %s равны по силе %n ", this.getName(), other.getName());
        }
    }

    private int scoreSum() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return super.toString() + ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
}
