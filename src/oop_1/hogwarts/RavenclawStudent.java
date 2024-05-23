package oop_1.hogwarts;

public class RavenclawStudent extends HogwartsStudent {

    private final int intelligence;
    private final int wisdom;
    private final int wit;
    private final int creativity;


    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void innerCompareTo(RavenclawStudent other) {
        if (this.scoreSum() < other.scoreSum()) {
            System.out.println("Сильнее студент " + other.getName());
        } else if (this.scoreSum() > other.scoreSum()){
            System.out.println("Сильнее студент " + this.getName());
        } else {
            System.out.printf("Студенты %s и %s равны по силе %n ", this.getName(), other.getName());
        }

    }

    private int scoreSum() {
        return intelligence + wisdom + wit + creativity;
    }

    @Override
    public String toString() {
        return super.toString() + ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }
}
