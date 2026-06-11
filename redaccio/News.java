package tasca1.redaccio;

public abstract class Noticia {

    protected String titular;
    protected String text;
    protected int puntuacio;
    protected double preu;

    public abstract void calcularPreuNoticia();

    public abstract void calcularPuntuacioNoticia();
}