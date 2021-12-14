package Lab4;

public class God {

    static {
        System.out.println("Сначала был создан Бог...");
    }

    static void toCreate(Creatable c){
        System.out.println(c.getCreated("Затем Бог создал"));
    }

    static void change(Changable c){
        System.out.println(c.toChange());
    }

    static void destroy(Destroyable d){
        System.out.println(d.toDestroy());
    }
}
