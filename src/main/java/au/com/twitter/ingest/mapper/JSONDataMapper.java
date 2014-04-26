package au.com.twitter.ingest.mapper;

import org.apache.commons.lang.Validate;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONDataMapper<T> {

    private static final Logger LOGGER = Logger.getLogger(JSONDataMapper.class);

    private Class<T> typeClass;

    public JSONDataMapper(final Class<T> typeClass) {
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
    public T mapResponse(final String response) {

        T result = null;

        if (response == null) {
            return result;
        }

        final ObjectMapper mapper = new ObjectMapper();

        try {
            result = mapper.readValue(response, typeClass);
        } catch (Exception e) {
            LOGGER.error("Error Mapping SDS response to JSON: " + response, e);
        }

        return result;
    }
}
