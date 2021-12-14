package Lab4;

import java.util.Objects;

public class Saray implements Creatable{
    private String name;

    public Saray(String name){
        this.name = name;
        God.toCreate(this);
    }

    public void sink(){
        System.out.println("Хоть сам " + getName() + " давно утонул...");
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Saray_" + getName();
    }

    public int hashCode(){
        return Objects.hash(getName());
    }

    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(getName(), ((Saray) (o)).getName());
    }

    static class PieceOfRoof implements Clingable{
        private String name;

        public PieceOfRoof(String name){
            this.name = name;
        }

        public void raiseUpon(String s){
            System.out.println(getName() + " возвышается над " + s + ".");
        }

        public String getName() {return name;}

        public String toCling(String s){
            return s + " " + getName() + " .";
        }

        public String toString(){
            return "Saray.PieceOfRoof_" + name;
        }

        public int hashCode(){
            return Objects.hash(getName());
        }

        public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            return Objects.equals(getName(), ((PieceOfRoof) (o)).getName());
        }
    }
}
