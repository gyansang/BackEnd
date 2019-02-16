package etech.com.Backend;

import model.entity.ProductDetail;
import model.dao.ProductDetailDAO;

public class App 
{
    public static void main( String[] args )
    {
        ProductDetail pd = new ProductDetail("Laptop", 500);
        ProductDetailDAO pdo = new ProductDetailDAO();
        pdo.insertProductDetail(pd);
        System.out.println("Success");
    }
}
