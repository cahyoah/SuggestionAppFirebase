package salatiga.pln.forum.adviceapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import salatiga.pln.forum.adviceapp.R;
import salatiga.pln.forum.adviceapp.presenter.SuggestionPresenter;
import salatiga.pln.forum.adviceapp.util.ShowAlert;

public class SuggestionActivity extends AppCompatActivity implements SuggestionView, View.OnClickListener {

    private Button btnSendSuggestion;
    private EditText etSuggestion;
    private SuggestionPresenter suggestionPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);
        initView();
        initPresenter();
    }

    private void initPresenter() {
        suggestionPresenter = new SuggestionPresenter(this);
    }

    private void initView() {
        etSuggestion = findViewById(R.id.et_suggestion);
        btnSendSuggestion = findViewById(R.id.btn_input_suggestion);
        btnSendSuggestion.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_input_suggestion){
            String suggestion = etSuggestion.getText().toString().trim();
            if(suggestion.isEmpty()){
                etSuggestion.setError(getResources().getString(R.string.text_cannot_empty));
                etSuggestion.requestFocus();
            }else{
                ShowAlert.showProgresDialog(this);
                suggestionPresenter.sendSuggestion(suggestion);
            }
        }
    }

    @Override
    public void onSucessSendSuggestion() {
        ShowAlert.closeProgresDialog();
        ShowAlert.showToast(this, getResources().getString(R.string.text_sucess_send_suggestion));
    }
}
