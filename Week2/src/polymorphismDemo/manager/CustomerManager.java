package polymorphismDemo.manager;

import polymorphismDemo.logger.BaseLogger;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger =logger;
    }
    public void add() {
        System.out.println("Customer added!:");
        this.logger.log("log mesajı");
    }
}
