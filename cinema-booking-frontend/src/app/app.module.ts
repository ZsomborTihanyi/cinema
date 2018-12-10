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
  MatInputModule,
  MatSelectModule
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
import { ScreeningListComponent } from './components/screenings/screening-list/screening-list.component';
import { ScreeningDetailComponent } from './components/screenings/screening-detail/screening-detail.component';
import { MovieFormComponent } from './components/movies/movie-form/movie-form.component';
import { MovieEditComponent } from './components/movies/movie-edit/movie-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    MovieListComponent,
    GenreFilterComponent,
    MainPageComponent,
    MovieDetailComponent,
    BookingListComponent,
    BookingDetailComponent,
    LoginComponent,
    ScreeningListComponent,
    ScreeningDetailComponent,
    MovieFormComponent,
    MovieEditComponent
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
    MatSelectModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
