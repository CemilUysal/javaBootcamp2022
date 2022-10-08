package HW2.inheritanceDemo;

import HW2.inheritanceDemo.manager.AskerKrediManager;

public class Main {

    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager());

    }
}
