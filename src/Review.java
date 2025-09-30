public class Review {
    private String reviewId;
    private Cliente clienteId;
    private Producto producto;
    private String text;

    public Review(String reviewId, Cliente clienteId, Producto producto, String text) {
        this.reviewId = reviewId;
        this.clienteId = clienteId;
        this.producto = producto;
        this.text = text;
    }

    public String getReviewId() {
        return reviewId;
    }

    public Review setReviewId(String reviewId) {
        this.reviewId = reviewId;
        return this;
    }

    public Cliente getClienteId() {
        return clienteId;
    }

    public Review setClienteId(Cliente clienteId) {
        this.clienteId = clienteId;
        return this;
    }

    public Producto getProducto() {
        return producto;
    }

    public Review setProducto(Producto producto) {
        this.producto = producto;
        return this;
    }

    public String getText() {
        return text;
    }

    public Review setText(String text) {
        this.text = text;
        return this;
    }
}
