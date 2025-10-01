import java.util.List;
import java.util.Map;

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
                new Review("R010", cliente1, Producto.CELULAR, "Excelente cámara y batería duradera."),
                new Review("R011", cliente2, Producto.MONITOR, "Colores vivos, me encantó la resolución."),
                new Review("R012", cliente3, Producto.ALTAVOCES, "Muy bueno, me gustó el sonido envolvente."),
                new Review("R013", cliente1, Producto.TABLET, "Perfecto para estudiar, fantástico equipo."),
                new Review("R014", cliente2, Producto.TABLET, "Impresiones nítidas, satisfecho con la compra."),
                new Review("R015", cliente3, Producto.ALTAVOCES, "Demasiado grandes para mi escritorio."),
                new Review("R016", cliente1, Producto.CAMARA, "Se descarga muy rápido la batería."),
                new Review("R017", cliente2, Producto.MOUSE, "No responde bien el clic derecho."),
                new Review("R018", cliente3, Producto.TECLADO, "Las teclas se traban fácilmente."),
                new Review("R019", cliente1, Producto.COMPUTADORA, "Se calienta mucho al usarla.")

        );

        ReviewProcessor processor = new ReviewProcessor(reviews);

        // Filtrar y mostrar las reseñas positivas
        List<Review> positiveReviews = processor.filtrarResenasPositivas();
        System.out.println("=== Reseñas positivas ===");
        positiveReviews.forEach(review -> System.out.println("- " + review.getText()));


        // Agrupar y mostrar las reseñas positivas por producto
        System.out.println("\n === Reseñas positivas agrupadas por producto ===");
        Map<Producto, List<Review>> reviewsAgrupadasPorProducto = processor.agruparResenasPorProducto();
        reviewsAgrupadasPorProducto.forEach((producto, resenas) -> {
            System.out.println("Producto: " + producto);
            resenas.forEach(resena -> System.out.println(" - " + resena.getText()));
        });


        // Contar y mostrar el número de reseñas positivas por producto
        System.out.println("\n=== Conteo de reseñas positivas por producto ===");
        Map<Producto, Long> conteoResenasPorProducto = processor.contarResenasPositivasPorProducto();
        conteoResenasPorProducto.forEach((producto, conteo) ->
            System.out.println("Producto: " + producto + " - Reseñas positivas : " + conteo)
        );
    }
}