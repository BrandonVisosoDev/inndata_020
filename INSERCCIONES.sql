-- =========================
-- INSERTS PARA AUTOR
-- =========================

INSERT INTO autor (nombre, nacionalidad) VALUES
('Gabriel García Márquez', 'Colombiana'),
('Isabel Allende', 'Chilena'),
('Haruki Murakami', 'Japonesa');


-- =========================
-- INSERTS PARA LIBRO
-- =========================
-- (Usamos id_autor 1, 2 y 3 creados arriba)

INSERT INTO libro (titulo, year_publicacion, genero, disponible, id_autor) VALUES
('Cien Años de Soledad', 1967, 'Realismo mágico', TRUE, 1),
('La Casa de los Espíritus', 1982, 'Novela', TRUE, 2),
('Kafka en la Orilla', 2002, 'Ficción contemporánea', TRUE, 3);


-- =========================
-- INSERTS PARA MIEMBRO
-- =========================

INSERT INTO miembro (nombre, email, telefono) VALUES
('Carlos Ramírez', 'carlos@email.com', '7771234567'),
('María López', 'maria@email.com', '7779876543'),
('Ana Torres', 'ana@email.com', '7775551234');


-- =========================
-- INSERTS PARA PRESTAMO
-- =========================
-- (Usamos id_miembro 1,2,3 y id_libro 1,2,3)

INSERT INTO prestamo (fecha_prestamo, fecha_devolucion, id_miembro, id_libro) VALUES
('2026-02-01', '2026-02-10', 1, 1),
('2026-02-05', '2026-02-15', 2, 2),
('2026-02-08', '2026-02-18', 3, 3);