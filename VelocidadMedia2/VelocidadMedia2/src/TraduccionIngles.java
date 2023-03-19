public class TraduccionIngles implements Traduccion {
    @Override
    public void introducirDistancia() {
        System.out.print("Enter the distance traveled (km): ");
    }

    @Override
    public void introducirTiempo() {
        System.out.print("Enter the travel time (min): ");
    }

    @Override
    public void inicioRespuesta() {
        System.out.print("You traveled at an average speed of ");
    }

    @Override
    public void finRespuesta() {
        System.out.println(" km/h.");
    }
}
