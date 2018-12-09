import { Component, OnInit } from '@angular/core';
import { Booking } from 'src/app/classes/booking';
import { BookingService } from 'src/app/services/booking.service';

@Component({
  selector: 'app-booking-list',
  templateUrl: './booking-list.component.html',
  styleUrls: ['./booking-list.component.css']
})
export class BookingListComponent implements OnInit {

  bookings: Booking[] = [];
  filteredByUserId = [];
  selectedUserId = 2;
  selectedBooking = null;

  constructor(
    private bookingService: BookingService
  ) { }

  async ngOnInit() {
    this.bookings = await this.bookingService.getBookings();
    this.filterBookings();
  }

  filterBookings() {
    this.filteredByUserId = this.selectedUserId === 0
      ? this.bookings
      : this.bookings.filter(booking => booking.user_id === this.selectedUserId);
  }

  onFilterChange(data) {
    this.selectedUserId = data;
    this.filterBookings();
    
  }

}
