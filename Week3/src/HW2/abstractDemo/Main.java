package HW2.abstractDemo;

import HW2.abstractDemo.manager.*;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();

    }
}
