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

Egy végpont működése:
![alt text](https://github.com/ZsomborTihanyi/cinema/blob/master/EK%20diagram.png)
