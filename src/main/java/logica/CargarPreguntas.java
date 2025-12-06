package logica;

import java.util.ArrayList;
import java.util.List;

/**
 * Carga un conjunto de preguntas (20) en la lista lista_preguntas.
 */
public class CargarPreguntas {

    public List<Pregunta> lista_preguntas = new ArrayList<>();

    public CargarPreguntas() {

        // ----------- TECNOLOGÍA / INFORMÁTICA BÁSICA (10) -----------
        String p1 = "¿Qué es un IDE?\n"
                + "A. Sistema Operativo\n"
                + "B. Entorno de Desarrollo Integrado\n"
                + "C. Lenguaje de Programación\n"
                + "D. Base de Datos";
        lista_preguntas.add(new Pregunta("T1 - Informática Básica", p1, 'b'));

        String p2 = "¿Qué significa OOP en programación?\n"
                + "A. Output-Oriented Process\n"
                + "B. Object-Oriented Programming\n"
                + "C. Open Operation Protocol\n"
                + "D. Onsite Operational Procedure";
        lista_preguntas.add(new Pregunta("T2 - Informática Básica", p2, 'b'));

        String p3 = "¿Qué es Git?\n"
                + "A. Un sistema operativo\n"
                + "B. Un lenguaje de programación\n"
                + "C. Un sistema de control de versiones\n"
                + "D. Un editor de textos";
        lista_preguntas.add(new Pregunta("T3 - Informática Básica", p3, 'c'));

        String p4 = "¿Qué es una API?\n"
                + "A. Un tipo de virus informático\n"
                + "B. Un servicio para desplegar servidores\n"
                + "C. Una interfaz que permite que aplicaciones se comuniquen\n"
                + "D. Un lenguaje de consulta";
        lista_preguntas.add(new Pregunta("T4 - Informática Básica", p4, 'c'));

        String p5 = "¿Qué significa RAM?\n"
                + "A. Read-Only Memory\n"
                + "B. Random Access Memory (memoria de acceso aleatorio)\n"
                + "C. Remote Application Manager\n"
                + "D. Rapid Access Module";
        lista_preguntas.add(new Pregunta("T5 - Informática Básica", p5, 'b'));

        String p6 = "¿Qué hace el comando 'git commit'?\n"
                + "A. Crea un nuevo repositorio remoto\n"
                + "B. Guarda los cambios en el historial local (commit)\n"
                + "C. Muestra el estado del repositorio\n"
                + "D. Elimina un branch";
        lista_preguntas.add(new Pregunta("T6 - Informática Básica", p6, 'b'));

        String p7 = "¿Cuál de estas es una base de datos relacional?\n"
                + "A. MongoDB\n"
                + "B. Redis\n"
                + "C. MySQL\n"
                + "D. Cassandra";
        lista_preguntas.add(new Pregunta("T7 - Informática Básica", p7, 'c'));

        String p8 = "¿Qué significa 'HTTP'?\n"
                + "A. HyperText Transfer Protocol\n"
                + "B. High Transfer Text Process\n"
                + "C. Hyperlink Text Transfer Program\n"
                + "D. Host Transfer Transport Protocol";
        lista_preguntas.add(new Pregunta("T8 - Informática Básica", p8, 'a'));

        String p9 = "En Java, ¿qué palabra clave impide que una clase sea extendida (heredada)?\n"
                + "A. static\n"
                + "B. final\n"
                + "C. abstract\n"
                + "D. volatile";
        lista_preguntas.add(new Pregunta("T9 - Informática Básica", p9, 'b'));

        String p10 = "¿Cuál de los siguientes es un sistema operativo?\n"
                + "A. Windows\n"
                + "B. Microsoft Word\n"
                + "C. Google Chrome\n"
                + "D. Adobe Photoshop";

        lista_preguntas.add(new Pregunta("T10 - Informática Básica", p10, 'a'));

        // ----------- INGLÉS (5) -----------
        String p11 = "Choose the correct word:\n"
                + "She ___ to the store yesterday.\n"
                + "A. go\n"
                + "B. went\n"
                + "C. going\n"
                + "D. gone";
        lista_preguntas.add(new Pregunta("I1 - Inglés Básico", p11, 'b')); // 'went'

        String p12 = "Choose the synonym of 'quick':\n"
                + "A. slow\n"
                + "B. fast\n"
                + "C. tiny\n"
                + "D. weak";
        lista_preguntas.add(new Pregunta("I2 - Inglés Básico", p12, 'b')); // 'fast'

        String p13 = "Translate to English: 'Libro'\n"
                + "A. Tree\n"
                + "B. Car\n"
                + "C. Book\n"
                + "D. House";
        lista_preguntas.add(new Pregunta("I3 - Inglés Básico", p13, 'c')); // 'Book'

        String p14 = "Choose the correct article:\n"
                + "I have ___ apple.\n"
                + "A. a\n"
                + "B. an\n"
                + "C. the\n"
                + "D. no";
        lista_preguntas.add(new Pregunta("I4 - Inglés Básico", p14, 'b')); // 'an'

        String p15 = "Choose the correct past participle of 'write':\n"
                + "A. writed\n"
                + "B. wrote\n"
                + "C. written\n"
                + "D. writing";
        lista_preguntas.add(new Pregunta("I5 - Inglés Básico", p15, 'c')); // 'written'

        // ----------- MATEMÁTICAS (5) -----------
        String p16 = "¿Cuánto es 9 * 6?\n"
                + "A. 52\n"
                + "B. 54\n"
                + "C. 56\n"
                + "D. 58";
        lista_preguntas.add(new Pregunta("M1 - Matemáticas", p16, 'b'));

        String p17 = "¿Cuál es la raíz cuadrada de 144?\n"
                + "A. 10\n"
                + "B. 11\n"
                + "C. 12\n"
                + "D. 13";
        lista_preguntas.add(new Pregunta("M2 - Matemáticas", p17, 'c'));

        String p18 = "Si x = 3, ¿cuánto vale x^2 + 2?\n"
                + "A. 11\n"
                + "B. 10\n"
                + "C. 9\n"
                + "D. 13";
        lista_preguntas.add(new Pregunta("M3 - Matemáticas", p18, 'a'));

        String p19 = "¿Cuál es el resultado de 45 / 9?\n"
                + "A. 4\n"
                + "B. 5\n"
                + "C. 6\n"
                + "D. 7";
        lista_preguntas.add(new Pregunta("M4 - Matemáticas", p19, 'b'));

        String p20 = "¿Cuánto es 7 + 8 + 5?\n"
                + "A. 19\n"
                + "B. 20\n"
                + "C. 21\n"
                + "D. 22";
        lista_preguntas.add(new Pregunta("M5 - Matemáticas", p20, 'b'));
    }
}