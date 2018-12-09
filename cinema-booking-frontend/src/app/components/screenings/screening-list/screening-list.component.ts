import { Component, OnInit } from '@angular/core';
import { Screening } from 'src/app/classes/screening';
import { ScreeningService } from 'src/app/services/screening.service';

@Component({
  selector: 'app-screening-list',
  templateUrl: './screening-list.component.html',
  styleUrls: ['./screening-list.component.css']
})
export class ScreeningListComponent implements OnInit {

  screenings: Screening[] = [];
  selectedScreening = null;

  constructor(
    private screeningService: ScreeningService
  ) { }

  async ngOnInit() {
    this.screenings = await this.screeningService.getScreenings();
  }

}
