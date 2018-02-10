package salatiga.pln.forum.adviceapp.presenter;

import java.util.Calendar;
import java.util.Date;

import salatiga.pln.forum.adviceapp.data.model.Suggestion;
import salatiga.pln.forum.adviceapp.ui.SuggestionView;

/**
 * Created by adhit on 10/02/2018.
 */

public class SuggestionPresenter {
    private SuggestionView suggestionView;
    private DatabaseReference mDatabase;

    public SuggestionPresenter (SuggestionView suggestionView){
        this.suggestionView = suggestionView;
    }

    public void sendSuggestion(String suggestion) {
        mDatabase = FirebaseDatabase.getInstance().getReference();
        Date currentTime = Calendar.getInstance().getTime();
        Suggestion suggestion1 = new Suggestion(currentTime.toString()  , suggestion);
        mDatabase.child("suggestion").push().setValue(suggestion1);
        suggestionView.onSucessSendSuggestion();
    }
}
