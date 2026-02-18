import java.io.*;

public class EjecutarPython {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "script.py");
            Process proceso = pb.start();

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(proceso.getInputStream())
            );

            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println("Salida de Python: " + linea);
            }

            proceso.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
