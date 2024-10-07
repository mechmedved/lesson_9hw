package task2;

public class Product {
    private String name;
    private String price;
    private int rating;

    public Product(String name, String price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("Product{" +
                " name %s," +
                " price %s," +
                " rating %d}",getName(), getPrice(), getRating());
    }
}
