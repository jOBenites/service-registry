package com.bank.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Aplicacion del servidor Eureka (service registry).
 * Expone el dashboard de registro y descubrimiento de microservicios.
 * Todos los microservicios del sistema se registran aqui para que
 * el api-gateway y otros servicios puedan resolverlos por nombre.
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

    /**
     * Punto de entrada de la aplicacion.
     *
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryApplication.class, args);
    }
}
