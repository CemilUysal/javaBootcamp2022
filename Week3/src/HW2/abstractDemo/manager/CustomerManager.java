package HW2.abstractDemo.manager;

public class CustomerManager {
    public BaseDatabaseManager databaseManager; //hangi veritabanını verirsen o çalışır
    public void getCustomers() {
        databaseManager.getData();
    }
}
