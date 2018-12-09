import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Booking } from '../classes/booking';
import { httpOptions } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class BookingService {

  private bookingUrl = 'http://localhost:8080/bookings';

  constructor(
    private http: HttpClient
  ) { }

  getBookings(): Promise<Booking[]> {
    return this.http.get<Booking[]>(
      this.bookingUrl,
      httpOptions
    ).toPromise();
  }

  getBooking(id: number): Promise<Booking> {
    return this.http.get<Booking>(
      `${this.bookingUrl}/${id}`,
      httpOptions
    ).toPromise();
  }

  modifyBooking(id: number, booking: Booking): Promise<Booking> {
    return this.http.put<Booking>(
      `${this.bookingUrl}/${id}`,
      booking,
      httpOptions
    ).toPromise();
  }

  addBooking(booking: Booking): Promise<Booking> {
    return this.http.post<Booking>(
      this.bookingUrl,
      booking,
      httpOptions
    ).toPromise();
  }

}