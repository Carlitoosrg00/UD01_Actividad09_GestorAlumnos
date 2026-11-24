package funciones

import modelo.Alumno

// Función que muestra la media del grupo
fun mostrarMedia(alumnos: List<Alumno>) {

    // Comprueba si existen alumnos
    if (alumnos.isEmpty()) {

        // Muestra mensaje informativo
        println("No hay alumnos registrados.")

        // Finaliza la función
        return
    }

    // Muestra la media con dos decimales
    println(
        "La media del grupo es: %.2f".format(
            calcularMedia(alumnos)
        )
    )
}