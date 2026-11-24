package funciones

import modelo.Alumno

// Función que muestra alumnos aprobados
fun mostrarAprobados(alumnos: List<Alumno>) {

    // Filtra notas iguales o superiores a 5
    val aprobados = alumnos.filter { it.nota >= 5 }

    // Comprueba si existen aprobados
    if (aprobados.isEmpty()) {

        // Muestra mensaje informativo
        println("No hay alumnos aprobados.")

        // Sale de la función
        return
    }

    // Muestra el encabezado
    println("\n===== ALUMNOS APROBADOS =====")

    // Recorre todos los aprobados
    aprobados.forEach {

        // Muestra los datos del alumno
        println("${it.nombre} ${it.apellidos} - Nota: ${it.nota}")
    }
}