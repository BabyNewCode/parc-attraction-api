INSERT INTO user (id, nom, age, banni) VALUES (1, 'Alice', 17, false);
INSERT INTO user (id, nom, age, banni) VALUES (2, 'Bob', 20, false);
INSERT INTO user (id, nom, age, banni) VALUES (3, 'Charlie', 15, true);

INSERT INTO attraction (id, nom, type, ouverte) VALUES (1, 'Roller Coaster', 'Thrill', true);
INSERT INTO attraction (id, nom, type, ouverte) VALUES (2, 'Ferris Wheel', 'Family', true);
INSERT INTO attraction (id, nom, type, ouverte) VALUES (3, 'Haunted House', 'Scary', false);

INSERT INTO restaurant (id, nom) VALUES (1, 'Pizza Place');
INSERT INTO restaurant (id, nom) VALUES (2, 'Burger Joint');

INSERT INTO personnel (id, nom, role) VALUES (1, 'David', 'Chef');
INSERT INTO personnel (id, nom, role) VALUES (2, 'Eva', 'Waiter');
INSERT INTO personnel (id, nom, role) VALUES (3, 'Frank', 'Manager');

INSERT INTO ticket (id, prix, acheteur_id) VALUES (1, 10.0, 1);
INSERT INTO ticket (id, prix, acheteur_id) VALUES (2, 10.0, 2);
INSERT INTO ticket (id, prix, acheteur_id) VALUES (3, 10.0, 3);