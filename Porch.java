package Lab4;

import java.util.Objects;

public class Porch implements Watchable{
    private boolean tobe;
    private String leadTo;
    private String name;

    public Porch(){
        tobe = true;
        leadTo = null;
        name = "Крыльцо";
    }

    public Porch(boolean tobe, String leadTo, String name){
        this.tobe = tobe;
        this.leadTo = leadTo;
        this.name = name;
    }

    public String toWatch(String s){
        return s + " " + name + (leadTo != null ? ", ведущего в " + leadTo : "") + ".";
    }

    public String getLeadTo(){
        return leadTo;
    }

    void changeBeing(){
        tobe = !tobe;
        if (!tobe) {
            System.out.printf("%s не стало, потому что оно %s.\n", name, reasonNotToBe());
        }
        else{
            System.out.printf("%s вновь появилось.\n", name);
        }
    }

    String reasonNotToBe(){
        return Reasons.values()[(int) (Math.random() * Reasons.values().length)].getReason();
    }

    public String toString(){
        return "Porch_" + name + "_" + leadTo + "_" + tobe;
    }

    public int hashCode(){
        return Objects.hash(name, leadTo, tobe);
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Porch p = (Porch) (o);
        return Objects.equals(tobe, p.tobe) && Objects.equals(leadTo, p.leadTo) && Objects.equals(name, p.name);
    }
}
