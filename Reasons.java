package Lab4;

public enum Reasons {
    HIDEINWATER("скрылось в беспокойной воде"),
    WASSTOLEN("было украдено"),
    WASEATEN("было съедено"),
    GETOUTTHROUGHTWINDOW("вывалилась в окно");

    private String reason;

    Reasons(String reason){
        this.reason = reason;
    }
    public String getReason(){
        return reason;
    }
    public String getNegativeReason(){ return "не " + reason; }

    public String toString(){
        return "Reasons_" + reason;
    }
}
