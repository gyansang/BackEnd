package config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.entity.ProductDetail;

public class DBConfig {
	
	private Configuration cfg;
	private SessionFactory sf;
	private Session sess;
	public DBConfig() {
			cfg = new Configuration();
			sf = cfg.configure("hibernate.cfg.xml").addAnnotatedClass(ProductDetail.class).buildSessionFactory();
	}
	public Session getSession()
	{
		sess = sf.getCurrentSession();
		return sess;
	}
}
