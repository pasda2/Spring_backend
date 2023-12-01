insert into "USERS"(name,role,password) values ('admin','ROLE_ADMIN','$2a$10$VRJh6RWQ7EcQw2G9GMSKY.yhaw7bReoq5fJbBiomk1Xaosa2OgJni');
insert into "USERS"(name,role,password) values ('gamemaster','ROLE_GAME_MASTER','$2a$12$LdCxSkHcyF0CLzOi4MLeQ.v3DQkUlwqdCMvhYvkEoYh3p/9yfhldC');
insert into "USERS"(name,role,password) values ('player','ROLE_PLAYER','$2a$12$U9mgKxOSEHzQFFwSfy95xenTa5advO63vhDBtQ2bXJrHqPpNlGb9W');

insert into "BOARD"(id,name) values (1,'TABLE 1');

insert into "TEAM"(id,name,balance,board_id) values( 1,'TEAM 1',1200,1);
insert into "TEAM"(id,name,balance,board_id) values( 2,'TEAM 2',1300,1);
insert into "TEAM"(id,name,balance,board_id) values( 3,'TEAM 3',1400,1);
insert into "TEAM"(id,name,balance,board_id) values( 4,'TEAM 4',1500,1);
insert into "TEAM"(id,name,balance,board_id) values( 5,'TEAM 5',1600,1);
insert into "TEAM"(id,name,balance,board_id) values( 6,'TEAM 6',1700,1);
insert into "TEAM"(id,name,balance,board_id) values( 7,'TEAM 7',1800,1);

insert into "PLAYER"(id,name, team_id) values ( 1,'player1',1 );
insert into "PLAYER"(id,name, team_id) values ( 2,'player2',2 );
insert into "PLAYER"(id,name, team_id) values ( 3,'player3',3 );
insert into "PLAYER"(id,name, team_id) values ( 4,'player4',4 );
insert into "PLAYER"(id,name, team_id) values ( 5,'player5',5 );
insert into "PLAYER"(id,name, team_id) values ( 6,'player6',6 );
insert into "PLAYER"(id,name, team_id) values ( 7,'player7',7 );

insert into "GAME_MASTER"(id,name) values (1,'game_master1');
insert into "GAME_MASTER"(id,name) values (2,'game_master2');
insert into "GAME_MASTER"(id,name) values (3,'game_master3');
insert into "GAME_MASTER"(id,name) values (4,'game_master4');



insert into "FEE"(no_house,one_house,two_house,three_house,four_house,hotel) values ( 50,100,200,300,400,500);
insert into "FEE"(no_house,one_house,two_house,three_house,four_house,hotel) values ( 100,150,250,350,450,550);
insert into "FEE"(no_house,one_house,two_house,three_house,four_house,hotel) values ( 150,200,300,400,500,600);
insert into "FEE"(no_house,one_house,two_house,three_house,four_house,hotel) values ( 250,300,400,450,500,550);
insert into "FEE"(no_house,one_house,two_house,three_house,four_house,hotel) values ( 300,350,400,450,500,550);
insert into "FEE"(no_house,one_house,two_house,three_house,four_house,hotel) values ( 10,80,150,200,240,300);
insert into "FEE"(no_house,one_house,two_house,three_house,four_house,hotel) values ( 70,140,210,280,350,420);

insert into "TABLE_FIELD" (name,price,house_prize,number_of_houses,is_on_sale,is_buildable,game_master_id,fees_id) values ('tablefield1',100,50,0,1,0,1,1);
insert into "TABLE_FIELD" (name,price,house_prize,number_of_houses,is_on_sale,is_buildable,game_master_id,fees_id) values ('tablefield2',150,70,0,1,0,2,2);
insert into "TABLE_FIELD" (name,price,house_prize,number_of_houses,is_on_sale,is_buildable,game_master_id,fees_id) values ('tablefield3',180,70,0,1,0,3,3);
insert into "TABLE_FIELD" (name,price,house_prize,number_of_houses,is_on_sale,is_buildable,game_master_id,fees_id) values ('tablefield4',200,100,0,1,0,1,4);
insert into "TABLE_FIELD" (name,price,house_prize,number_of_houses,is_on_sale,is_buildable,game_master_id,fees_id) values ('tablefield5',250,150,0,1,0,2,5);
insert into "TABLE_FIELD" (name,price,house_prize,number_of_houses,is_on_sale,is_buildable,game_master_id,fees_id) values ('tablefield6',300,200,0,1,0,3,6);
insert into "TABLE_FIELD" (name,price,house_prize,number_of_houses,is_on_sale,is_buildable,game_master_id,fees_id) values ('tablefield7',350,250,0,1,0,4,1);

insert into "OUTSIDE_FIELD" (id,name,fee,gain,game_master_id) values (1,'outsidefield1',0,200,1);
insert into "OUTSIDE_FIELD" (id,name,fee,gain,game_master_id) values (2,'outsidefield2',0,100,1);
insert into "OUTSIDE_FIELD" (id,name,fee,gain,game_master_id) values (3,'outsidefield3',100,0,2);
insert into "OUTSIDE_FIELD" (id,name,fee,gain,game_master_id) values (4,'outsidefield4',200,0,2);


insert into "POSITION"(x_pos,y_pos,board_id) values ( 1,1,1);
insert into "POSITION"(x_pos,y_pos,board_id) values ( 1,2,1);
insert into "POSITION"(x_pos,y_pos,board_id) values ( 1,3,1);
insert into "POSITION"(x_pos,y_pos,board_id) values ( 1,4,1);
insert into "POSITION"(x_pos,y_pos,board_id) values ( 1,5,1);
insert into "POSITION"(x_pos,y_pos,board_id) values ( 1,6,1);
insert into "POSITION"(x_pos,y_pos,board_id) values ( 1,7,1);
insert into "POSITION"(x_pos,y_pos,board_id) values ( 1,8,1);
insert into "POSITION"(x_pos,y_pos,board_id) values ( 2,1,1);
insert into "POSITION"(x_pos,y_pos,board_id) values ( 2,2,1);
insert into "POSITION"(x_pos,y_pos,board_id) values ( 2,3,1);
insert into "POSITION"(x_pos,y_pos,board_id) values ( 2,4,1);