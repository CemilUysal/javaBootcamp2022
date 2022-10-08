package HW2.interfaces.dataAccess;

public class MySqlCustomerDal implements CustomerDal, Repository{
    @Override
    public void Add() {
        System.out.println("My Sql Eklendi");

    }
}
