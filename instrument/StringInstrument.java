package tasca1.instrument;

public class StringInstrument extends Instrument {

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A string instrument is playing");
    }
}