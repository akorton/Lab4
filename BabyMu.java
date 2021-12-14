package Lab4;

import java.util.Objects;

public class BabyMu extends Troll{

    public BabyMu(String name){
        super(name);
        God.toCreate(this);
    }

    public void getPlacedTo(String s){
        System.out.println(getName() + " поставили на " + s + ".");
    }

    public String toString(){
        return "BabyMu_" + getName();
    }

    public int hashCode(){
        return Objects.hash(getName());
    }

    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(getName(), ((BabyMu) (o)).getName());
    }
}
