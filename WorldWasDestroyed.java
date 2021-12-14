package Lab4;

public class WorldWasDestroyed extends RuntimeException{

    public WorldWasDestroyed(){
        super();
    }

    public WorldWasDestroyed(String message){
        super(message);
    }

    public WorldWasDestroyed(String message, Throwable cause){
        super(message, cause);
    }

    public WorldWasDestroyed(Throwable cause){
        super(cause);
    }

    protected WorldWasDestroyed(String message, Throwable cause,
                                boolean enableSuppression,
                                boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
