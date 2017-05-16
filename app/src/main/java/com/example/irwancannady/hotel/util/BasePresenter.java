package com.example.irwancannady.hotel.util;

/**
 * Created by irwancannady on 5/12/17.
 */

public interface BasePresenter<V> {

    void bind(V view);
    void unbind();
}
