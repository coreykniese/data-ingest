package au.com.twitter.ingest.model;


import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

public class BaseDataEntity<PK extends Serializable> implements Serializable, Comparable<BaseDataEntity<PK>> {

    private static final long serialVersionUID = -6694758410373219009L;
    
    private PK primaryKey;

    public BaseDataEntity() {
    }

    public BaseDataEntity(PK primaryKey) {
        setPrimaryKey(primaryKey);
    }

    public PK getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(PK pk) {
        this.primaryKey = pk;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(this.getClass().isAssignableFrom(obj.getClass()))) {
            return false;
        }
        
        if (obj == this) {
            return true;
        }

        @SuppressWarnings("unchecked")
        BaseDataEntity<PK> other = (BaseDataEntity<PK>) obj;
        return new EqualsBuilder().append(this.getPrimaryKey(), other.getPrimaryKey()).isEquals();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(this.getPrimaryKey()).toHashCode();
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(BaseDataEntity<PK> other) {
        if (other == null || !(this.getClass().isAssignableFrom(other.getClass()))) {
            return 1;
        }
        return new CompareToBuilder().append(primaryKey, other.getPrimaryKey()).toComparison();
    }
}
