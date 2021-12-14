package Lab4;

import java.util.Objects;

public class Mama extends Troll implements Creatable{

    public Mama(){
        super("Имя мамы");
        God.toCreate(this);
    }

    public Mama(String name){
        super(name);
        God.toCreate(this);
    }

    void thinkAbout(Thinkable th, String s){
        System.out.printf("%s %s.\n", getName(), th.toThink(s));
    }

    void remember(Rememberable r, String s){
        System.out.printf("%s %s.\n", getName(), r.toRemember(s));
    }

    void doubt(){ System.out.printf("%s %s.\n", getName(), Doubts.values()[(int) (Math.random() * Doubts.values().length)].getDoubt("засомневалась,")); }

    public class Thoughts{
        private String name;

        public Thoughts(){
            name = "Имя";
        }

        public Thoughts(String name){
            this.name = name;
        }

        public void returnWithThoughts(Returnable r, String s){
            System.out.printf("%s %s %s.\n", Mama.this.getName(), this.name, r.toReturn(s));
        }
    }

    public String toString(){
        return "Mama_" + getName();
    }

    public int hashCode(){
        return Objects.hash(getName());
    }

    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(getName(), ((Mama) (o)).getName());
    }
}
