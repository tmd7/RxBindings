package com.tmarat.rxbindings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.jakewharton.rxbinding.widget.RxTextView;

public class MainActivity extends AppCompatActivity implements MainContract.View{

  @BindView(R.id.edit_text_main_activity) EditText editText;
  @BindView(R.id.text_view_main_activity) TextView textView;

  private MainContract.Presenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    presenter = new MainPresenter(this);

    ButterKnife.bind(this);

    setupRxListener();
  }

  private void setupRxListener() {
    RxTextView.textChanges(editText)
        .subscribe(text -> presenter.onTextChanged(text)
    );
  }

  @Override public void onSetText(CharSequence text) {
    textView.setText(text);
  }
}
