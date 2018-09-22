package com.tmarat.rxbindings;

public class MainPresenter implements MainContract.Presenter {

  private MainContract.View view;

  MainPresenter(MainContract.View view) {
    this.view = view;
  }

  @Override public void onTextChanged(CharSequence text) {
      view.onSetText(text);
  }
}
