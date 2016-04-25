package com.myproject.showcase.web.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.myproject.showcase.web.model.User;



@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	public User findById(int id) {
		return getByKey(id);
	}

	public User findBySSO(String sso) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("ssoId", sso));
		return (User) crit.uniqueResult();
	}

	@Override
	public User findByName(String name) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("firstName", name));
		return (User) crit.uniqueResult();
	}

	@Override
	public void saveUser(User user) {
		getSession().save(user);
	}

	@Override
	public void updateUser(User user) {
		getSession().update(user);
	}

	@Override
	public void deleteUserById(long id) {
		Query query = getSession().createSQLQuery("delete from User where id = :id");
        query.setLong("id", id);
        query.executeUpdate();	
    }

	@Override
	public List<User> findAllUsers() {
		Criteria criteria  = getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}

	@Override
	public void deleteAllUsers() {
		Query query = getSession().createSQLQuery("delete from User");
        query.executeUpdate();
		
	}

	@Override
	public boolean isUserExist(User user) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("ssoId", user.getSsoId()));
		return crit.uniqueResult() != null ? true : false;
	}
	
	

	
}
