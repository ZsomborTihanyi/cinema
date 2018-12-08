import { Component, OnInit } from '@angular/core';
import { Movie } from 'src/app/classes/movie';
import { MovieService } from 'src/app/services/movie.service';

@Component({
  selector: 'movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent implements OnInit {

  movies: Movie[] = [];
  filteredByGenre = [];
  selectedGenre = 'SCI-FI';
  selectedMovie = null;

  constructor(
    private movieService: MovieService
  ) { }

  async ngOnInit() {
    this.movies = await this.movieService.getMovies();
    this.filterIssues();
  }

  filterIssues() {
    this.filteredByGenre = this.selectedGenre === ''
      ? this.movies
      : this.movies.filter(movie => movie.genre === this.selectedGenre);
  }

  onFilterChange(data) {
    this.selectedGenre = data;
    this.filterIssues();
  }

}
