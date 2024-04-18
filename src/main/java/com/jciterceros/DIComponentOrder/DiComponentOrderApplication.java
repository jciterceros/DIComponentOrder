package com.jciterceros.DIComponentOrder;

import com.jciterceros.DIComponentOrder.entitites.Order;
import com.jciterceros.DIComponentOrder.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DiComponentOrderApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(DiComponentOrderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTRADA(dados do pedido: código, valor básico, porcentagem de desconto)");
        System.out.println();
        Integer code = sc.nextInt();
        Double basic = sc.nextDouble();
        Double discount = sc.nextDouble();

        Order order = new Order(code, basic, discount);

        System.out.println();
        System.out.println(
                "Pedido Código " + order.getCode() + "\n" +
                        "Valor total: R$ " + String.format("%.2f ", orderService.total(order))
        );
    }
}
