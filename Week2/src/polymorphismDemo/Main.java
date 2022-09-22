package polymorphismDemo;


import polymorphismDemo.logger.*;
import polymorphismDemo.manager.CustomerManager;

public class Main {
    public static void main(String[] args) {

        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DataBaseLogger(),new ConsoleLogger()};

        for(BaseLogger logger:loggers) {
            logger.log("Log mesaji");
        }

        CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
        customerManager.add();

    }
}
