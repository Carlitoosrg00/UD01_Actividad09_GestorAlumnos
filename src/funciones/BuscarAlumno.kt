package funciones

import modelo.Alumno

// Función para buscar alumnos
fun buscarAlumno(alumnos: List<Alumno>) {

    // Comprueba si la lista está vacía
    if (alumnos.isEmpty()) {

        // Informa al usuario
        println("No hay alumnos registrados.")

        // Sale de la función
        return
    }

    // Solicita un texto de búsqueda
    print("Introduce el texto a buscar: ")

    // Convierte el texto a minúsculas
    val texto = readln().lowercase()

    // Busca coincidencias en nombres y apellidos
    val encontrados = alumnos.filter {

        // Comprueba si contiene el texto buscado
        it.nombre.lowercase().contains(texto) ||
                it.apellidos.lowercase().contains(texto)
    }

    // Comprueba si no existen coincidencias
    if (encontrados.isEmpty()) {

        // Muestra mensaje
        println("No se han encontrado alumnos con ese criterio.")

        // Termina la función
        return
    }

    // Muestra el encabezado
    println("\n===== RESULTADOS DE BÚSQUEDA =====")

    // Recorre los resultados encontrados
    encontrados.forEach {

        // Muestra la información del alumno
        println("${it.nombre} ${it.apellidos} - Nota: ${it.nota}")
    }
}