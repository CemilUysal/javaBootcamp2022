package HW1.objectOrientedProgramming.manager;

public abstract class BaseCreditManager implements CreditManager{
    @Override
    public abstract void Calculate() ;

    @Override
    public void save() {
        System.out.println("Kaydedildi");
    }
}
