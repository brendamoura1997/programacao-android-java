package com.brenda.atm_consultoria.ui.servicos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ServicosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ServicosViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}