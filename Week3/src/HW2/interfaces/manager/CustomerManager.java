package HW2.interfaces.manager;

import HW2.interfaces.dataAccess.CustomerDal;

public class CustomerManager {
    private CustomerDal customerDal;

    public CustomerManager(CustomerDal customerDal) {
        this.customerDal = customerDal;
    }
    public void add() {
        customerDal.Add();
    }
}
