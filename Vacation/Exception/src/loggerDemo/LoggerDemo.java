package loggerDemo;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo{
    public static void main(String []args){    
        Logger logger = Logger.getLogger("com.mycompany.myapp");
        logger.setLevel(Level.FINE);
		logger.warning("������Ϣ");
        logger.fine("name");
           
    }
}
