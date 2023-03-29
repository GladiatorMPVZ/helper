use new_schema;
CREATE TABLE films (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       duration INTEGER NOT NULL,
                       price INTEGER NOT NULL
);

CREATE TABLE sessions (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          film_id INTEGER NOT NULL REFERENCES films(id),
                          start_time TIMESTAMP NOT NULL,
                          price INTEGER NOT NULL
);

CREATE TABLE tickets (
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         session_id INTEGER NOT NULL REFERENCES sessions(id)
);

INSERT INTO films (title, duration, price) VALUES
                                               ('Аватар', 180, 250),
                                               ('Зеленая миля', 180, 200),
                                               ('Терминатор-2', 120, 150),
                                               ('Форест Гамп', 180, 250);

INSERT INTO sessions (film_id, start_time, price) VALUES
                                                      (1, '2023-03-29 18:00:00', 250),
                                                      (2, '2023-03-29 19:30:00', 200),
                                                      (3, '2023-03-29 21:00:00', 150),
                                                      (1, '2023-03-29 22:30:00', 200),
                                                      (4, '2023-03-29 23:00:00', 250);

INSERT INTO tickets (session_id) VALUES
                                     (1),
                                     (2),
                                     (3),
                                     (4),
                                     (5);

SELECT s1.id AS session1_id, f1.title AS film1, s1.start_time AS start_time1, f1.duration AS duration1,
       s2.id AS session2_id, f2.title AS film2, s2.start_time AS start_time2, f2.duration AS duration2
FROM sessions s1
         JOIN films f1 ON s1.film_id = f1.id
         JOIN sessions s2 ON s1.start_time < s2.start_time AND s1.start_time + INTERVAL 1 MINUTE * f1.duration > s2.start_time
    JOIN films f2 ON s2.film_id = f2.id
WHERE s1.id <> s2.id
ORDER BY s1.start_time;


