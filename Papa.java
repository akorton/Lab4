package Lab4;

import java.util.Objects;

public class Papa extends Troll{
    private boolean isWorking = false;
    private boolean isSleeping = true;
    public Papa(){
        super("Папа");
        God.toCreate(this);
    }

    public Papa(String name){
        super(name);
        God.toCreate(this);
    }

    public Papa(String name, boolean isSleeping){
        super(name);
        this.isSleeping = isSleeping;
        God.toCreate(this);
    }

    public void nod() {System.out.println(getName() + " кивнул.");}

    public void hideIn(String s) {System.out.println(getName() + " скрылся в " + s + ".");}

    public void returnWith(String s) {System.out.println(getName() + " вернулся со " + s + ".");}

    public void work() throws PapaCantWorkHeIsSleeping {
        if (!isSleeping) {
            isWorking = true;
            System.out.println(getName() + " начал работать.");
        }
        else {
            throw new PapaCantWorkHeIsSleeping("Папа не может начать работать, потому что уснул. Все, кто хотел посмотреть, могут расходиться.");
        }
    }

    public String toWatch(String s){
        return s + " " + getName() + " " + (isWorking ? "работает." : "оказывает моральную поддержку тем, кто работает.");
    }

    public String toString(){
        return "Papa_" + getName() + "_" + isWorking + "_" + isSleeping;
    }

    public int hashCode(){
        return Objects.hash(getName(), isWorking, isSleeping);
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Papa papa = (Papa) (o);
        return Objects.equals(getName(), papa.getName()) && Objects.equals(isWorking, papa.isWorking) && Objects.equals(isSleeping, papa.isSleeping);
    }
}
