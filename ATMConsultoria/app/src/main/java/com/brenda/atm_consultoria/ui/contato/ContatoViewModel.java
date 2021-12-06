package com.brenda.atm_consultoria.ui.contato;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContatoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ContatoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Esta é a área de Contato");
    }

    public LiveData<String> getText() {
        return mText;
    }
}