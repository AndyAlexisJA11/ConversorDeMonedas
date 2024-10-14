import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HistoriaConversiones {
    private final List<String> historial = new ArrayList<>();
    private final DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public void agregarHistorial(String base, String destino, double cantidad, double resultado) {
        String fechaHora = LocalDateTime.now().format(formatoFecha);
        historial.add("Convertido: " + cantidad + " " + base + " a " + resultado + " " + destino);
    }
    public  void mostrarHistorial() {
        if (historial.isEmpty()){
            System.out.println("No hay historial de conversiones.");
        }else {
            System.out.println("Historial de conversiones: ");
            for (String conversion : historial){
                System.out.println(conversion);
            }
        }
    }
}
