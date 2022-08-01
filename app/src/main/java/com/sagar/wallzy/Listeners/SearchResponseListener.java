package com.sagar.wallzy.Listeners;

import com.sagar.wallzy.Models.SearchApiResponse;

public interface SearchResponseListener {
    void onFetch(SearchApiResponse response, String message);
    void onError(String message);
}
