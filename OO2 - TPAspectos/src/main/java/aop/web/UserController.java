package aop.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import aop.db.RegistrarUser;

@RestController
public class UserController {

	private RegistrarUser registrar;

	private static String[] names = { "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Henry", "Isabella",
			"Jack", "Javier", "Samuel", "Mateo", "Juan", "Jimmy", "Luis", "Osvaldo", "Alexis", "Reynaldo", "Gregorio" };

//	private Users users;
//
//	public UserController(Users users) {
//		this.users = users;
//	}
//
//	@GetMapping("/users")
//	public List<User> allUsers() {
//		return this.users.users();
//	}
//
//	@GetMapping("/users/{id}")
//	public User usersById(@PathVariable int id) {
//		return this.users.userById(id);
//	}
//
//	@GetMapping("/users/search/{username}")
//	public User usersByName(@PathVariable String username) {
//		return this.users.usersByName(username);
//	}

	public UserController(RegistrarUser formaDeRegistro) {
		this.registrar = formaDeRegistro;
	}

	@GetMapping("/users/insertar/diez")
	public void insertarCincoUsuarios() {
		insertarUsuarios(10);
	}

	@GetMapping("/users/insertar/cien")
	public void insertarCienUsuarios() {
		insertarUsuarios(100);
	}

	private void insertarUsuarios(int cantidadUsuarios) {
		registrar.registrar(generarListaPersonas(cantidadUsuarios));
	}

	private List<String> generarListaPersonas(int cantidad) {
		int iterador = 0;
		List<String> personList = new ArrayList<>();

		while (iterador < cantidad) {
			Random random = new Random();
			String name = UserController.names[random.nextInt(names.length)];
			personList.add(name);
			iterador++;
		}

		return personList;

	}

}