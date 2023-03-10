package application.entities;

public class Product {

    private Integer id;
    private String name;
    private Double price;
    private Integer quant;

    public Product(){};

    public Product(Integer id, String name, Double price, Integer quant) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quant = quant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price= R$" + price +
                ", quant=" + quant +
                '}';
    }
}
