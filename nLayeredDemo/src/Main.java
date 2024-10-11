import java.util.ArrayList;

import jLogger.JLoggerManager;
import nLayeredDemo.business.abstracts.ProductServices;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.cores.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

    public static void main(String[] args) {
        //Todo: Spring IoC ile çözülecek
        ProductServices productService = new ProductManager(new AbcProductDao(), new jLoggerManagerAdapter());
        
        Product product = new Product(1,2,"Elma",12,50);
        productService.add(product);

    }

}
