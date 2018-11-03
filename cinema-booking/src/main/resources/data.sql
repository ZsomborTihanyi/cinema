insert into movie (movie_id, genre, runtime, description) values ('Star Wars IV - A New Hope', 'sci-fi', '2ó5p', 'description1');
insert into movie (movie_id, genre, runtime, description) values ('Star Wars V - The Empire Strikes Back', 'sci-fi', '2ó4p', '');
insert into movie (movie_id, genre, runtime, description) values ('Star Wars VI - Return of the Jedi', 'sci-fi', '2ó11p', '');
insert into movie (movie_id, genre, runtime, description) values ('Star Wars VII - The Force Awakens', 'sci-fi', '2ó16p', '');

insert into hall (hall_name, number_of_rows, number_of_columns) values ('Darth Vader terem', 30, 30);
insert into hall (hall_name, number_of_rows, number_of_columns) values ('Luke Skywalker terem', 20, 25);
insert into hall (hall_name, number_of_rows, number_of_columns) values ('Yoda', 15, 20);

insert into screening (hall_id, movie_name_id, screening_time) values (1, 'Star Wars IV - A New Hope', '12:00');
insert into screening (hall_id, movie_name_id, screening_time) values (1, 'Star Wars VI - Return of the Jedi', '16:15');

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
