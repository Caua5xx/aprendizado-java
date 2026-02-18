package UmMinuto;

public class Timer {
    
    private ClockHand segundos;
    private ClockHand milesimos;
    
    public Timer() {
        this.segundos = new ClockHand(60);
        this.milesimos = new ClockHand(100);
    }

    public void advance() {
        milesimos.advance();
        if (milesimos.value() == 0) {
            segundos.advance();
        }
    }

    @Override
    public String toString() {
        return segundos + " : " + milesimos;
    }
}