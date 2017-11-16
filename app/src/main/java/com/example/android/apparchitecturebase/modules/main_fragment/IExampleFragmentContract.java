package com.example.android.apparchitecturebase.modules.main_fragment;


import com.example.android.apparchitecturebase.base_mvp.IBaseModel;
import com.example.android.apparchitecturebase.base_mvp.IBasePresenter;
import com.example.android.apparchitecturebase.base_mvp.IBaseView;

/**
 * Created by android on 11/15/17.
 */

public interface IExampleFragmentContract {

    interface IView extends IBaseView<IPresenter> {}

    interface IPresenter extends IBasePresenter {}

    interface IModel extends IBaseModel {}

}
