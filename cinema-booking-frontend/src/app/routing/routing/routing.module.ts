import { NgModule } from '@angular/core';
import { MainPageComponent } from 'src/app/components/main-page/main-page.component';
import { MovieListComponent } from 'src/app/components/movies/movie-list/movie-list.component';
import { Routes, RouterModule } from '@angular/router';
import { MovieDetailComponent } from 'src/app/components/movies/movie-detail/movie-detail.component';
import { BookingListComponent } from 'src/app/components/bookings/booking-list/booking-list.component';
import { BookingDetailComponent } from 'src/app/components/bookings/booking-detail/booking-detail.component';

const routes : Routes = [
  {
    path: '',
    component: MainPageComponent
  },
  {
    path: 'movies',
    component: MovieListComponent
  },
  {
    path: 'movies/:id',
    component: MovieDetailComponent
  },
  {
    path: 'bookings',
    component: BookingListComponent
  },
  {
    path: 'bookings/:id',
    component: BookingDetailComponent
  }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes)  ],
  exports: [ RouterModule ],
  declarations: []
})
export class RoutingModule { }
