package overriding.manager;

public class BaseKrediManager {
    public double hesapla(double tutar) {
        return tutar*1.14;
    }

    public final double hesapla2(double tutar) {
        return tutar*1.20;
    }
}
