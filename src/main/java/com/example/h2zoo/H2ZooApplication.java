package com.example.h2zoo;

import com.example.h2zoo.model.Fish;
import com.example.h2zoo.model.Mammal;
import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.repository.FishRepository;
import com.example.h2zoo.repository.MammalRepository;
import com.example.h2zoo.repository.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(H2ZooApplication.class, args);
		ReptileRepository reptileRepository = configurableApplicationContext.getBean(ReptileRepository.class);
		Reptile kingCobra = new Reptile("Slither", "Snake", "Black and Yellow", "Carnivore");
		Reptile komodoDragon = new Reptile("Mango", "Lizard", "Brown", "Carnivore");
		Reptile ballPython = new Reptile("Mimo", "Snake", "Black", "Carnivore");
		reptileRepository.saveAll(List.of(kingCobra, komodoDragon, ballPython));

		FishRepository fishRepository = configurableApplicationContext.getBean(FishRepository.class);
		Fish hammerhead = new Fish("Phillip","Shark", "Grey","Carnivore");
		Fish picasso = new Fish("Picasso", "Triggerfish", "White, Black, Yellow","Carnivore");
		fishRepository.saveAll(List.of(hammerhead, picasso));

		MammalRepository mammalRepository = configurableApplicationContext.getBean(MammalRepository.class);
		Mammal chihuahua = new Mammal("Bella","Dog", "White and Brown","Omnivore");
		Mammal pug = new Mammal("Luna", "Dog", "Black and Fawn","Omnivore");
		mammalRepository.saveAll(List.of(pug, chihuahua));
	}

}
