package funciones

import modelo.Alumno

// Función que calcula la media de las notas
fun calcularMedia(alumnos: List<Alumno>): Double {

    // Comprueba si no hay alumnos
    if (alumnos.isEmpty()) {

        // Devuelve cero para evitar errores
        return 0.0
    }

    // Obtiene las notas y calcula la media
    return alumnos.map { it.nota }.average()
}