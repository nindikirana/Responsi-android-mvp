package com.responsi.mvp.Network;

import android.database.Observable;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataService {

    @GET("response")
    Observable<DataResponse> fetchPData(
            @Query("results") int page,
            @Query("nat") String nat
    );

}
