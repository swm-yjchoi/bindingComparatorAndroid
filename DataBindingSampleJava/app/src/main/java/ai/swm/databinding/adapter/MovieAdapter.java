package ai.swm.databinding.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import ai.swm.databinding.R;

import java.util.ArrayList;

import ai.swm.databinding.databinding.ItemMovieLayoutBinding;
import ai.swm.databinding.model.MovieModelView;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    ArrayList<MovieModelView> movieList;

    public MovieAdapter(ArrayList<MovieModelView> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MovieViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_movie_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.bind(movieList.get(position));
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

}

class MovieViewHolder extends RecyclerView.ViewHolder {
    private ItemMovieLayoutBinding binding;
    MovieViewHolder(ItemMovieLayoutBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public MovieViewHolder(@NonNull View itemView) {
        super(itemView);
        itemView = binding.getRoot();
    }
    public void bind(MovieModelView movieModelView) {
        binding.setMovieItem(movieModelView);
    }

}


