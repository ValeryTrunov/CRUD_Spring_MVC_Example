package net.codejava.customer.test;

import net.codejava.config.JpaConfig;
import net.codejava.config.WebMvcConfig;
import net.codejava.customer.Customer;
import net.codejava.customer.CustomerRepository;
import net.codejava.customer.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

import java.util.List;
import java.util.Optional;

public class Test {

    public static void main(String[] args) {

/*        System.out.println("Hello word");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JpaConfig.class);

        LocalEntityManagerFactoryBean test = context.getBean(LocalEntityManagerFactoryBean.class);
        System.out.println(test);*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebMvcConfig.class, CustomerService.class, JpaConfig.class);
        CustomerService customerService = context.getBean(CustomerService.class);
        List<Customer> customerList = customerService.listAll();


        for (Customer customer:customerList){
            System.out.println( customer.getId()+" "+ customer.getName());
        }


    }



}
