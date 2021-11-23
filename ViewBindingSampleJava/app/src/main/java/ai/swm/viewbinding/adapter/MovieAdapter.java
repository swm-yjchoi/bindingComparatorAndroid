package ai.swm.viewbinding.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import ai.swm.viewbinding.R;
import ai.swm.viewbinding.databinding.ItemMovieLayoutBinding;
import ai.swm.viewbinding.model.MovieModelView;

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder> {
    ArrayList<MovieModelView> movieList;

    public MovieAdapter(ArrayList<MovieModelView> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MovieViewHolder(ItemMovieLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
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
        binding.textViewTitleMovie.setText(movieModelView.getTitleMovie());
        binding.textViewTitleDesc.setText(movieModelView.getDesc());
        binding.textViewTitleRelease.setText(movieModelView.getReleaseDate());
        binding.textViewTitleRating.setText(movieModelView.getRating().toString());
    }

}


