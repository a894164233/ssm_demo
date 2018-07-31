/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ssm.dao;

import com.ssm.entity.Hbm;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author newtranx_011
 */
public class HbmDao {

	private SessionFactory sessionFactory;
	private PlatformTransactionManager platformTransactionManager;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
		this.platformTransactionManager = platformTransactionManager;
	}

	public void create(String msg) {
		HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
		Hbm hbm = new Hbm();
		hbm.setName("hbm5");
		hbm.setMsg("hbm5");
		hibernateTemplate.saveOrUpdate(hbm);
	}

}
