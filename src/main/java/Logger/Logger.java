package Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;

    // Definimos un enum para los niveles de log
    public enum LogLevel {
        INFO, WARNING, ERROR
    }

    // Constructor privado
    private Logger() {
        try {
            // Abrimos el fichero en modo append (true)
            FileWriter fileWriter = new FileWriter("output.txt", true);
            writer = new PrintWriter(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para obtener la instancia única (Singleton)
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Método genérico para log con nivel
    public void log(LogLevel level, String mensaje) {
        String logMessage = String.format("[%s] [%s] %s", java.time.LocalTime.now(), level, mensaje);
        writer.println(logMessage);
        writer.flush(); // Asegura que se escriba inmediatamente en el fichero
    }

    // Método simplificado (por defecto INFO)
    public void log(String mensaje) {
        log(LogLevel.INFO, mensaje);
    }

    // Método para cerrar el writer al final de la ejecución si se desea
    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}
