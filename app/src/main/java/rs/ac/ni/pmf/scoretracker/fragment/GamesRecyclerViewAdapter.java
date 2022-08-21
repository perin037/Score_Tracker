package rs.ac.ni.pmf.scoretracker.fragment;

import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import rs.ac.ni.pmf.scoretracker.databinding.FragmentGameBinding;
import rs.ac.ni.pmf.scoretracker.model.Game;
import rs.ac.ni.pmf.scoretracker.model.GamesViewModel;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Game}.
 * TODO: Replace the implementation with code for your data type.
 */
public class GamesRecyclerViewAdapter extends RecyclerView.Adapter<GamesRecyclerViewAdapter.ViewHolder> {

    private final List<Game> games;
    private final GameSelectedListener gameSelectedListener;

    public interface GameSelectedListener{
        void onGameSelected(Game game);
    }

    public GamesRecyclerViewAdapter(List<Game> games, GameSelectedListener gameSelectedListener) {
        this.games = games;
        this.gameSelectedListener = gameSelectedListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentGameBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Game game = games.get(position);
        holder.binding.setGame(game);
        holder.itemView.setOnClickListener(view -> gameSelectedListener.onGameSelected(game));
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public FragmentGameBinding binding;

        public ViewHolder(FragmentGameBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}