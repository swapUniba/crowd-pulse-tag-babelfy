package com.github.frapontillo.pulse.crowd.tag.babelfy;

import retrofit.RequestInterceptor;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Francesco Pontillo
 */
public class BabelfyInterceptor implements RequestInterceptor {
    private static final String PROP_API_KEY = "babelfy.key";
    private static String API_KEY;

    static {
        InputStream configInput = RequestInterceptor.class.getClassLoader().getResourceAsStream("babelfy.properties");
        Properties prop = new Properties();

        try {
            prop.load(configInput);
        } catch (IOException noFileException) {
            System.err.println(noFileException);
        }
        API_KEY = prop.getProperty(PROP_API_KEY);
    }

    @Override public void intercept(RequestFacade request) {
        request.addQueryParam("key", API_KEY);
    }
}
