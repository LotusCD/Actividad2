
public class HilosMain {
    public static void main(String[] args) {
        
        Producto pan = new Producto("Pan", 1, 2);
        Producto leche = new Producto("Leche", 0, 5);
        Producto huevos = new Producto("Huevos", 1, 7);
        Producto queso = new Producto("Queso", 2, 9);

        // Crear clientes
        ClienteProducto cliente1 = new ClienteProducto("Cliente 1", Arrays.asList(pan, leche, huevos));
        ClienteProducto cliente2 = new ClienteProducto("Cliente 2", Arrays.asList(leche, huevos, queso));
        ClienteProducto cliente3 = new ClienteProducto("Cliente 3", Arrays.asList(pan, huevos));

        // Crear y asignar cajeras
        Cajera1 cajera1 = new Cajera1("Cajera 1", cliente1);
        Cajera1 cajera2 = new Cajera1("Cajera 2", cliente2);
        Cajera1 cajera3 = new Cajera1("Cajera 3", cliente3);

        // Iniciar el proceso de cobro
        cajera1.start();
        cajera2.start();
        cajera3.start();

        // Esperar a que todas las cajeras terminen
        try {
            cajera1.join();
            cajera2.join();
            cajera3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Todas las cajeras han terminado de procesar las compras.");

        
        
        
    }
}
