import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Seleccione su idioma / Select your language:");
        System.out.println("1. Español");
        System.out.println("2. English");
        int opcion = input.nextInt();

        Traduccion traduccion;
        switch(opcion) {
            case 1:
                traduccion = new TraduccionEspanol();
                break;
            case 2:
                traduccion = new TraduccionIngles();
                break;
            default:
                System.out.println("Opción no válida / Invalid option");
                input.close();
                return;
        }

        traduccion.introducirDistancia();
        double distancia = input.nextDouble();

        traduccion.introducirTiempo();
        double tiempo = input.nextDouble();

        double tiempoHoras = tiempo / 60.0;
        double velocidadMedia = distancia / tiempoHoras;

        traduccion.inicioRespuesta();
        System.out.printf("%.1f", velocidadMedia);
        traduccion.finRespuesta();

        input.close();
    }
}