import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MainPageComponent } from 'src/app/components/main-page/main-page.component';
import { MovieListComponent } from 'src/app/components/movies/movie-list/movie-list.component';
import { Routes, RouterModule } from '@angular/router';

const routes : Routes = [
  {
    path: '',
    component: MainPageComponent
  },
  {
    path: 'movies',
    component: MovieListComponent
  }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes)  ],
  exports: [ RouterModule ],
  declarations: []
})
export class RoutingModule { }
