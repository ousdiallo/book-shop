package com.osman.springbootbookseller;

import com.osman.springbootbookseller.model.Book;
import com.osman.springbootbookseller.repository.IBookRepository;
import com.osman.springbootbookseller.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class SpringBootBookSellerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookSellerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(BookService bookService){
		return args -> {
			bookService.saveBook(new Book(null, "Machine Learning", "Machine Learning for productive engineers", "Ousmane Diallo", 10000.0, LocalDateTime.now()));
			bookService.saveBook(new Book(null, "Java Spring", "Develop powerful applications", "Ousmane Diallo", 12000.0, LocalDateTime.now()));
			bookService.saveBook(new Book(null, "DevOps", "DeveOps for productive engineers", "Ousmane Diallo", 18000.0, LocalDateTime.now()));


			bookService.findAllBooks().forEach(book -> System.out.println(book));
		};
	}

}
