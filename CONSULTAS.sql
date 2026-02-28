-- Obtener todos los libros disponibles en la biblioteca

SELECT * FROM libro
WHERE disponible = TRUE;

-- Consulta con Subconsulta: Obtener los miembros que han tomado más de 5 préstamos

SELECT *
FROM miembro
WHERE id_miembro IN (
    SELECT id_miembro
    FROM prestamo
    GROUP BY id_miembro
    HAVING COUNT(*) > 5
);

--  Consulta con JOIN: Obtener los títulos de los libros y los nombres de los autores

SELECT libro.titulo, autor.nombre
FROM libro
JOIN autor ON libro.id_autor = autor.id_autor;

