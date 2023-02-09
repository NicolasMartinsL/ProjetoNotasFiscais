package br.com.projeto.NotasFiscais;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class NotasFiscaisApplication implements CommandLineRunner{
	
	//@Autowired
	//private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(NotasFiscaisApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		
	}
}
