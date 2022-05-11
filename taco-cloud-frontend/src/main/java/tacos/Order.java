package tacos;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Order {
private String id;
private String name;
private String street;
private String city;
private String state;
private String zip;
private String ccNumber;
private String ccExpiration;
private String ccCVV;
private Date placeAt;
private List<Taco> tacos;
}