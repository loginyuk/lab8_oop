package edu.lab8.flowers;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Entity
@Table(name = "flower")
public class Flower {
    @Id
    @SequenceGenerator(
        name = "flower_sequence",
        sequenceName = "flower_sequence",
        allocationSize = 1
    )

    private Integer id;
    private FlowerColor color;
    private double price;
    private double length;

    public Flower() {
    }

    // Keep only one of the constructors
    public Flower(FlowerColor color, double price, double length) {
        this.color = color;
        this.price = price;
        this.length = length;
    }
}
