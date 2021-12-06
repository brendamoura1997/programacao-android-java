package com.brenda.atm_consultoria.ui.clientes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClientesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ClientesViewModel() {
        mText = new MutableLiveData<>();

    }

    public LiveData<String> getText() {
        return mText;
    }
}