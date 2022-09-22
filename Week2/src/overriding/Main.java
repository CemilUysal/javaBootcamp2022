package overriding;

import overriding.manager.BaseKrediManager;
import overriding.manager.OgrenciKrediManager;
import overriding.manager.OgretmenKrediManager;
import overriding.manager.TarimKrediManager;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] baseKrediManager = new BaseKrediManager[] {new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};

        for(BaseKrediManager krediManager : baseKrediManager) {

            System.out.println(krediManager.hesapla2(1000));
            System.out.println(krediManager.hesapla(1000));
            System.out.println("********");
        }

    }
}
