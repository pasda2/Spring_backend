
CREATE TABLE "BOARD" (
id INTEGER NOT NULL PRIMARY KEY auto_increment,
name VARCHAR(100),
style VARCHAR(100),
time INTEGER
);

CREATE TABLE "GAME_MASTER" (
id INTEGER NOT NULL PRIMARY KEY auto_increment,
name TEXT
);

CREATE TABLE "POSITION" (
id INTEGER NOT NULL PRIMARY KEY auto_increment,
y_pos INTEGER,
X_pos INTEGER,
board_id INTEGER,
CONSTRAINT fk_pos_on_table
    FOREIGN KEY(board_id)
    REFERENCES "BOARD"(id)
);
CREATE TABLE "TEAM" (
id INTEGER NOT NULL PRIMARY KEY auto_increment,
name TEXT,
balance INTEGER,
board_id INTEGER,
position_id INTEGER,
CONSTRAINT fk_team_on_table
    FOREIGN KEY(board_id)
    REFERENCES "BOARD"(id),
CONSTRAINT fk_team_on_position
    FOREIGN KEY(position_id)
    REFERENCES "POSITION"(id)
);



CREATE TABLE "PLAYER" (
id INTEGER NOT NULL PRIMARY KEY auto_increment,
name TEXT,
team_id INTEGER,
CONSTRAINT fk_player_on_team
      FOREIGN KEY(team_id)
	  REFERENCES "TEAM"(id)
);

CREATE TABLE "USER" (
id INTEGER NOT NULL PRIMARY KEY auto_increment,
name varchar(100),
role varchar(100),
password varchar(300)
);

CREATE TABLE "FEE"(
id INTEGER NOT NULL PRIMARY KEY auto_increment,
no_house INTEGER,
one_house INTEGER,
two_house INTEGER,
three_house INTEGER,
four_house INTEGER,
hotel INTEGER
);
CREATE TABLE "TABLE_FIELD" (
id INTEGER NOT NULL PRIMARY KEY auto_increment,
name TEXT,
description TEXT,
style VARCHAR(100),
team_id INTEGER,
price INTEGER,
house_prize INTEGER,
number_of_houses INTEGER,
position_id INTEGER,
is_on_sale BOOLEAN,
is_buildable BOOLEAN,
game_master_id INTEGER,
board_id INTEGER,
fees_id INTEGER,
CONSTRAINT fk_fee_of_field
    FOREIGN KEY(fees_id)
    REFERENCES "FEE"(id),
CONSTRAINT fk_game_master_of_table_field
    FOREIGN KEY(game_master_id)
    REFERENCES "GAME_MASTER"(id),
CONSTRAINT fk_field_of_team
    FOREIGN KEY(team_id)
    REFERENCES "TEAM"(id),
CONSTRAINT fk_board_of_field
    FOREIGN KEY(board_id)
    REFERENCES "BOARD"(id),
CONSTRAINT fk_field_of_position
    FOREIGN KEY(position_id)
    REFERENCES "POSITION"(id)

);

CREATE TABLE "OUTSIDE_FIELD" (
id INTEGER NOT NULL PRIMARY KEY auto_increment,
name TEXT,
description TEXT,
style VARCHAR(100),
fee INTEGER,
gain INTEGER,
position_id INTEGER,
game_master_id INTEGER,
board_id INTEGER,
CONSTRAINT fk_board_of_outside_field
    FOREIGN KEY(board_id)
    REFERENCES "BOARD"(id),
CONSTRAINT fk_game_master_of_outside_field
    FOREIGN KEY(game_master_id)
    REFERENCES "GAME_MASTER"(id),
CONSTRAINT fk_position
    FOREIGN KEY(position_id)
    REFERENCES "POSITION"(id)
);
