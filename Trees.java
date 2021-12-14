package Lab4;

public class Trees extends Nature implements Creatable{

    public Trees(){
        super("Деревья");
    }

    void toGrowFrom(String from) {
        System.out.printf("%s растут %s\n", getName(), from);
    }

    public String toString(){
        return "Trees_" + getName();
    }
}
