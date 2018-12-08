import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {
  MatButtonToggleModule
} from '@angular/material';
import { AppComponent } from './app.component';
import { MovieListComponent } from './components/movies/movie-list/movie-list.component';
import { HttpClientModule } from "@angular/common/http";
import { GenreFilterComponent } from './components/movies/genre-filter/genre-filter.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
  declarations: [
    AppComponent,
    MovieListComponent,
    GenreFilterComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    MatButtonToggleModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
