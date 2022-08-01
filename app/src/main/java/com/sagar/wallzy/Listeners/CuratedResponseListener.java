package com.sagar.wallzy.Listeners;

import com.sagar.wallzy.Models.CuratedApiResponse;

public interface CuratedResponseListener {
    void onFetch(CuratedApiResponse response, String message);
    void onError(String message);
}
