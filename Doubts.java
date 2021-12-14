package Lab4;

public enum Doubts{
    TOGETTOKITCHEN("удастся ли ей попасть на кухню"),
    DONTFORGET("не забыла ли она выключить утюг"),
    ISEVERYTHINGOKEY("все ли в порядке");


    private String doubt;

    Doubts(String doubt){
        this.doubt = doubt;
    }

    public String getDoubt(String s){
        return s + " " + doubt;
    }

    public String toString(){
        return "Doubts_" + doubt;
    }

}
