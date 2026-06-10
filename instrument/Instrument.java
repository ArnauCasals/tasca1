package tasca1;

public abstract class Instrument {

    static {
        System.out.println("🔵 Classe Instrument carregada (STATIC)");
    }

    {
        System.out.println("🟢 Bloc d'inicialització");
    }

    protected String name;
    protected double price;

    public Instrument(String name, double price) {
        System.out.println("🟡 Constructor Instrument");
        this.name = name;
        this.price = price;
    }

    public abstract void play();
}