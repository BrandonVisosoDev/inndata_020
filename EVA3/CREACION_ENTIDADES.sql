-- Creamos la Entidad AUTOR

CREATE TABLE IF NOT EXISTS autor(

id_autor INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(100) NOT NULL,
nacionalidad VARCHAR(50) NOT NULL

)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- Creamos la Entidad LIBRO

CREATE TABLE IF NOT EXISTS libro(

id_libro INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
titulo VARCHAR(100) NOT NULL,
year_publicacion YEAR NOT NULL,
genero varchar(50) NOT NULL,
disponible BOOLEAN NOT NULL,
id_autor INT UNSIGNED NOT NULL,
FOREIGN KEY(id_autor) REFERENCES autor(id_autor)
 
);

-- Creamos la Entidad MIEMBRO

CREATE TABLE IF NOT EXISTS miembro(

id_miembro INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(100) NOT NULL,
email varchar(255) NOT NULL UNIQUE,
telefono varchar(20) NOT NULL 

);

-- Creamos la Entidad PRESTAMO

CREATE TABLE IF NOT EXISTS prestamo(


id_prestamo INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
fecha_prestamo DATE NOT NULL,
fecha_devolucion DATE NOT NULL,

-- Foraneas
id_miembro INT UNSIGNED NOT NULL,
id_libro INT UNSIGNED NOT NULL,

FOREIGN KEY (id_miembro) REFERENCES miembro(id_miembro),
FOREIGN KEY (id_libro) REFERENCES libro(id_libro)

);


