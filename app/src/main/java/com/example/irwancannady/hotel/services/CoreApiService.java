package com.example.irwancannady.hotel.services;

import com.example.irwancannady.hotel.model.QuotesEntity;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by irwancannady on 5/12/17.
 */

public interface CoreApiService {

    String END_POINT = "questions";

    @GET(END_POINT)
    Observable<List<QuotesEntity>> getQuotes();
}
