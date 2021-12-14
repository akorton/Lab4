package Lab4;

import java.io.ObjectStreamClass;
import java.util.Objects;

public class Wardrobe implements Rememberable, Returnable{
    private String inside;
    private String name;

    public Wardrobe(){
        name = "Шкаф";
        inside = null;
    }

    public Wardrobe(String name, String inside){
        this.name = name;
        this.inside = inside;
    }

    public String toRemember(String s){
        return s + " " + name + (inside != null ? ", где хранилась " + inside : ", где ничего не хранилось");
    }

    public String toReturn(String s) {
        return s + " " +name;
    }

    public String getInside(){
        return inside;
    }

    public String toString(){
        return "Wardrobe_" + inside + "_" + name;
    }

    public int hashCode(){
        return Objects.hash(inside, name);
    }

    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wardrobe w = (Wardrobe) (o);
        return Objects.equals(inside, w.inside) && Objects.equals(name, w.name);
    }
}
