insert into movie (name, genre, runtime, description) values ('Star Wars IV - A New Hope', 'SCI_FI', '2?5p', 'Luke Skywalker joins forces with a Jedi Knight, a cocky pilot, a Wookiee and two droids to save the galaxy from the Empires world-destroying battle station, while also attempting to rescue Princess Leia from the evil Darth Vader.');
insert into movie (name, genre, runtime, description) values ('Star Wars V - The Empire Strikes Back', 'SCI_FI', '2?4p', 'After the rebels are brutally overpowered by the Empire on the ice planet Hoth, Luke Skywalker begins Jedi training with Yoda, while his friends are pursued by Darth Vader.');
insert into movie (name, genre, runtime, description) values ('Star Wars VI - Return of the Jedi', 'SCI_FI', '2?11p', 'After a daring mission to rescue Han Solo from Jabba the Hutt, the rebels dispatch to Endor to destroy a more powerful Death Star. Meanwhile, Luke struggles to help Vader back from the dark side without falling into the Emperors trap.');
insert into movie (name, genre, runtime, description) values ('Star Wars VII - The Force Awakens', 'SCI_FI', '2?16p', 'Three decades after the Empire s defeat, a new threat arises in the militant First Order. Stormtrooper defector Finn and the scavenger Rey are caught up in the Resistances search for the missing Luke Skywalker.');
insert into movie (name, genre, runtime, description) values ('Rogue One: A Star Wars Story', 'SCI_FI', '2?13p', 'The daughter of an Imperial scientist joins the Rebel Alliance in a risky move to steal the Death Star plans.');
insert into movie (name, genre, runtime, description) values ('Wall-E', 'ANIMATION', '1?38p', 'In the distant future, a small waste-collecting robot inadvertently embarks on a space journey that will ultimately decide the fate of mankind.');
insert into movie (name, genre, runtime, description) values ('Up', 'ANIMATION', '1?36p', 'Seventy-eight year old Carl Fredricksen travels to Paradise Falls in his home equipped with balloons, inadvertently taking a young stowaway.');
insert into movie (name, genre, runtime, description) values ('The Grand Budapest Hotel', 'COMEDY', '1?39p', 'The adventures of Gustave H, a legendary concierge at a famous hotel from the fictional Republic of Zubrowka between the first and second World Wars, and Zero Moustafa, the lobby boy who becomes his most trusted friend.');
insert into movie (name, genre, runtime, description) values ('Terminal', 'COMEDY', '2?8p', 'An Eastern European tourist unexpectedly finds himself stranded in JFK airport, and must take up temporary residence there.');
insert into movie (name, genre, runtime, description) values ('Interstellar', 'SCI_FI', '2?49p', 'A team of explorers travel through a wormhole in space in an attempt to ensure humanitys survival.');

insert into hall (hall_name, number_of_rows, number_of_columns) values ('Darth Vader terem', 30, 30);
insert into hall (hall_name, number_of_rows, number_of_columns) values ('Luke Skywalker terem', 20, 25);
insert into hall (hall_name, number_of_rows, number_of_columns) values ('Yoda', 15, 20);

insert into screening (hall_id, movie_id, screening_time) values (1, '1', '12:00');
insert into screening (hall_id, movie_id, screening_time) values (1, '2', '16:15');

insert into user (username, password, enabled, role) values ('admin', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_ADMIN');
insert into user (username, password, enabled, role) values ('han', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER');
insert into user (username, password, enabled, role) values ('luke', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER');
insert into user (username, password, enabled, role) values ('chewie', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER');

insert into booking (user_id, screening_id, number_of_seats, price, payment_method) values (2, 1, 3, 3000, 'maestro');
insert into booking (user_id, screening_id, number_of_seats, price, payment_method) values (3, 2, 2, 2000, 'visa');
insert into booking (user_id, screening_id, number_of_seats, price, payment_method) values (4, 2, 1, 1000, 'kp');

insert into reserved_seat (booking_id, hall_id, column, row) values (1, 1, 'A', 1);
insert into reserved_seat (booking_id, hall_id, column, row) values (1, 1, 'A', 2);
insert into reserved_seat (booking_id, hall_id, column, row) values (1, 1, 'A', 3);

insert into seen_by (user_id, movie_id) values (2,1);
insert into seen_by (user_id, movie_id) values (2,2);
