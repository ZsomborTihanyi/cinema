import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Screening } from '../classes/screening';
import { httpOptions } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class ScreeningService {

  private screeningUrl = 'http://localhost:8080/screenings';

  constructor(
    private http: HttpClient
  ) { }

  getScreenings(): Promise<Screening[]> {
    return this.http.get<Screening[]>(
      this.screeningUrl,
      httpOptions
    ).toPromise();
  }

  getScreening(id: number): Promise<Screening> {
    return this.http.get<Screening>(
      `${this.screeningUrl}/${id}`,
      httpOptions
    ).toPromise();
  }

  modifyScreening(id: number, screening: Screening): Promise<Screening> {
    return this.http.put<Screening>(
      `${this.screeningUrl}/${id}`,
      screening,
      httpOptions
    ).toPromise();
  }

  addMovie(screening: Screening): Promise<Screening> {
    return this.http.post<Screening>(
      this.screeningUrl,
      screening,
      httpOptions
    ).toPromise();
  }

}
