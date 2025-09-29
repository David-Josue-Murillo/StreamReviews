import java.util.Arrays;
import java.util.List;

public class ReviewProcessor {
    private static final List<String> PALABRAS_POSITIVAS = Arrays.asList(
            "excelente", "recomendado", "muy bueno", "me encanto", "me gusto", "satisfecho", "perfecto", "fantastico", "increible", "maravilloso"
    );

    private List<Review> reviews;

    public ReviewProcessor(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<Review> filtrarResenasPositivas() {
        return reviews.stream()
                .filter(review -> PALABRAS_POSITIVAS.stream()
                        .anyMatch(palabra -> review.getText().toLowerCase().contains(palabra)))
                .toList();
    }
}
