package inheritance.src;

import javax.print.DocFlavor.STRING;

public class Main {
    public static void main(String[] args) {

        IndividualCustomer engin = new IndividualCustomer();
        engin.customerNumber = "12345";

        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber= "Hepsi Burada";

        sendikaCustomer abc = new sendikaCustomer();
        abc.customerNumber = "9999";

        CustomerManager customerManager = new CustomerManager();
        //customerManager.add(hepsiBurada);
        //customerManager.add(engin);
        //customerManager.add(abc);
        
        Customer[] customers = {engin, abc, hepsiBurada};

        customerManager .addMultiple(customers);

    }


}
