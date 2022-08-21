package rs.ac.ni.pmf.scoretracker.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import rs.ac.ni.pmf.scoretracker.repository.GamesRepositoty;

public class GamesViewModel extends ViewModel {

    private MutableLiveData<List<Game>> games = new MutableLiveData<>();
    private MutableLiveData<Game> selectedGame = new MutableLiveData<>();

    private GamesRepositoty repositoty = GamesRepositoty.INSTANCE;

    public LiveData<List<Game>> getGames(){
        games.setValue(repositoty.getGames());
        return games;
    }

    public LiveData<Game> getSelectedGame(){
        return selectedGame;
    }

    public void setSelectedGame(Game game){
        selectedGame.setValue(game);
    }

}
