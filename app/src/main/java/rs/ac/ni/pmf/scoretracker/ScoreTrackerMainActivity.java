package rs.ac.ni.pmf.scoretracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import rs.ac.ni.pmf.scoretracker.fragment.GameDetailsFragment;
import rs.ac.ni.pmf.scoretracker.fragment.GamesRecyclerViewAdapter;
import rs.ac.ni.pmf.scoretracker.model.Game;
import rs.ac.ni.pmf.scoretracker.model.GamesViewModel;

public class ScoreTrackerMainActivity extends AppCompatActivity implements GamesRecyclerViewAdapter.GameSelectedListener {

    private GamesViewModel gamesViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gamesViewModel = new ViewModelProvider(this).get(GamesViewModel.class);
    }


    @Override
    public void onGameSelected(Game game) {
        gamesViewModel.setSelectedGame(game);
        //promeni fragment
        if(findViewById(R.id.vertical_fragment_container) != null){
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.vertical_fragment_container, GameDetailsFragment.class, null)
                    .addToBackStack(null)
                    .commit();
        }
    }
}