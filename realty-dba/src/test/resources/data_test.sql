INSERT INTO role(id, value) VALUES(1,'ROLE_ADMIN');
INSERT INTO role(id, value) VALUES(2,'ROLE_USER');

INSERT INTO house_type(id, value_en, value_ru) VALUES(1,'Secondary', '��������');
INSERT INTO house_type(id, value_en, value_ru) VALUES(2,'New building', '�����������');

INSERT INTO wall_material(id, value_en, value_ru) VALUES(1,'Panel', '������');
INSERT INTO wall_material(id, value_en, value_ru) VALUES(2,'Brick', '������');
INSERT INTO wall_material(id, value_en, value_ru) VALUES(3,'Monolith', '�������');
INSERT INTO wall_material(id, value_en, value_ru) VALUES(4,'Block', '����');

INSERT INTO parking(id, value_en, value_ru) VALUES(1,'No', '���');
INSERT INTO parking(id, value_en, value_ru) VALUES(2,'On the street', '�� �����');
INSERT INTO parking(id, value_en, value_ru) VALUES(3,'In the garage', '� ������');

INSERT INTO currency(id, value_en, value_ru) VALUES(1,'BYN', 'BYN');
INSERT INTO currency(id, value_en, value_ru) VALUES(2,'USD', 'USD');

INSERT INTO user (id, additional_phone, day_of_birth, email, enabled,
                  login, name, password, phone, skype, surname, updated)
                  VALUES (1, '8814281', null, 'wolthrax@gmail.com', true, 'maxim', 'maxim', 'qwerty',
                          '8814281', 'wolthrax', 'hryhoryeu', null);

