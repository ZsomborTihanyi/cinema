insert into movie (movie_id, genre, runtime, description) values ('Star Wars IV - A New Hope', 'sci-fi', '2ó5p', 'description1');
insert into movie (movie_id, genre, runtime, description) values ('Star Wars V - The Empire Strikes Back', 'sci-fi', '2ó4p', '');
insert into movie (movie_id, genre, runtime, description) values ('Star Wars VI - Return of the Jedi', 'sci-fi', '2ó11p', '');
insert into movie (movie_id, genre, runtime, description) values ('Star Wars VII - The Force Awakens', 'sci-fi', '2ó16p', '');

insert into hall (hall_name_id, number_of_rows, number_of_columns) values ('Darth Vader', 30, 30);
insert into hall (hall_name_id, number_of_rows, number_of_columns) values ('Luke Skywalker terem', 20, 25);
insert into hall (hall_name_id, number_of_rows, number_of_columns) values ('Yoda', 15, 20);

insert into screening (movie_name_id, hall_name_id, screening_time) values ('Star Wars IV - A New Hope', 'Luke Skywalker terem', '12:00');
insert into screening (movie_name_id, hall_name_id, screening_time) values ('Star Wars VI - Return of the Jedi', 'Darth Vader', '16:15');

insert into user (username, password, enabled, role) values ('admin', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_ADMIN');
insert into user (username, password, enabled, role) values ('user', '$2a$04$YDiv9c./ytEGZQopFfExoOgGlJL6/o0er0K.hiGb5TGKHUL8Ebn..', true, 'ROLE_USER');
