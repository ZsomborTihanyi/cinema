# Mozi Pénztár

## Feladat leírása

Egy mozi pénztár online felületének megvalósítása.

## Funkcionális követelmények

* Regisztráció
* Bejelentkezés és kijelentkezés
* Jegyvásárlás
* Teremfoglalás
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
  * Jegy(ek)et foglalhat, vagy esetleg egy egész termet is, magán célú használatra, vagy csak a vetítés megtekintésére.
  * Lemondhatja a foglalásokat.
  * Értékelheti a filmeket.
* Adminisztrátor
  * Módosíthatja, vagy törölheti a vetítéseket, szélsőséges esetben a felhasználókat is.
  
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
