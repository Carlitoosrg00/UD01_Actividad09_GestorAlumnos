// Importa la clase Alumno del paquete modelo
import modelo.Alumno

// Importa todas las funciones del paquete funciones
import funciones.*

// Función principal del programa
fun main() {

    // Crea una lista mutable donde se almacenarán los alumnos
    val alumnos = mutableListOf<Alumno>()

    // Variable que guardará la opción seleccionada en el menú
    var opcion: Int

    // Bucle que se repetirá hasta que el usuario elija salir
    do {

        // Muestra una línea en blanco y el título del menú
        println("\n===== GESTOR DE ALUMNOS =====")

        // Muestra la opción para registrar un alumno
        println("1. Registrar alumno")

        // Muestra la opción para listar alumnos
        println("2. Listar alumnos")

        // Muestra la opción para calcular la media
        println("3. Calcular media del grupo")

        // Muestra la opción para mostrar aprobados
        println("4. Mostrar aprobados")

        // Muestra la opción para mostrar suspensos
        println("5. Mostrar suspensos")

        // Muestra la opción para buscar alumnos
        println("6. Buscar alumno")

        // Muestra la opción para eliminar alumnos
        println("7. Eliminar alumno")

        // Muestra la opción para salir
        println("0. Salir")

        // Solicita una opción al usuario
        print("Seleccione una opción: ")

        // Lee la opción introducida y la convierte a entero
        // Si hay error se asigna el valor 0
        opcion = readlnOrNull()?.toIntOrNull() ?: -1

        // Ejecuta una acción según la opción elegida
        when (opcion) {

            // Llama a la función de registrar alumno
            1 -> registrarAlumno(alumnos)

            // Llama a la función de listar alumnos
            2 -> listarAlumnos(alumnos)

            // Llama a la función que muestra la media
            3 -> mostrarMedia(alumnos)

            // Llama a la función que muestra aprobados
            4 -> mostrarAprobados(alumnos)

            // Llama a la función que muestra suspensos
            5 -> mostrarSuspensos(alumnos)

            // Llama a la función de búsqueda
            6 -> buscarAlumno(alumnos)

            // Llama a la función de eliminación
            7 -> eliminarAlumno(alumnos)

            // Finaliza el programa
            0 -> println("Saliendo del programa...")

            // Captura cualquier opción incorrecta
            else -> println("Opción no válida.")
        }

        // El menú continuará mientras la opción no sea 8
    } while (opcion != 0)
}