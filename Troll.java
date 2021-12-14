package Lab4;

public abstract class Troll implements Creatable, Watchable, Surroundable{
    private String name;

    public Troll(){
        name = "Имя троля";
    }

    public Troll(String name){
        this.name = name;
    }

    public String toWatch(String s){
        return s + " " + name + ".";
    }

    public void toSurround(Troll t, String s){
        System.out.println(name + " " + s + " " + t.getName() + ".");
    }
    public void watchAt(Watchable w, String s){System.out.println(getName() + " " + w.toWatch(s));}

    public String getName(){return name;}

}
