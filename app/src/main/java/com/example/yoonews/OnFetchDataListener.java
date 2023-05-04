package com.example.yoonews;

import com.example.yoonews.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onFetchData(List<NewsHeadlines> list, String massage);
    void onError(String massage);

}
