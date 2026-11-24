package funciones

import modelo.Alumno

// Función para eliminar un alumno
fun eliminarAlumno(alumnos: MutableList<Alumno>) {

    // Comprueba si existen alumnos
    if (alumnos.isEmpty()) {

        // Muestra mensaje informativo
        println("No hay alumnos registrados.")

        // Sale de la función
        return
    }

    // Muestra todos los alumnos registrados
    listarAlumnos(alumnos)

    // Solicita el número del alumno
    print("Introduce el número del alumno a eliminar: ")

    // Lee el valor introducido
    val posicion = readlnOrNull()?.toIntOrNull()

    // Comprueba que la posición sea válida
    if (posicion == null || posicion < 1 || posicion > alumnos.size) {

        // Muestra mensaje de error
        println("Alumno inexistente.")

        // Finaliza la función
        return
    }

    // Elimina el alumno seleccionado
    alumnos.removeAt(posicion - 1)

    // Confirma la eliminación
    println("Alumno eliminado correctamente.")
}