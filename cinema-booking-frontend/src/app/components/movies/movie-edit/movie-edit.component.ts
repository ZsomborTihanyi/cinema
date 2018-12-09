import { Component, OnInit } from '@angular/core';
import { Movie } from 'src/app/classes/movie';
import { ActivatedRoute, Router } from '@angular/router';
import { MovieService } from 'src/app/services/movie.service';
import { AuthService } from 'src/app/services/auth.service';
import { Location } from '@angular/common';

@Component({
  selector: 'app-movie-edit',
  templateUrl: './movie-edit.component.html',
  styleUrls: ['./movie-edit.component.css']
})
export class MovieEditComponent implements OnInit {

  id: number = null;
  movie: Movie = new Movie();
  name = 'New movie';

  constructor(
    private route: ActivatedRoute,
    private movieService: MovieService,
    private location: Location,
    private router: Router,
    private authService: AuthService
  ) { }

  async ngOnInit() {
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.id = +id;
      this.movie = await this.movieService.getMovie(this.id);
      this.name = 'Edit movie';
    }
  }

  async onFormSave(movie: Movie) {
    if (this.id) {
      await this.movieService.modifyMovie(this.id, movie)
      this.location.back();
    } else {
      await this.movieService.addMovie(movie);
      this.router.navigate(['/movies']);
    }
  }


}
