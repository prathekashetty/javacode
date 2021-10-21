package com.wolken.marketsex.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.wolken.marketsex.entity.MarketsDetailsEntity;
import com.wolken.marketsex.utils.HibernateUtils;

public class MarketDAOImpl implements MarketDAO
{
	public boolean save(MarketsDetailsEntity details) {
		boolean result =false;
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(details);
			transaction.commit();
			if(result)
				return false;
			else
				return true;
		}
		finally {
			session.close();
		}
		
	}

	public void getByid(int id) {
		SessionFactory factory=null;
		Session session=null;
		MarketsDetailsEntity details=null;
		
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			System.out.println(id);
			details=session.get(MarketsDetailsEntity.class, id);	
			System.out.println(details);
		}
		finally {
			session.close();
		}
	}

	
	public boolean update(MarketsDetailsEntity details) {
		boolean result =false;
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.saveOrUpdate(details);
			transaction.commit();
			if(result)
				return false;
			else
				return true;
		}
		finally {
			session.close();
		}
		
	}


	public boolean delete(MarketsDetailsEntity details) {
		boolean result =false;
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.delete(details);
			transaction.commit();
			if(result)
				return false;
			else
				return true;
		}
		finally {
			session.close();
		}
		
	}

}
