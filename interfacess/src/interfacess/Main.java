public class Main {
    public static void main (String[] args){
        Logger[] loggers = {new SmsLogger(), new EmailLogger()};

        CustomerManager customerManager = new CustomerManager(loggers);

        Customer emir = new Customer(1,"Emir","Akyer");

        customerManager.add(emir);
    }

}
