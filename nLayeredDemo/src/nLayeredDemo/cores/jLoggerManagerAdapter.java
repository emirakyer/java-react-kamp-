package nLayeredDemo.cores;

import jLogger.JLoggerManager;

public class jLoggerManagerAdapter implements LoggerService {

    @Override
    public void logToSystem(String message) {
        JLoggerManager manager = new JLoggerManager();
        manager.log(message);
    }

}
