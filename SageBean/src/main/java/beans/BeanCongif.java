package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanCongif {

	@Bean
	public PersonDao personDao() {
		PersonDaoMemory bean = new PersonDaoMemory();
		return bean;
	}
	
	@Bean
	public PersonService personService() {
		PersonImpl bean = new PersonImpl(personDao());            
		bean.setPersonDao(personDao());
		return bean;
	}
	
}
