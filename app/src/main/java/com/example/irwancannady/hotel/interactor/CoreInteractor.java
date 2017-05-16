package com.example.irwancannady.hotel.interactor;

import com.example.irwancannady.hotel.model.QuotesEntity;

import java.util.List;

import rx.Observable;

/**
 * Created by irwancannady on 5/12/17.
 */

public interface CoreInteractor {

    Observable<List<QuotesEntity>> getQuotesHistoryTransaction();

}
