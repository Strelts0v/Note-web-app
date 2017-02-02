create table users(
	id_user INTEGER NOT NULL PRIMARY KEY,
	email varchar(40),
	password varchar(30)
);

create table notes(
	id_note INTEGER NOT NULL PRIMARY KEY,
	id_user INTEGER NOT NULL,
	name VARCHAR(47),
	email VARCHAR(30),
	FOREIGN KEY(id_user) references users(id_user)
);