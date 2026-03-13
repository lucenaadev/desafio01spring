package com.adailtonlucena.desafio01;

import com.adailtonlucena.desafio01.entities.Order;
import com.adailtonlucena.desafio01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		SpringApplication.run(Desafio01Application.class, args);
	}

	@Autowired
	private OrderService orderService;

	// Injeção de dependência se não colocar @Autowired
	/*
	public Desafio01Application(OrderService orderService) {
		this.orderService = orderService;
	}
	 */

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order)));
	}
}
