import { Component, OnInit, Input, OnChanges, Output, EventEmitter } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Movie } from 'src/app/classes/movie';

@Component({
  selector: 'movie-form',
  templateUrl: './movie-form.component.html',
  styleUrls: ['./movie-form.component.css']
})
export class MovieFormComponent implements OnInit, OnChanges {

  movieForm = this.fb.group({
    name: ['', [Validators.required]],
    genre: ['', [Validators.required]],
    runtime: ['', [Validators.required]],
    description: [''],
  });
  @Input() movie: Movie;
  @Input() showGenre = false;
  @Output() save = new EventEmitter<Movie>();

  get name() { return this.movieForm.get('name'); }
  get genre() { return this.movieForm.get('genre'); }
  get runtime() { return this.movieForm.get('runtime'); }
  get description() { return this.movieForm.get('description'); }
  

  constructor(
    private fb: FormBuilder
  ) { }

  ngOnInit() {
  }

  ngOnChanges() {
    this.movieForm.patchValue(this.movie);
  }

  onSubmit() {
    this.save.emit(
      Object.assign(new Movie(), this.movieForm.value)
    );
  }

}
