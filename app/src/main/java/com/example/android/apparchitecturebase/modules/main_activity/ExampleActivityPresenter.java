package com.example.android.apparchitecturebase.modules.main_activity;

import com.example.android.apparchitecturebase.base_mvp.BasePresenter;

import java.util.List;

//IMainContainerContract.IModel, IMainContainerContract.IView>(view) , IMainContainerContract.IPresenter

class ExampleActivityPresenter extends BasePresenter<IExampleActivityContract.IModel, IExampleActivityContract.IView>
        implements IExampleActivityContract.IPresenter, ExampleActivityModel.IRequestListener{


    // Constructor
    public ExampleActivityPresenter(IExampleActivityContract.IView mView) {
        super(mView);
    }



    @Override
    protected IExampleActivityContract.IModel provideModel() {
        return new ExampleActivityModel();
    }



    @Override
    public void onStart() {
        super.onStart();
        //Call start method for views here

    }



    // Callbacks from model
    @Override
    public void onSuccess(String response) {
    }

    @Override
    public void onError(String msg) {
    }

}
