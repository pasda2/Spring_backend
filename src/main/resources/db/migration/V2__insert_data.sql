insert into "USERS"(name,role,password) values ('admin','admin','admin');
insert into "USERS"(name,role,password) values ('user','user','user');

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


insert into "RECIPE_DETAILS"(description) values ('A classic Italian pasta dish made with eggs, cheese, pancetta, and pepper.');

insert into "RECIPE_DETAILS"(description) values ('A creamy pasta dish with chicken and a rich Alfredo sauce made with butter, cream, and Parmesan cheese.');

insert into "RECIPE"(name, description, author, image, recipe_details_id)
values ('Spaghetti Carbonara', 'A delicious pasta dish made with eggs, pancetta, and Parmesan cheese.', 'Chef John', 'path/to/carbonara_image.jpg', 1);

insert into "RECIPE"(name, description, author, image, recipe_details_id)
values ('Chicken Alfredo', 'A creamy pasta dish with chicken, garlic, and a rich Alfredo sauce.', 'Chef Jane', 'path/to/alfredo_image.jpg', 2);

insert into "STEPS"(description, recipe_details_id) values ('Boil spaghetti according to the package instructions.', 1);
insert into "STEPS"(description, recipe_details_id) values ('Fry pancetta in a pan until crispy.', 1);
insert into "STEPS"(description, recipe_details_id) values ('Whisk eggs, Parmesan cheese, and black pepper together in a bowl.', 1);
insert into "STEPS"(description, recipe_details_id) values ('Toss the hot pasta with the pancetta, then mix in the egg mixture quickly.', 1);
insert into "STEPS"(description, recipe_details_id) values ('Serve immediately with extra cheese and pepper on top.', 1);

insert into "INGREDIENTS"(name, description, recipe_details_id, step_id)
values ('Spaghetti', 'Italian pasta, long and thin.', 1, 1);

insert into "INGREDIENTS"(name, description, recipe_details_id, step_id)
values ('Pancetta', 'Italian cured meat, similar to bacon, used for its crispy texture and savory flavor.', 1, 2);

insert into "INGREDIENTS"(name, description, recipe_details_id, step_id)
values ('Eggs', 'Large eggs, typically used for the creamy sauce.', 1, 3);

insert into "INGREDIENTS"(name, description, recipe_details_id, step_id)
values ('Parmesan Cheese', 'Hard cheese grated finely for the sauce.', 1, 3);

insert into "INGREDIENTS"(name, description, recipe_details_id, step_id)
values ('Black Pepper', 'Freshly ground black pepper, to taste.', 1, 3);

insert into "STEPS"(description, recipe_details_id) values ('Cook fettuccine pasta according to the package instructions.', 2);
insert into "STEPS"(description, recipe_details_id) values ('Season chicken breasts with salt, pepper, and garlic powder, then sear in a skillet until fully cooked.', 2);
insert into "STEPS"(description, recipe_details_id) values ('Prepare the Alfredo sauce by melting butter, adding cream, and simmering with garlic and Parmesan cheese.', 2);
insert into "STEPS"(description, recipe_details_id) values ('Toss the pasta and chicken in the sauce until evenly coated, then serve with parsley and extra Parmesan on top.', 2);

insert into "INGREDIENTS"(name, description, recipe_details_id, step_id)
values ('Fettuccine Pasta', 'Wide, flat pasta used in creamy sauces.', 2, 1);

insert into "INGREDIENTS"(name, description, recipe_details_id, step_id)
values ('Chicken Breasts', 'Boneless, skinless chicken breasts, seasoned and cooked.', 2, 2);

insert into "INGREDIENTS"(name, description, recipe_details_id, step_id)
values ('Butter', 'Unsalted butter used as the base for the Alfredo sauce.', 2, 3);

insert into "INGREDIENTS"(name, description, recipe_details_id, step_id)
values ('Heavy Cream', 'Rich cream used to create the thick sauce.', 2, 3);

insert into "INGREDIENTS"(name, description, recipe_details_id, step_id)
values ('Garlic', 'Fresh garlic, minced, for flavoring the sauce.', 2, 3);

insert into "INGREDIENTS"(name, description, recipe_details_id, step_id)
values ('Parmesan Cheese', 'Finely grated Parmesan cheese to thicken and flavor the sauce.', 2, 3);

insert into "INGREDIENTS"(name, description, recipe_details_id, step_id)
values ('Fresh Parsley', 'Chopped parsley for garnish.', 2, 4);


INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (1, 'Cinnamon', 'A warm, aromatic spice made from the bark of trees.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (2, 'Salt', 'A common mineral used to enhance flavor.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (3, 'Sugar', 'A sweet crystalline substance used in cooking and baking.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (4, 'Black Pepper', 'A spicy and pungent seasoning made from dried peppercorns.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (5, 'Olive Oil', 'A rich oil derived from pressed olives, commonly used in cooking.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (6, 'Garlic', 'A pungent, flavorful bulb used in many cuisines.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (7, 'Onion', 'A versatile root vegetable with a strong flavor.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (8, 'Basil', 'A fragrant herb commonly used in Italian dishes.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (9, 'Parsley', 'A fresh herb often used as a garnish or seasoning.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (10, 'Thyme', 'A herb with a subtle, earthy flavor.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (11, 'Rosemary', 'A fragrant herb with a pine-like flavor.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (12, 'Oregano', 'A flavorful herb often used in Mediterranean dishes.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (13, 'Paprika', 'A ground spice made from dried peppers, sweet or smoky.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (14, 'Chili Powder', 'A blend of spices used to add heat to dishes.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (15, 'Cumin', 'A spice with a warm, earthy flavor.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (16, 'Turmeric', 'A bright yellow spice known for its earthy flavor and health benefits.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (17, 'Ginger', 'A zesty, spicy root used in cooking and beverages.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (18, 'Nutmeg', 'A sweet, aromatic spice often used in baking.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (19, 'Vanilla Extract', 'A fragrant extract derived from vanilla beans.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (20, 'Almonds', 'Crunchy nuts used in baking and snacks.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (21, 'Walnuts', 'A rich, earthy nut used in cooking and desserts.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (22, 'Lemon Juice', 'A tart juice extracted from lemons.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (23, 'Tomato', 'A juicy, red fruit used in many dishes.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (24, 'Carrot', 'A crunchy orange root vegetable.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (25, 'Celery', 'A crisp, fibrous vegetable used in soups and salads.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (26, 'Potato', 'A starchy tuber used in various dishes.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (27, 'Spinach', 'A leafy green vegetable rich in nutrients.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (28, 'Mushroom', 'A versatile fungus used in cooking.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (29, 'Chicken', 'A common poultry meat used in various cuisines.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (30, 'Beef', 'A red meat derived from cattle.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (31, 'Fish', 'A versatile source of protein from the sea.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (32, 'Shrimp', 'A small crustacean often used in seafood dishes.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (33, 'Milk', 'A dairy product rich in calcium.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (34, 'Cheese', 'A dairy product made by coagulating milk.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (35, 'Butter', 'A rich dairy product used in cooking and baking.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (36, 'Eggs', 'A versatile ingredient used in baking and cooking.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (37, 'Flour', 'A finely ground powder made from grains.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (38, 'Rice', 'A staple grain used worldwide in cooking.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (39, 'Pasta', 'A versatile wheat-based food used in Italian cuisine.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (40, 'Honey', 'A natural sweetener made by bees.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (41, 'Soy Sauce', 'A salty, fermented condiment used in Asian cooking.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (42, 'Vinegar', 'A sour liquid used in cooking and pickling.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (43, 'Yeast', 'A leavening agent used in baking.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (44, 'Coriander', 'A herb with a citrus-like flavor.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (45, 'Mint', 'A refreshing herb used in cooking and beverages.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (46, 'Peanut Butter', 'A spread made from ground peanuts.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (47, 'Chocolate', 'A sweet treat made from cocoa.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (48, 'Coconut', 'A tropical fruit used in cooking and baking.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (49, 'Zucchini', 'A summer squash used in various dishes.');
INSERT INTO "AVAILABLE_INGREDIENTS" (id, name, description) VALUES (50, 'Eggplant', 'A versatile vegetable used in many cuisines.');
insert into "AVAILABLE_INGREDIENTS"(id,name, description) values (51,'Fettuccine Pasta', 'Wide, flat pasta used in creamy sauces.');
insert into "AVAILABLE_INGREDIENTS"(id,name, description) values (52,'Chicken Breasts', 'Boneless, skinless chicken breasts, seasoned and cooked.');
insert into "AVAILABLE_INGREDIENTS"(id,name, description)values (53,'Butter', 'Unsalted butter used as the base for the Alfredo sauce.');
insert into "AVAILABLE_INGREDIENTS"(id,name, description)values (54,'Heavy Cream', 'Rich cream used to create the thick sauce.');
insert into "AVAILABLE_INGREDIENTS"(id,name, description)values (55,'Garlic', 'Fresh garlic, minced, for flavoring the sauce.');
insert into "AVAILABLE_INGREDIENTS"(id,name, description)values (56,'Parmesan Cheese', 'Finely grated Parmesan cheese to thicken and flavor the sauce.');
insert into "AVAILABLE_INGREDIENTS"(id,name, description)values (57,'Fresh Parsley', 'Chopped parsley for garnish.');
