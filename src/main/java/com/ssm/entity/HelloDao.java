/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.ssm.entity;

import org.springframework.beans.BeanWrapper;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class HelloDao {
	private DataSource dataSource;
	private PlatformTransactionManager platformTransactionManager;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
		this.platformTransactionManager = platformTransactionManager;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void queryAll() {
		List<User> userList = this.jdbcTemplate.query("select * from user", new Object[]{}, new BeanPropertyRowMapper<>(User.class));
		userList.forEach(user -> System.out.println(user.getName()));

//		int i = 1/0;
	}

	public void create4(String msg) {
		this.jdbcTemplate.update("insert into user(name, msg) values('test4', 'test4')");
		this.jdbcTemplate.update("insert into user(name, msg) values(?, ?)", "test4", "test4");
		this.jdbcTemplate.update("insert into user(name, msg) values(?, ?)", new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement preparedStatement) throws SQLException {
				preparedStatement.setString(1, "test4");
				preparedStatement.setString(2, "test4");
			}
		});
		this.jdbcTemplate.update("update user set name=?, msg=? where id=?", "test4", "test4", 1);
//		int i = 1/0;
	}

	public Object create1(String msg) {
		TransactionTemplate transactionTemplate = new TransactionTemplate(platformTransactionManager);
		Object result = transactionTemplate.execute(status -> {
			//do something
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			jdbcTemplate.execute("insert into user(name, msg) values('test', 'test')");
			int i = 1/0;
			Object result1 = null;
			return result1;
		});
		return result;
	}

	public void create3(String msg) {
		TransactionTemplate transactionTemplate = new TransactionTemplate(platformTransactionManager);
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				//do something
				JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
				jdbcTemplate.execute("insert into user(name, msg) values('test', 'test')");
				int i = 1/0;
			}
		});
	}


	public Object create2(String msg) {
		DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = platformTransactionManager.getTransaction(defaultTransactionDefinition);
		try {
			this.jdbcTemplate.update("insert into user(name, msg) values('test1', 'test1')");
		} catch (DataAccessException e) {
			platformTransactionManager.rollback(transactionStatus);
			throw e;
		} finally {
			platformTransactionManager.commit(transactionStatus);
		}


//		TransactionTemplate transactionTemplate = new TransactionTemplate(platformTransactionManager);
//		Object result = transactionTemplate.execute(status -> {
//			//do something
//			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//			jdbcTemplate.execute("insert into user(name, msg) values('test', 'test')");
//			int i = 1/0;
//			Object result1 = null;
//			return result1;
//		});
//		return result;
		return null;
	}
}
