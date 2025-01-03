package hiber.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "car")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }


}
