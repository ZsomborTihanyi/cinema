import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'genre-filter',
  templateUrl: './genre-filter.component.html',
  styleUrls: ['./genre-filter.component.css']
})
export class GenreFilterComponent implements OnInit {

  @Input('genre') selectedGenre = 'SCI-FI'
  @Output() change = new EventEmitter<string>();

  constructor() { }

  ngOnInit() {
  }

  onFilterChange(data) {
    this.selectedGenre = data.value;
    this.change.emit(this.selectedGenre);
  }
}
