package com.tomas.rest.app.core.repository;

import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

/**
 * @author Tomas Yussef Galicia Guzman
 *         email: tomasyussef@gmail.com
 *         date: 17/08/2016
 */
@Repository
public class ImplementDao extends HibernateTemplate implements Dao
{
    @Inject
    public ImplementDao(SessionFactory sessionFactory)
    {
        super(sessionFactory);
    }
    @Override
    public <T> T execute(HibernateCallback<T> hibernateCallback) throws DataAccessException
    {
        return null;
    }
}
