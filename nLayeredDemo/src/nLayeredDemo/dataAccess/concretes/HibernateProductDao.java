package nLayeredDemo.dataAccess.concretes;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;


public class HibernateProductDao implements ProductDao{

    @Override
    public void add(Product product) {
        System.out.println("Hibarnate ile eklendi." + product.getName());
        
    }

    @Override
    public void delete(Product product) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Product get(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(Product product) {
        // TODO Auto-generated method stub
        
    }

} 
