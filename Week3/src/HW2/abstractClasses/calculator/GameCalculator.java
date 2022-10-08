package HW2.abstractClasses.calculator;

public abstract class GameCalculator {
    public abstract void hesapla();
    public final void gameOver() {
        System.out.println("Oyun bitti");
    }
}
