package inheritance;

import inheritance.entity.Customer;
import inheritance.entity.Employee;
import inheritance.manager.CustomerManager;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.firstName ="inci";
        customer.email="blbal@";

        Employee employee = new Employee();
        employee.firstName ="employee person";
        employee.salary=3000;

        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
    }
}
