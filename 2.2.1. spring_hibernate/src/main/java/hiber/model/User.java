package hiber.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Long id;

   @Column(name = "name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "email")
   private String email;


   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "car_id")
   private Car userCar;

   public User() {}

   public User(String firstName, String lastName, String email, Car userCar) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.userCar = userCar;
   }


}
