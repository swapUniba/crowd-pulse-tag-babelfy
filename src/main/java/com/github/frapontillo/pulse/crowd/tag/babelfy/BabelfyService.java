package com.github.frapontillo.pulse.crowd.tag.babelfy;

import retrofit.http.GET;
import retrofit.http.Query;

/**
 * @author Francesco Pontillo
 */
public interface BabelfyService {
    @GET("/disambiguate?format=json&partMatching=false")
    BabelfyResponse tag(@Query("text") String text, @Query("lang") String language);
}
