package com.design_patterns;

import com.design_patterns.behavioural.chain_of_responsibility.*;
import com.design_patterns.behavioural.observer.Observer;
import com.design_patterns.behavioural.observer.PhoneDisplay;
import com.design_patterns.behavioural.observer.TVDisplay;
import com.design_patterns.behavioural.observer.WeatherStation;
import com.design_patterns.behavioural.strategy.BubbleSortStrategy;
import com.design_patterns.behavioural.strategy.QuickSortStrategy;
import com.design_patterns.behavioural.strategy.SortingContext;
import com.design_patterns.creational.abstract_factory.*;
import com.design_patterns.creational.builder.Person;
import com.design_patterns.creational.factory_method.Client;
import com.design_patterns.creational.factory_method.FourWheelerFactory;
import com.design_patterns.creational.factory_method.TwoWheelerFactory;
import com.design_patterns.creational.prototype.Circle;
import com.design_patterns.creational.prototype.Shape;
import com.design_patterns.creational.prototype.ShapeClient;
import com.design_patterns.creational.singleton.MySingleton;
import com.design_patterns.structural.adapter.Printer;
import com.design_patterns.structural.adapter.PrinterAdapter;
import com.design_patterns.structural.bridge.DrawApiA;
import com.design_patterns.structural.bridge.DrawApiB;
import com.design_patterns.structural.decorator.EmailNotifier;
import com.design_patterns.structural.decorator.HeaderNotifierDecorator;
import com.design_patterns.structural.decorator.LoggingNotifierDecorator;
import com.design_patterns.structural.decorator.Notifier;
import com.design_patterns.structural.proxy.Image;
import com.design_patterns.structural.proxy.ImageProxy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class PatternsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("-------------------------------- Creational patterns --------------------------------");

		System.out.println("\n\n---------------- singleton ----------------");
		MySingleton mySingleton1 = MySingleton.getInstance();
		MySingleton mySingleton2 = MySingleton.getInstance();

		System.out.println("mySingleton1: " + mySingleton1.hashCode());
		System.out.println("mySingleton2: " + mySingleton2.hashCode());


		System.out.println("\n\n---------------- factory method ----------------");
		Client client = new Client(new TwoWheelerFactory());
		client.getVehicle().printVehicle();
		client = new Client(new FourWheelerFactory());
		client.getVehicle().printVehicle();


		System.out.println("\n\n---------------- abstract factory ----------------");
		CarFactory carFactory = new EuropeCarFactory();
		Car europeCar = carFactory.createCar();
		Specification europeSpecification = carFactory.createSpecification();
		europeCar.assembly();
		europeSpecification.display();

		carFactory = new NorthAmericaCarFactory();
		Car northAmericaCar = carFactory.createCar();
		Specification northAmericaSpecification = carFactory.createSpecification();
		northAmericaCar.assembly();
		northAmericaSpecification.display();


		System.out.println("\n\n---------------- prototype ----------------");
		Shape circlePrototype = new Circle("red");
		ShapeClient shapeClient = new ShapeClient(circlePrototype);
		Shape circle = shapeClient.createShape();
		circle.draw();


		System.out.println("\n\n---------------- builder ----------------");
		Person person = Person.PersonBuilder.builder()
				.firstName("Marcin")
				.lastName("Marcin")
				.birthDate(LocalDate.of(1992, 2, 6))
				.city("Orawka")
				.build();
		System.out.println(person);


		System.out.println("\n\n-------------------------------- Structural patterns --------------------------------");

		System.out.println("\n\n---------------- adapter ----------------");
		Printer printer = new PrinterAdapter();
		printer.printDocument();


		System.out.println("\n\n---------------- proxy ----------------");
		Image image = new ImageProxy("image.jpg");
		image.display(); //fetching data from disc
		image.display(); //fetching image from cache in proxy


		System.out.println("\n\n---------------- decorator ----------------");
		Notifier emailNotifier = new EmailNotifier();
		Notifier loggingNotifier = new LoggingNotifierDecorator(emailNotifier);
		Notifier headerNotifier = new HeaderNotifierDecorator(loggingNotifier);
		headerNotifier.send("important message");

