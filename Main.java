package tasca1;
public class Main {

    public static void main(String[] args) {

        Instrument wind = new WindInstrument("Flute", 150);
        Instrument string = new StringInstrument("Guitar", 300);
        Instrument percussion = new PercussionInstrument("Drum", 200);

        wind.play();
        string.play();
        percussion.play();
    }
}