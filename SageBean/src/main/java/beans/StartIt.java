package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartIt {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanCongif.class);
		
		PersonService personService = applicationContext.getBean("personService", PersonService.class);

		System.out.println("Before winning more points: ");
		System.out.println(personService.getPerson(1).getfName() + " bal: " + personService.getPerson(1).getPoints() + " points.");
		
		personService.addPoints(1, 20);
		
		System.out.println("After points added: ");
		System.out.println(personService.getPerson(1).getfName() +  " bal: " + personService.getPerson(1).getPoints() + " points.");
	}

}
