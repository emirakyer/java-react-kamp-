package nLayeredDemo.business.concretes;

import java.util.List;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.business.abstracts.ProductServices;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.cores.LoggerService;

public class ProductManager implements ProductServices {
    
    private ProductDao productDao;
    private LoggerService loggerService;
    
    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getCategoryId()==1){
            System.out.println("Bu kategoride ürün kabul edilmiyor");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Ürün eklendi "+ product.getName());
    }

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

}
