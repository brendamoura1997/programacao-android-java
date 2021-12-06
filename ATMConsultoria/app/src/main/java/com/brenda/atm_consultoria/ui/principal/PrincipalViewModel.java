package com.brenda.atm_consultoria.ui.principal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PrincipalViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PrincipalViewModel() {
        mText = new MutableLiveData<>();
     
    }

    public LiveData<String> getText() {
        return mText;
    }
}