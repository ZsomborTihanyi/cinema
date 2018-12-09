import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {
  MatButtonToggleModule,
  MatGridListModule,
  MatToolbarModule,
  MatIconModule,
  MatListModule,
  MatTooltipModule,
  MatFormFieldModule,
  MatInputModule
} from '@angular/material';
import { AppComponent } from './app.component';
import { MovieListComponent } from './components/movies/movie-list/movie-list.component';
import { HttpClientModule } from "@angular/common/http";
import { GenreFilterComponent } from './components/movies/genre-filter/genre-filter.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MainPageComponent } from './components/main-page/main-page.component';
import { RoutingModule } from './routing/routing/routing.module';
import { MovieDetailComponent } from './components/movies/movie-detail/movie-detail.component';
import { BookingListComponent } from './components/bookings/booking-list/booking-list.component';
import { BookingDetailComponent } from './components/bookings/booking-detail/booking-detail.component';
import { LoginComponent } from './components/login/login.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    MovieListComponent,
    GenreFilterComponent,
    MainPageComponent,
    MovieDetailComponent,
    BookingListComponent,
    BookingDetailComponent,
    LoginComponent
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
    MatFormFieldModule,
    ReactiveFormsModule,
    MatInputModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
