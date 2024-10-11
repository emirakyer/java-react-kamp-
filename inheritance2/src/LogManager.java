package inheritance2;

import javax.xml.crypto.Data;

public class LogManager {
    public void log(int LogType) {
        if(LogType == 1) {
            DatabaseLogger.log();
        }else if(LogType == 2) {
            System.out.println("Dosyaya loglandı.");
        }else {
            System.out.println("Email Gönderildi.");
        }
    }
}
