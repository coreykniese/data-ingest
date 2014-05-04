package au.com.twitter.ingest.dao;

import java.io.Serializable;

import au.com.twitter.ingest.model.BaseDataEntity;


@SuppressWarnings("rawtypes")
public interface GenericDAO <T extends BaseDataEntity, PK extends Serializable> {

    public abstract PK saveOrUpdate(final T entity);
    
}
