import { Component, OnInit } from '@angular/core';
import { Movie } from 'src/app/classes/movie';
import { ActivatedRoute } from '@angular/router';
import { MovieService } from 'src/app/services/movie.service';

@Component({
  selector: 'movie-detail',
  templateUrl: './movie-detail.component.html',
  styleUrls: ['./movie-detail.component.css']
})
export class MovieDetailComponent implements OnInit {

  id: number;
  movie: Movie;

  constructor(
    private route: ActivatedRoute,
    private movieService: MovieService
  ) {}

  async ngOnInit() {
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.id = +id;
      this.movie = await this.movieService.getMovie(this.id);
    }
  }

}
