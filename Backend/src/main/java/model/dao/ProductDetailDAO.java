package model.dao;

import org.hibernate.Session;

import config.DBConfig;
import model.entity.ProductDetail;

public class ProductDetailDAO {
	private DBConfig db;
	private Session sess;
	
	public ProductDetailDAO() {
		db = new DBConfig();
	}
	
	public void insertProductDetail(ProductDetail pd)
	{
		try
		{
			sess = db.getSession();
			sess.beginTransaction();
			sess.save(pd);
			sess.getTransaction().commit();
		}
		catch(Exception ex)
		{
			sess.getTransaction().rollback();
			System.out.println(ex);
		}
	}

}
