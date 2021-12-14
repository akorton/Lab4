package Lab4;

public class Main {

    public static void main(String... args) {
        class MumiTrollsFamily implements Creatable {
            final private String name = "Семья муми-троллей";

            public MumiTrollsFamily() {
                God.toCreate(this);
            }

            public void getUp() {
                System.out.println(name + " проснулась.");
            }

            public void rushTo(String s) {
                System.out.println(name + " бросилась к " + s + ".");
            }

            public String getName() {
                return name;
            }
        }

        MumiTrollsFamily mtf = new MumiTrollsFamily();
        mtf.getUp();
        mtf.rushTo("окну");

        BabyMu bm = new BabyMu("Малышка Мю");
        bm.getPlacedTo("подоконник");

        Mumla m = new Mumla("Мумла");
        m.holdTroll(bm);

        God.change(new Changable(){
            private String name = "Весь мир";

            public String toChange() {
                return name + " изменился.";
            }
        });

        makeDesroyable md = (name) -> {
            return () -> "Не стало " + name + ".";
        };

        God.destroy(md.make("жасмина"));
        God.destroy(md.make("сирени"));
        God.destroy(md.make("моста"));
        God.destroy(md.make("целой реки"));

        if (Math.random() > 0.9){
            God.destroy(new Destroyable() {

                public String toDestroy() throws WorldWasDestroyed {
                    throw new WorldWasDestroyed("Мир был случайно уничтожен... Бывает.");
                }
            });
        }

        Saray saray = new Saray("Дровяной сарай");
        saray.sink();
        Saray.PieceOfRoof roof = new Saray.PieceOfRoof("Часть крыши дровяного сарая");
        roof.raiseUpon("водой");

        class CompanyOfForestMen implements Creatable {
            final private String name = "Компания продрогших лесных жителей";

            public CompanyOfForestMen() {
                God.toCreate(this);
            }

            public void cling(Clingable c) {
                System.out.println(getName() + " " + c.toCling("судорожно цеплялась за"));
            }

            public String getName() {
                return name;
            }
        }

        CompanyOfForestMen cofm = new CompanyOfForestMen();
        cofm.cling(roof);

        Trees trees = new Trees();
        trees.toGrowFrom("прямо из воды.");
        Mountains mountains = new Mountains();
        mountains.toBreakUp("множество каменных островков");
        Mama mama = new Mama("Мама");
        Porch porch = new Porch(true, "гостиную", "Крыльцо");
        mama.watchAt(porch, "посмотрела в сторону");
        porch.changeBeing();
        mama.thinkAbout(new Thinkable() {
            String name = "Кухня";

            public String toThink(String s) {
                return s + " " + name;
            }
        }, "подумала о");
        Wardrobe wardrobe = new Wardrobe("Навесной шкафчик", "банка с кофе");
        mama.remember(wardrobe, "вспомнила");
        mama.doubt();
        Mama.Thoughts mamathoughts = mama.new Thoughts("Мыслями");
        mamathoughts.returnWithThoughts(new Wardrobe(), "все время возращалась мыслями к");

        Papa p = new Papa("Муми-папа", Math.random() > 0.6);
        Troll[] trolls = new Troll[]{bm, m, mama, p};
        String PapaPhrase = "посмотрел на";
        for (Troll t : trolls) {
            if (t != p) {
                p.watchAt(t, PapaPhrase);
            }
        }
        p.nod();
        p.hideIn("своей комнате");
        p.returnWith("сверлом и пилой");
        try {
            p.work();
            String interesting = "с интересом наблюдала как";
            for (Troll t : trolls) {
                if (t != p) {
                    t.toSurround(p, "обступила");
                    t.watchAt(p, interesting);
                }
            }
        } catch (PapaCantWorkHeIsSleeping e){
            System.out.println(e.getMessage());
        }
    }
}
