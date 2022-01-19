package com.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.model.CountryModel;
import com.model.StateModel;
@Repository

public class DAO {
	
	@Autowired
	private SessionFactory sf;

	public void insert(CountryModel cm) {
		try {
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			s.saveOrUpdate(cm);
			t.commit();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List search() {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		Session s=sf.openSession();
		Query q=s.createQuery("from CountryModel");
		ls=q.list();
		s.close();
		return ls;
	}

	public void delete(CountryModel cm) {
		try {
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			s.delete(cm);;
			t.commit();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public List edit(CountryModel cm) {
		
		List ls=new ArrayList();
		Session s=sf.openSession();
		Query q=s.createQuery("from CountryModel where id="+cm.getId());
		ls=q.list();
		s.close();
		return ls;
	}

	public void insertState(StateModel sm) {
		// TODO Auto-generated method stub
		try {
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			s.saveOrUpdate(sm);
			t.commit();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List searchState() {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		Session s=sf.openSession();
		Query q=s.createQuery("from StateModel");
		ls=q.list();
		s.close();
		return ls;
	}

	public void deleteState(StateModel sm) {
		// TODO Auto-generated method stub
		try {
			Session s = sf.openSession();
			Transaction t = s.beginTransaction();
			s.delete(sm);;
			t.commit();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public List edithState(StateModel sm) {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		Session s=sf.openSession();
		Query q=s.createQuery("from StateModel where id="+sm.getId());
		ls=q.list();
		s.close();
		return ls;
	}

}
