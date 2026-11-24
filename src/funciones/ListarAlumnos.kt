package funciones

import modelo.Alumno

// Función que muestra todos los alumnos registrados
fun listarAlumnos(alumnos: List<Alumno>) {

    // Comprueba si la lista está vacía
    if (alumnos.isEmpty()) {

        // Informa al usuario
        println("No hay alumnos registrados.")

        // Finaliza la función
        return
    }

    // Muestra un encabezado
    println("\n===== LISTADO DE ALUMNOS =====")

    // Recorre la lista mostrando posición y datos
    alumnos.forEachIndexed { index, alumno ->

        // Muestra número, nombre, apellidos y nota
        println("${index + 1}. ${alumno.nombre} ${alumno.apellidos} - Nota: ${alumno.nota}")
    }
}