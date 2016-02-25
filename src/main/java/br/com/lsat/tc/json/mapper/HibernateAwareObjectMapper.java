package br.com.lsat.tc.json.mapper;

import java.text.SimpleDateFormat;

import javax.inject.Named;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

@Named
public class HibernateAwareObjectMapper extends ObjectMapper {

	private static final long serialVersionUID = 9011405555271083878L;

	public HibernateAwareObjectMapper() {
        Hibernate4Module hibernate4Module = new Hibernate4Module();
        hibernate4Module.configure(Hibernate4Module.Feature.USE_TRANSIENT_ANNOTATION, false);
        registerModule(hibernate4Module);
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);

        this.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS"));

    }

}