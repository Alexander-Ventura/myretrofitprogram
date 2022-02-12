package com.example.myretrofitprogram.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.AndroidViewModel;

import com.example.myretrofitprogram.models.VolumesResponse;
import com.example.myretrofitprogram.repositories.BookRepository;
import com.example.myretrofitprogram.ApiKeys;

import java.util.StringJoiner;

public class BookViewModel extends AndroidViewModel{
    public ApiKeys key;
    private BookRepository bookRepository;
    private LiveData<VolumesResponse> volumesResponseLiveData;


    public BookViewModel(@NonNull Application application) {
        super(application);
    }

    public void init() {
        bookRepository = new BookRepository();
        volumesResponseLiveData = bookRepository.getVolumesResponseLiveData();
    }

    public void searchVolumes(String keyword, String author) {
        bookRepository.searchVolumes(keyword,author, key.getKey());
    }

    public LiveData<VolumesResponse> getVolumesResponseLiveData() {
        return volumesResponseLiveData;
    }
}
