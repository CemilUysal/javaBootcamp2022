package HW1.objectOrientedProgramming;


import HW1.objectOrientedProgramming.entity.Customer;
import HW1.objectOrientedProgramming.manager.CustomerManager;
import HW1.objectOrientedProgramming.manager.TeacherCreditManager;

public class Main {
    public static void main(String[] args) {

        /*
        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Ankara");
        Company company = new Company();
        company.setTaxNumber("123456");
        company.getTaxNumber();
        Person person = new Person();
        person.setFirstName("Abidin");
        person.setLastName("Gülsün");
        person.setNationalIdentity("1232134");
        CustomerManager customerManager = new CustomerManager(person);
        customerManager.save();
        customerManager.delete();
        CreditManager creditManager = new CreditManager(company);//örneğini oluşturma
        creditManager.Calculate();
        creditManager.save();
        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();
        */

        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.save();
        customerManager.giveCredit();
        customerManager.delete();

    }
}
