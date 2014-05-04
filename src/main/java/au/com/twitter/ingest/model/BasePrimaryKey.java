package au.com.twitter.ingest.model;

import java.io.Serializable;

import org.apache.commons.collections4.comparators.ComparableComparator;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


public class BasePrimaryKey implements Serializable, Comparable<BasePrimaryKey> {

    private static final long serialVersionUID = -6965687335093034086L;

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    @SuppressWarnings("unchecked")
    public int compareTo(BasePrimaryKey obj) {
        return ComparableComparator.INSTANCE.compare(this, obj);
    }

}
