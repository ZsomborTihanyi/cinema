import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {
  MatButtonToggleModule,
  MatGridListModule,
  MatToolbarModule,
  MatIconModule,
  MatListModule,
  MatTooltipModule
} from '@angular/material';
import { AppComponent } from './app.component';
import { MovieListComponent } from './components/movies/movie-list/movie-list.component';
import { HttpClientModule } from "@angular/common/http";
import { GenreFilterComponent } from './components/movies/genre-filter/genre-filter.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MainPageComponent } from './components/main-page/main-page.component';
import { RoutingModule } from './routing/routing/routing.module';

@NgModule({
  declarations: [
    AppComponent,
    MovieListComponent,
    GenreFilterComponent,
    MainPageComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    MatButtonToggleModule,
    MatGridListModule,
    MatToolbarModule,
    MatIconModule,
    MatListModule,
    RoutingModule,
    MatTooltipModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
