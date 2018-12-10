# Mozi Pénztár

## Feladat leírása

Egy mozi pénztár online felületének megvalósítása.

## Funkcionális követelmények

* Regisztráció
* Bejelentkezés és kijelentkezés
* Jegyvásárlás
* Foglalás lemondása
* Filmek értékelése
* Vetítések hozzáadása
* Vetítések törlése
* Vetítések módosítása

## Nem funkcionális követelmények

* Felhasználóbarát kinézet, és egyszerű használat
* Adatok biztonságban tartása
* Hozzáférési jogosultságok kiosztása

## Szerepkörök

* Vendég
  * Alapértelmezett szerepkör, vetítési időpontokat tekintheti meg.
  * Regisztrálhat az oldalra.
* Regisztrált felhasználó
  * Jegy(ek)et foglalhat, a vetítésekre.
  * Lemondhatja a foglalásokat.
  * Értékelheti a filmeket.
* Adminisztrátor
  * Módosíthatja, vagy törölheti a vetítéseket (szélsőséges esetben a felhasználókat is).
  
ER diagram:
![alt text](https://github.com/ZsomborTihanyi/cinema/blob/master/ER_Diagram.png)

EK diagrammok különböző jogosulságok esetén:
![alt text](https://github.com/ZsomborTihanyi/cinema/blob/master/guestEK.png)
![alt text](https://github.com/ZsomborTihanyi/cinema/blob/master/registereduserEK.png)
![alt text](https://github.com/ZsomborTihanyi/cinema/blob/master/administratorEK.png)

## Végpontok

 - GET/
	 - /bookings: foglalások megtekintése
		 - /booking_id : A *booking_id*-hoz tartozó foglalás mutatása.
			 -  /reservedseats: A *booking_id*-hoz tartozó ülések mutatása. 
	 - /screenings: a vetítések megtekintése
	 - /movies: a filmek megtekintése
	 - /halls: a termek megtekintése
	 - /users:  a felhasználok megtekintése
- POST/
	- /bookings: új foglalás hozzáadása
		- /booking_id
			- /reservedseats: A *booking_id*-hoz tartozó ülések hozzáadása. 
	- /screenings: új vetítés hozzáadása
	- /movies: új film hozzáadása
	- /halls: új terem hozzáadása
- DELETE/
	 - /bookings/booking_id: A *booking_id*-hoz tartozó foglalás törlése.
	 - /screenings/screening_id: A *screening_id*-hoz tartozó vetítés törlése.
	 - /movies/movie_id: A *movie_id*-hoz tartozó film törlése.
	 - /halls/hall_id: A *hall_id*-hoz tartozó terem törlése.
- PUT/
	- /screenings/screening_id: A *screening_id*-hoz tartozó vetítés módosítása.
	 - /movies/movie_id: A *movie_id*-hoz tartozó film módosítása.
	 - /halls/hall_id: A *hall_id*-hoz tartozó terem módosítása.

Egy végpont működése:
![alt text](https://github.com/ZsomborTihanyi/cinema/blob/master/EK%20diagram.png)

## Könyvtárstruktúra

- classes
	- movie.ts
	- booking.ts
	- user.ts
	- screening.ts
- components
	- main-page
	- bookings
		- booking-detail
		- booking-list
	- movies
		- movie-list
		- movie-detail
		- movie-form
		- movie-edit
		- genre-filter
	- screenings
		- screening-detail
		- screening-list
- routing
- services
	

## Felhasználói dokumentáció

### Követelmények

* Node.js minimum 8.0-s verziója
* Npm minimum 5.2-s verziója
* Eclipse IDE vagy Netbeans IDE

### Telepítés

1. Látogasson el a https://github.com/ZsomborTihanyi/cinema/ oldalra.
2. Itt kattintson a "Clone and Download" gombra, és azon belül kattintson a "Download as Zip" gombra.
3. A letöltött állományt csomagoljuk ki.
4. A cinema-booking-frontend mappán belül parancssorban indítson egy npm install parancsot.
5. Ha kész az installálás akkor indítson egy npm start parancsot.
6. Indítsa el a felsoroltak közül valamelyik fejlesztői környezetet.
7. A letöltött zipben található cinema-booking mappát nyissa meg, mint projektet.
8. Futtassa a projektet.

### Használat

- Az oldalon bejelentkezés után megtekintheti a 
	- Filmeket
	- Vetítéseket
