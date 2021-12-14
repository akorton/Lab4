package Lab4;

import java.util.Objects;

public abstract class Nature implements Creatable{
    private String name;

    public Nature(){
        name = "Имя";
        God.toCreate(this);
    };

    public Nature(String name){
        this.name = name;
        God.toCreate(this);
    }


    public String getName(){return name;}

    public String toString(){
        return "Nature_"+name;
    }

    public int hashCode(){
        return Objects.hash(name);
    }

    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(name, ((Nature) (o)).name);
    }
}
