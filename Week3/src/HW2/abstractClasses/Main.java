package HW2.abstractClasses;

import HW2.abstractClasses.calculator.GameCalculator;
import HW2.abstractClasses.calculator.WomanGameCalculator;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        GameCalculator gameCalculator = new WomanGameCalculator();
        gameCalculator.hesapla();

    }
}
