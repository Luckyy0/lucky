package tacos;

import java.sql.Date;
import java.util.List;

import lombok.Data;

@Data
public class Taco {
	private Long id;
	private String name;
	private Date creatAt;
	private List<Ingredient> ingredients;
	
}
