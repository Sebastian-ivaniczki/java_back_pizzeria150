package org.java.pizzeria;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.java.pizzeria.pojo.Ingredient;
import org.java.pizzeria.pojo.Pizza;
import org.java.pizzeria.pojo.SpecialOffer;
import org.java.pizzeria.pojo.auth.Role;
import org.java.pizzeria.pojo.auth.User;
import org.java.pizzeria.services.IngredientService;
import org.java.pizzeria.services.PizzaService;
import org.java.pizzeria.services.RoleService;
import org.java.pizzeria.services.SpecialOfferService;
import org.java.pizzeria.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class SpringLaMiaPizzeriaCrudApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}

	

}
