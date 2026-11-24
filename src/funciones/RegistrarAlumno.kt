package funciones

// Importa la clase Alumno del paquete modelo
import modelo.Alumno

// Función encargada de registrar un nuevo alumno
fun registrarAlumno(alumnos: MutableList<Alumno>) {

    // Solicita el nombre
    print("Introduce el nombre: ")

    // Lee el nombre y elimina espacios al principio y final
    val nombre = readln().trim()

    // Comprueba si está vacío
    if (nombre.isEmpty()) {

        // Muestra mensaje de error
        println("El nombre no puede estar vacío.")

        // Sale de la función
        return
    }

    // Solicita los apellidos
    print("Introduce los apellidos: ")

    // Lee los apellidos
    val apellidos = readln().trim()

    // Comprueba si están vacíos
    if (apellidos.isEmpty()) {

        // Muestra mensaje de error
        println("Los apellidos no pueden estar vacíos.")

        // Sale de la función
        return
    }

    // Solicita la nota
    print("Introduce la nota final (0-10): ")

    // Convierte la entrada a número decimal
    val nota = readlnOrNull()?.toDoubleOrNull()

    // Comprueba si la nota es válida
    if (nota == null || nota < 0 || nota > 10) {

        // Muestra mensaje de error
        println("Nota no válida.")

        // Sale de la función
        return
    }

    // Añade el nuevo alumno a la lista
    alumnos.add(Alumno(nombre, apellidos, nota))

    // Confirma el registro
    println("Alumno registrado correctamente.")
}