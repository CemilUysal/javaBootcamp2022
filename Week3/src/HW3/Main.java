package HW3;


import HW3.core.logging.DatabaseLogger;
import HW3.core.logging.FileLogger;
import HW3.core.logging.Logger;
import HW3.core.logging.MailLogger;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
    }
}
