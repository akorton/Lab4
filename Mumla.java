package Lab4;

import java.util.Objects;

public class Mumla extends Troll{

    public Mumla(String name) {
        super(name);
        God.toCreate(this);
    }

    void holdTroll(Troll t){
        System.out.println(getName() + " держала " + t.getName() + ", чтобы " + t.getName() + " " + Reasons.values()[(int) (Math.random() * Reasons.values().length)].getNegativeReason() + ".");
    }

    public String toString(){
        return "Mumla_" + getName();
    }

    public int hashCode(){
        return Objects.hash(getName());
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(getName(), ((Mumla) (o)).getName());
    }
}
