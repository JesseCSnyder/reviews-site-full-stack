package reviewssitefullstack;

import javax.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {

	@Resource
	private CategoryRepo categoryRepo;

	@Resource
	private ReviewRepo reviewRepo;

	@Override
	public void run(String... args) throws Exception {

		Category japanesePunkRock = new Category("Japanese Punk Rock");
		categoryRepo.save(japanesePunkRock);

		Review guitarWolf = new Review("Guitar Wolf", japanesePunkRock, "/images/guitarwolf.jpg",
				"Guitar Wolf is a Japanese garage rock power trio founded in Nagasaki in 1987. The band is known for songs with "
						+ "piercing vocals and an extremely loud style of noise-influenced punk which emphasizes heavy distortion and feedback. - Wikipedia ");
		reviewRepo.save(guitarWolf);
		Review teengenerate = new Review("Teengenerate", japanesePunkRock, "/images/teengenerate.jpg",
				"Teengenerate were a Japanese punk rock band from 1993 to 1996, known for their fun style of playing garage punk with a sense of humor and often incomprehensible English lyrics. - Wikipedia");
		reviewRepo.save(teengenerate);
		Review five678s = new Review("The 5,6,7,8's", japanesePunkRock, "/images/5678s.jpg",
				"The 5.6.7.8's are a Japanese rock trio, whose music is reminiscent of American surf music, rockabilly and garage rock."
						+ " They frequently cover songs from American rock and roll. All members are from Tokyo, Japan. - Wikipedia");
		reviewRepo.save(five678s);
	}
}