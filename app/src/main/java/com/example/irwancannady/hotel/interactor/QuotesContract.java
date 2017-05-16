package com.example.irwancannady.hotel.interactor;

import android.support.annotation.StringRes;

import com.example.irwancannady.hotel.util.BaseView;
import com.example.irwancannady.hotel.model.QuotesEntity;
import com.example.irwancannady.hotel.util.BasePresenter;

import java.util.List;

/**
 * Created by irwancannady on 5/12/17.
 */

public interface QuotesContract {

    interface View extends BaseView<Presenter> {

        void updateQuotes(List<QuotesEntity> quotesEntities);

        void showProgress();

        void hideProgress();

        void showErrorMessage(String message);

        void showSnackBarErrorView(@StringRes int messageRes);

    }

    interface Presenter extends BasePresenter<View> {

        void getQuotesHistory();

    }
}
