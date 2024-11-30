package apptive.study.domain;

import lombok.Getter;
import lombok.Setter;

public class Product {

    @Setter
    @Getter
    private Long id;
    @Setter
    @Getter
    private String name;
    @Getter
    @Setter
    private int price;
    @Getter
    @Setter
    private int amount;

    public Product() {

    }

    public Product(String name, int price, int amount) {

    }
}