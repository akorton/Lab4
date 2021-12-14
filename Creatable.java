package Lab4;

public interface Creatable {

    default String getCreated(String s){
        return s + " " + getName() + ".";
    }

    String getName();
}
