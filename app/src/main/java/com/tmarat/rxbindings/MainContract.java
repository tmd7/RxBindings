package com.tmarat.rxbindings;

public interface MainContract {

  interface View {
    void onSetText(CharSequence text);
  }

  interface Presenter{
    void onTextChanged(CharSequence text);
  }
}
