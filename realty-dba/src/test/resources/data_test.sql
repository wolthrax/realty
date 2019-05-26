INSERT INTO role(id, value) VALUES(1,'ROLE_ADMIN');
INSERT INTO role(id, value) VALUES(2,'ROLE_USER');

INSERT INTO house_type(id, value_en, value_ru) VALUES(1,'Secondary', 'Вторичка');
INSERT INTO house_type(id, value_en, value_ru) VALUES(2,'New building', 'Новостройка');

INSERT INTO wall_material(id, value_en, value_ru) VALUES(1,'Panel', 'Панель');
INSERT INTO wall_material(id, value_en, value_ru) VALUES(2,'Brick', 'Кирпич');
INSERT INTO wall_material(id, value_en, value_ru) VALUES(3,'Monolith', 'Монолит');
INSERT INTO wall_material(id, value_en, value_ru) VALUES(4,'Block', 'Блок');

INSERT INTO parking(id, value_en, value_ru) VALUES(1,'No', 'Нет');
INSERT INTO parking(id, value_en, value_ru) VALUES(2,'On the street', 'На улице');
INSERT INTO parking(id, value_en, value_ru) VALUES(3,'In the garage', 'В гараже');

INSERT INTO currency(id, value_en, value_ru) VALUES(1,'BYN', 'BYN');
INSERT INTO currency(id, value_en, value_ru) VALUES(2,'USD', 'USD');

INSERT INTO user (id, additional_phone, day_of_birth, email, enabled,
                  login, name, password, phone, skype, surname, updated)
                  VALUES (1, '8814281', null, 'wolthrax@gmail.com', true, 'maxim', 'maxim', 'qwerty',
                          '8814281', 'wolthrax', 'hryhoryeu', null);

