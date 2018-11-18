package co.com.hibernate.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionHibernate {

	private Session se;

	public SessionHibernate() {

		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory session = conf.buildSessionFactory();
		se = session.openSession();
		se.beginTransaction();
	}

	public Session openSession() {

		return se;
	}

}
