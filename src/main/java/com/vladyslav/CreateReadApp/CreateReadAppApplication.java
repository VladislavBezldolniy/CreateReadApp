package com.vladyslav.CreateReadApp;

import com.vladyslav.CreateReadApp.model.Ammo;
import com.vladyslav.CreateReadApp.model.Dice;
import com.vladyslav.CreateReadApp.model.MeleeWeapon;
import com.vladyslav.CreateReadApp.model.RangeWeapon;
import com.vladyslav.CreateReadApp.repo.AmmoRepo;
import com.vladyslav.CreateReadApp.service.ItemServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

import static com.vladyslav.CreateReadApp.model.Ammo.Caliber.Caliber9mm;

@SpringBootApplication
public class CreateReadAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(CreateReadAppApplication.class, args);
		ItemServiceImpl itemService = configurableApplicationContext.getBean(ItemServiceImpl.class);

		/*itemService.create(new MeleeWeapon("Katana", 395, "Bite me", "", Dice.D12));
		itemService.create(new RangeWeapon("M24", 2345.4, "Protec", ""));
		*/

		AmmoRepo ammoRepository = configurableApplicationContext.getBean(AmmoRepo.class);
		Arrays.asList(Ammo.Caliber.values()).forEach(caliber -> ammoRepository.save(new Ammo(caliber)));

	}
}
