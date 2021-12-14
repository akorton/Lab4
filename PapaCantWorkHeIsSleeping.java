package Lab4;

public class PapaCantWorkHeIsSleeping extends Exception{

    public PapaCantWorkHeIsSleeping(){
        super();
    }

    public PapaCantWorkHeIsSleeping(String message){
        super(message);
    }

    public PapaCantWorkHeIsSleeping(String message, Throwable cause){
        super(message, cause);
    }

    public PapaCantWorkHeIsSleeping(Throwable cause){
        super(cause);
    }

    protected PapaCantWorkHeIsSleeping(String message, Throwable cause,
                                       boolean EnableSuppression,
                                       boolean writableStackTrace){
        super(message, cause, EnableSuppression, writableStackTrace);
    }
}
