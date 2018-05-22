--INSERT INTO USERS (u_id, u_name, u_email, u_key, u_created_at) VALUES ('2', 'Nymeria Ghost', 'nymghost@gmail.com', 'asdfg12345', '2017-05-12');
INSERT INTO BOARDS (b_id, b_name, b_color, b_created_at, b_u_id) VALUES ('2', 'Work', '#A34866', '2016-05-18', '2');
INSERT INTO BOARDS (b_id, b_name, b_color, b_created_at, b_u_id) VALUES ('1', 'Miscellaneous', 'null', '2016-05-02', '2');
INSERT INTO BOARDS (b_id, b_name, b_color, b_created_at, b_u_id) VALUES ('4','Food', '#167D6D', '2017-02-23', '2');
INSERT INTO BOARDS (b_id, b_name, b_color, b_created_at, b_u_id) VALUES ('6', 'School', '#FC6F73','2017-06-15', '2');

INSERT INTO NOTES (n_id, n_created_at, n_name, b_id) VALUES ('2', '2017-06-15', 'Grocery Shopping', '4' );
INSERT INTO NOTES (n_id, n_created_at, n_name, b_id) VALUES ('3', '2017-06-20', 'Important E-mail', '2');
INSERT INTO NOTES (n_id, n_created_at, n_name, b_id) VALUES ('5', '2017-06-17', 'Study AI plan', '6');
INSERT INTO NOTES (n_id, n_created_at, n_name, b_id) VALUES ('6', '2017-06-21', 'Tasks - 21.05', '2');
INSERT INTO NOTES (n_id, n_created_at, n_name, b_id) VALUES ('7', '2017-06-19', 'Important thing', '1');

INSERT INTO ITEMS (i_id, i_isnote, i_checked, i_text, n_id) VALUES ('1', '0', 'false', 'avocado', '2');
INSERT INTO ITEMS (i_id, i_isnote, i_checked, i_text, n_id) VALUES ('2', '0', 'true', 'pasta', '2');
INSERT INTO ITEMS (i_id, i_isnote, i_checked, i_text, n_id) VALUES ('3', '0', 'false', 'cherry tomatoes', '2');
INSERT INTO ITEMS (i_id, i_isnote, i_checked, i_text, n_id) VALUES ('4', '1', '', 'xyz@email.com', '3');
INSERT INTO ITEMS (i_id, i_isnote, i_checked, i_text, n_id) VALUES ('5', '0', 'true', 'get lectures', '5');
INSERT INTO ITEMS (i_id, i_isnote, i_checked, i_text, n_id) VALUES ('6', '0', 'false', 'study', '5');
INSERT INTO ITEMS (i_id, i_isnote, i_checked, i_text, n_id) VALUES ('7', '0', 'true', 'hold meeting', '6');
INSERT INTO ITEMS (i_id, i_isnote, i_checked, i_text, n_id) VALUES ('8', '0', 'false', 'implement push notifications', '6');
INSERT INTO ITEMS (i_id, i_isnote, i_checked, i_text, n_id) VALUES ('9', '0', 'true', 'buy flowers', '6');
INSERT INTO ITEMS (i_id, i_isnote, i_checked, i_text, n_id) VALUES ('10', '0', 'false', 'plan weekend trip', '6');
INSERT INTO ITEMS (i_id, i_isnote, i_checked, i_text, n_id) VALUES ('11', '1', '', 'Remember important things', '7');
INSERT INTO ITEMS (i_id, i_isnote, i_checked, i_text, n_id) VALUES ('12', '1', '', 'and apply those important things', '7');