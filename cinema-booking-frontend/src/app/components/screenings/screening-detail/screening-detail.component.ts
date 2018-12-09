import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ScreeningService } from 'src/app/services/screening.service';
import { Screening } from 'src/app/classes/screening';

@Component({
  selector: 'app-screening-detail',
  templateUrl: './screening-detail.component.html',
  styleUrls: ['./screening-detail.component.css']
})
export class ScreeningDetailComponent implements OnInit {

  id: number;
  screening: Screening;

  constructor(
    private route: ActivatedRoute,
    private movieService: ScreeningService
  ) { }

  async ngOnInit() {
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.id = +id;
      this.screening = await this.movieService.getScreening(this.id);
    }
  }

}
