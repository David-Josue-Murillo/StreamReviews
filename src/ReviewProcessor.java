import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReviewProcessor {
    // Lista de palabras clave que indican una reseña positiva
    private static final List<String> PALABRAS_POSITIVAS = Arrays.asList(
            "excelente", "recomendado", "muy bueno", "me encanto", "me gusto", "satisfecho", "perfecto", "fantastico", "increible", "maravilloso"
    );

    // Lista de reseñas a procesar
    private List<Review> reviews;

    public ReviewProcessor(List<Review> reviews) {
        this.reviews = reviews;
    }

    // Filtra y devuelve las reseñas que contienen palabras positivas
    public List<Review> filtrarResenasPositivas() {
        return reviews.stream()
                .filter(review -> PALABRAS_POSITIVAS.stream()
                        .anyMatch(palabra -> review.getText().toLowerCase().contains(palabra))
                )
                .toList();
    }

    // Agrupar las reseñas positivas por producto
    public Map<Producto, List<Review>> agruparResenasPorProducto() {
        return filtrarResenasPositivas()
                .stream()
                .collect(Collectors.groupingBy(Review::getProducto));
    }

    // Contar reseñas positivas por producto
    public Map<Producto, Long> contarResenasPositivasPorProducto() {
        return filtrarResenasPositivas()
                .stream()
                .collect(Collectors.groupingBy(Review::getProducto, Collectors.counting()));
    }

    // Generar un ranking de productos ordenado por cantidad de reseñas positivas.
    public List<Map.Entry<Producto, Long>> rankingProductosPorResenasPositivas() {
        return contarResenasPositivasPorProducto()
                .entrySet()
                .stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .toList();
    }
}
