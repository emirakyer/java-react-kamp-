import inheritance.src.CustomerManager;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new EmailLogger());
    }
}
s