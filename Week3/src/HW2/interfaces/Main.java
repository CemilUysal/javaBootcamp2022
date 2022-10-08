package HW2.interfaces;

import HW2.interfaces.dataAccess.CustomerDal;
import HW2.interfaces.dataAccess.MySqlCustomerDal;
import HW2.interfaces.dataAccess.OracleCustomerDal;
import HW2.interfaces.manager.CustomerManager;

public class Main {
    public static void main(String[] args) {
        CustomerDal customerDal = new MySqlCustomerDal();
        customerDal.Add();

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        //customerManager.customerDal = new OracleCustomerDal();
        customerManager.add();

    }
}
