import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Booking } from 'src/app/classes/booking';
import { BookingService } from 'src/app/services/booking.service';

@Component({
  selector: 'app-booking-detail',
  templateUrl: './booking-detail.component.html',
  styleUrls: ['./booking-detail.component.css']
})
export class BookingDetailComponent implements OnInit {

  id: number;
  booking: Booking;

  constructor(
    private route: ActivatedRoute,
    private bookingService: BookingService
  ) { }

  async ngOnInit() {
    const id = this.route.snapshot.paramMap.get('id');
    if (id) {
      this.id = +id;
      this.booking = await this.bookingService.getBooking(this.id);
    }
  }
}
