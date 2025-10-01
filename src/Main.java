import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("============= Sistema de procesamiento de reseñas de productos =============\n");

        Cliente cliente1 = new Cliente("C001", "Juan Pérez");
        Cliente cliente2 = new Cliente("C002", "María Gómez");
        Cliente cliente3 = new Cliente("C003", "Luis Rodríguez");

        List<Review> reviews = List.of(
                new Review("R001", cliente1, Producto.COMPUTADORA, "Excelente producto, muy recomendado."),
                new Review("R002", cliente2, Producto.MOUSE, "No me gustó, esperaba más."),
                new Review("R003", cliente3, Producto.TECLADO, "Muy bueno para el precio."),
                new Review("R004", cliente1, Producto.MONITOR, "Muy mala calidad de imagen."),
                new Review("R005", cliente2, Producto.IMPRESORA, "Satisfecho con la compra."),
                new Review("R006", cliente3, Producto.TABLET, "Perfecto para mis necesidades."),
                new Review("R007", cliente1, Producto.CELULAR, "Mal rendimiento y poca duración batería."),
                new Review("R008", cliente2, Producto.AURICULARES, "Increible calidad de sonido."),
                new Review("R009", cliente3, Producto.ALTAVOCES, "Maravilloso diseño y potencia."),
                new Review("R010", cliente1, Producto.CAMARA, "No cumple con mis expectativas.")
        );
    }
}