public class TraduccionEspanol implements Traduccion {
    @Override
    public void introducirDistancia() {
        System.out.print("Introduzca la distancia recorrida (km): ");
    }

    @Override
    public void introducirTiempo() {
        System.out.print("Introduzca el tiempo del recorrido (min): ");
    }

    @Override
    public void inicioRespuesta() {
        System.out.print("Se ha desplazado a una velocidad media de ");
    }

    @Override
    public void finRespuesta() {
        System.out.println(" km/h.");
    }
}
