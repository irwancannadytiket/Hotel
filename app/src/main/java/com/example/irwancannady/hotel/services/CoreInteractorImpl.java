package com.example.irwancannady.hotel.services;

import android.content.Context;

import com.example.irwancannady.hotel.interactor.CoreInteractor;
import com.example.irwancannady.hotel.model.QuotesEntity;

import java.util.List;

import rx.Observable;

/**
 * Created by irwancannady on 5/12/17.
 */

public class CoreInteractorImpl implements CoreInteractor {

    private CoreApiService mCoreApi;
    private Context mContext;

    public CoreInteractorImpl(Context context) {
        mCoreApi = CoreApiServiceBuilder.provideCoreApiService();
        mContext = context;
    }

    @Override
    public Observable<List<QuotesEntity>> getQuotesHistoryTransaction() {
        return mCoreApi.getQuotes();
    }
}
