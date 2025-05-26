package com.example.proyectoCajica;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoCajicaApplication {

	public static void main(String[] args) {
		// Cargar variables de entorno
		loadEnv();

		// Iniciar aplicación Spring Boot
		SpringApplication.run(ProyectoCajicaApplication.class, args);
	}

	private static void loadEnv() {
		try {
			Dotenv dotenv = Dotenv.configure()
					.directory("./") // Busca el .env en el directorio raíz del proyecto
					.ignoreIfMissing() // No falla si no encuentra el archivo
					.load();

			// Configura las propiedades del sistema desde .env
			System.setProperty("DB_URL", dotenv.get("DB_URL", ""));
			System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME", ""));
			System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD", ""));

		} catch (Exception e) {
			System.err.println("Warning: Couldn't load .env file. Using default configurations.");
		}
	}
}