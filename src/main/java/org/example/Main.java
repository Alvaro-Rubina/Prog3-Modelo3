package org.example;

import org.example.model.entities.*;
import org.example.repository.InMemoryRepository;

import java.time.LocalDate;

public class Main {

    // Repositorios
    public static InMemoryRepository<Articulo> articuloRepo = new InMemoryRepository<>();
    public static InMemoryRepository<Cliente> clienteRepo = new InMemoryRepository<>();
    public static InMemoryRepository<DetallePedido> detallePedidoRepo = new InMemoryRepository<>();
    public static InMemoryRepository<Imagen> imagenRepo = new InMemoryRepository<>();
    public static InMemoryRepository<Pedido> pedidoRepo = new InMemoryRepository<>();
    public static InMemoryRepository<UnidadMedida> unidadMedidaRepo = new InMemoryRepository<>();

    public static void main(String[] args) {

        // Creación de los Clientes
        Cliente cliente1 = Cliente.builder()
                .nombre("JH")
                .apellido("De la Cruz")
                .telefono("0123456789")
                .email("jh@gmail.com")
                .fechaNacimiento(LocalDate.of(2000, 4,21)).build();

        Cliente cliente2 = Cliente.builder()
                .nombre("John")
                .apellido("Doe")
                .telefono("1231231230")
                .email("johnDoe@gmail.com")
                .fechaNacimiento(LocalDate.of(2004, 1,8)).build();

        Cliente cliente3 = Cliente.builder()
                .nombre("Miguel")
                .apellido("Merentiel")
                .telefono("1616161616")
                .email("laBestiaMerentieeeeeeeeeel@gmail.com")
                .fechaNacimiento(LocalDate.of(1996, 2,24)).build();

        clienteRepo.save(cliente1);
        clienteRepo.save(cliente2);
        clienteRepo.save(cliente3);

        // Creación de las unidades de medida

    }

}