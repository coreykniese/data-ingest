package au.com.twitter.ingest.dao;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;

import au.com.twitter.ingest.model.BaseDataEntity;

@SuppressWarnings("rawtypes")
public class GenericHibernateDAO<T extends BaseDataEntity, PK extends Serializable> implements GenericDAO<T, PK> {

    private static final Logger LOGGER = Logger.getLogger(GenericHibernateDAO.class);

    protected SessionFactory sessionFactory;
    @SuppressWarnings("unused")
    private Class<T> persistentClass;

    public GenericHibernateDAO(final Class<T> type) {
        if (!BaseDataEntity.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException("Invalid configuration for DAO<" + type + ">");
        }
        this.persistentClass = type;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PK saveOrUpdate(final T entity) {
        long startTime = System.currentTimeMillis();
        sessionFactory.getCurrentSession().saveOrUpdate(entity);
        if (LOGGER.isDebugEnabled()) {
            logTimeTaken(startTime);
        }
        return (PK) entity.getPrimaryKey();
    }

    private void logTimeTaken(final long startTime) {
        long totalTime = System.currentTimeMillis() - startTime;
        LOGGER.debug("Query ended: [" + totalTime + "ms]");
    }

    /**
     * @return the sessionFactory
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * @param sessionFactory
     *            the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