//		// Plain Coffee
//		Coffee coffee = new PlainCoffee();
//		System.out.println("Description: " + coffee.getDescription());
//		System.out.println("Cost: $" + coffee.getCost());
//
//		// Coffee with Milk
//		Coffee milkCoffee = new MilkDecorator(new PlainCoffee());
//		System.out.println("\nDescription: " + milkCoffee.getDescription());
//		System.out.println("Cost: $" + milkCoffee.getCost());
//
//		// Coffee with Sugar and Milk
//		Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
//		System.out.println("\nDescription: " + sugarMilkCoffee.getDescription());
//		System.out.println("Cost: $" + sugarMilkCoffee.getCost());


		System.out.println("\n\n---------------- bridge ----------------");
		com.design_patterns.structural.bridge.Shape redCircle = new com.design_patterns.structural.bridge.Circle(0, 0, 20, new DrawApiA());
		com.design_patterns.structural.bridge.Shape redSquare = new com.design_patterns.structural.bridge.Square(200, 200, 25, new DrawApiA());
		com.design_patterns.structural.bridge.Shape blueCircle = new com.design_patterns.structural.bridge.Circle(10, 10, 30, new DrawApiB());
		com.design_patterns.structural.bridge.Shape blueSquare = new com.design_patterns.structural.bridge.Square(210, 210, 35, new DrawApiB());
		redCircle.draw();
		redSquare.draw();
		blueCircle.draw();
		blueSquare.draw();



		System.out.println("\n\n-------------------------------- Behavioural patterns --------------------------------");

		System.out.println("\n\n---------------- observer ----------------");
		WeatherStation weatherStation = new WeatherStation();

		Observer phoneDisplay = new PhoneDisplay();
		Observer tvDisplay = new TVDisplay();

		weatherStation.addObserver(phoneDisplay);
		weatherStation.addObserver(tvDisplay);

		weatherStation.setTemperature(15);

		phoneDisplay.display();
		tvDisplay.display();

		weatherStation.setTemperature(23);

		phoneDisplay.display();
		tvDisplay.display();


		System.out.println("\n\n---------------- strategy ----------------");
		SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
		int[] numbers = { 2, 5, 7, 3, 4 };
		sortingContext.performSort(numbers);
		System.out.println("Numbers after bubble sort strategy: " + Arrays.toString(numbers));

		sortingContext.setSortStrategy(new QuickSortStrategy());
		numbers = new int[]{ 8, 6, 4, 2, 9, 0 };
		sortingContext.performSort(numbers);
		System.out.println("Numbers after quick sort strategy: " + Arrays.toString(numbers));


		System.out.println("\n\n---------------- chain of responsibility ----------------");
		RequestHandler requestHandlerLevel1 = new RequestHandlerLevel1();
		RequestHandler requestHandlerLevel2 = new RequestHandlerLevel2();
		RequestHandler requestHandlerLevel3 = new RequestHandlerLevel3();

		requestHandlerLevel1.setNextRequestHandler(requestHandlerLevel2);
		requestHandlerLevel2.setNextRequestHandler(requestHandlerLevel3);

		requestHandlerLevel1.handleRequest(new Request(Priority.CRITICAL, "Normal message"));


		System.out.println("\n\n---------------- visitor ----------------");
//		ItemElement[] items = new ItemElement[]{new Book(20, "1234"),
//				new Book(100, "5678"), new Fruit(10, 2, "Banana"),
//				new Fruit(5, 5, "Apple")};
//
//		int total = calculatePrice(items);
//		System.out.println("Total Cost = "+total);




	}

//	private static int visitorCalculatePrice(ItemElement[] items) {
//		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
//		int sum=0;
//		for(ItemElement item : items)
//		{
//			sum = sum + item.accept(visitor);
//		}
//		return sum;
//	}

}
