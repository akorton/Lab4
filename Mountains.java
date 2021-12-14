package Lab4;

public class Mountains extends Nature implements Creatable{

    public Mountains(){
        super("Цепи гор");
    }

    public void toBreakUp(String s){
        System.out.printf("%s распались на %s.\n", getName(), s);
    }

    public String toString(){
        return "Mountains_" + getName();
    }
}
