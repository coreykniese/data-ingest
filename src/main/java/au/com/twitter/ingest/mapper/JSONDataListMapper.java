package au.com.twitter.ingest.mapper;

import java.util.List;

import org.apache.commons.lang.Validate;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;
import org.codehaus.jackson.map.type.TypeFactory;

public class JSONDataListMapper<T> {

    private static final Logger LOGGER = Logger.getLogger(JSONDataListMapper.class);

    private Class<T> typeClass;

    public JSONDataListMapper(final Class<T> typeClass) {
        super();

        Validate.notNull(typeClass, "Parameter typeClass cannot be null.");

        this.typeClass = typeClass;
    }

    /**
     * Map a response String to an Object
     * 
     * @param response
     * @return
     */
    public List<T> mapResponse(final String response) {

        List<T> result = null;

        if (response == null) {
            return result;
        }

        final ObjectMapper mapper = new ObjectMapper();

        try {
            TypeFactory typeFactory = mapper.getTypeFactory();
            CollectionType collectionType = typeFactory.constructCollectionType(List.class, typeClass);
            result = mapper.readValue(response, collectionType);
            
        } catch (Exception e) {
            LOGGER.error("Error Mapping SDS response to JSON: " + response, e);
        }

        return result;
    }
}
