package HW2.interfaces.dataAccess;

public class OracleCustomerDal implements CustomerDal,Repository{
    @Override
    public void Add() {
        System.out.println("Oracle eklendi");

    }
}
