package com.example.irwancannady.hotel;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.irwancannady.hotel.adapter.AdapterMain;
import com.example.irwancannady.hotel.interactor.QuotesContract;
import com.example.irwancannady.hotel.model.QuotesEntity;
import com.example.irwancannady.hotel.presenter.MainPresenter;
import com.example.irwancannady.hotel.services.CoreInteractorImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity implements QuotesContract.View{

    private AdapterMain mAdapterMain;

    private RecyclerView mRecyclerView;

    private List<QuotesEntity> mQuotesEntity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        QuotesContract.Presenter mPresenter = initPresenter();
        mPresenter.bind(this);

        showProgress();
        mPresenter.getQuotesHistory();
    }

    private void initRecyclerView() {

        mRecyclerView = (RecyclerView) findViewById(R.id.list_hotel);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public QuotesContract.Presenter initPresenter() {
        return new MainPresenter(new CoreInteractorImpl(getApplicationContext()));
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showErrorMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSnackBarErrorView(@StringRes int messageRes) {

    }

    @Override
    public void updateQuotes(List<QuotesEntity> quotesEntities) {

        mQuotesEntity = quotesEntities;
        if (mAdapterMain == null){
            mAdapterMain = new AdapterMain(this, quotesEntities);
        }
        if (mRecyclerView.getAdapter() == null){
            mRecyclerView.setAdapter(mAdapterMain);
        } else {
            //belum handle
            Toast.makeText(this, "+ not added", Toast.LENGTH_SHORT).show();
        }

    }
}
