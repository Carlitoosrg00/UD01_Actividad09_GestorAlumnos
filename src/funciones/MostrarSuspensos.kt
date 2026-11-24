package funciones

import modelo.Alumno

// Función que muestra alumnos suspensos
fun mostrarSuspensos(alumnos: List<Alumno>) {

    // Filtra alumnos con nota inferior a 5
    val suspensos = alumnos.filter { it.nota < 5 }

    // Comprueba si existen suspensos
    if (suspensos.isEmpty()) {

        // Muestra mensaje informativo
        println("No hay alumnos suspensos.")

        // Finaliza la función
        return
    }

    // Muestra el encabezado
    println("\n===== ALUMNOS SUSPENSOS =====")

    // Recorre todos los suspensos
    suspensos.forEach {

        // Muestra los datos del alumno
        println("${it.nombre} ${it.apellidos} - Nota: ${it.nota}")
    }
}