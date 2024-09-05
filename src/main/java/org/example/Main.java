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
        UnidadMedida ochoPorciones = UnidadMedida.builder()
                .denominacion("porciones")
                .build();

        UnidadMedida cuatroPorciones = UnidadMedida.builder()
                .denominacion("porciones")
                .build();

        UnidadMedida unLitro = UnidadMedida.builder()
                .denominacion("litros")
                .build();

        unidadMedidaRepo.save(ochoPorciones);
        unidadMedidaRepo.save(cuatroPorciones);
        unidadMedidaRepo.save(unLitro);

        // Creacion de las imagenes
        Imagen imgPizzaHawaianaGrande = Imagen.builder()
                .nombre("Pizza Hawaiana grande")
                .url("https://i.pinimg.com/564x/27/24/4f/27244fdcfca45fcb75a4cdda7e1996f8.jpg")
                .build();
        Imagen imgPizzaNapolitanaGrande = Imagen.builder()
                .nombre("Pizza Napolitana grande")
                .url("https://www.lanacion.com.ar/resizer/v2/pizza-NUKNWKWWRBAGXEECJWGLKMULVQ.jpg?auth=df70fb70d27e9a242dfe70068af898769f18e832bb543cb49d3faf002314bb82&width=420&height=280&quality=70&smart=true")
                .build();
        Imagen imgPizzaMuzarellaGrande = Imagen.builder()
                .nombre("Pizza Muzzarella grande")
                .url("https://saborargento.com.ar/wp-content/uploads/2023/09/Receta-de-Pizza-Muzzarella.jpg")
                .build();
        Imagen imgPizzaHawaianaChica = Imagen.builder()
                .nombre("Pizza Hawaiana chica")
                .url("https://i.pinimg.com/564x/27/24/4f/27244fdcfca45fcb75a4cdda7e1996f8.jpg").
                build();
        Imagen imgPizzaNapolitanaChica = Imagen.builder()
                .nombre("Pizza Napolitana chica")
                .url("https://www.lanacion.com.ar/resizer/v2/pizza-NUKNWKWWRBAGXEECJWGLKMULVQ.jpg?auth=df70fb70d27e9a242dfe70068af898769f18e832bb543cb49d3faf002314bb82&width=420&height=280&quality=70&smart=true")
                .build();
        Imagen imgPizzaMuzarellaChica = Imagen.builder()
                .nombre("Pizza Muzzarella chica")
                .url("https://saborargento.com.ar/wp-content/uploads/2023/09/Receta-de-Pizza-Muzzarella.jpg")
                .build();
        Imagen imgCervezaAndes = Imagen.builder()
                .nombre("Cerveza Andes")
                .url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQGKJJppEGa6tSBZ96kkU73C8q0jtHSfilAZg&s")
                .build();
        Imagen imgCervezaQuilmes = Imagen.builder()
                .nombre("Cerveza Quilmes")
                .url("https://graffica.info/wp-content/uploads/2016/09/Joplin-Quilmes-03-1-1024x681.png")
                .build();

        imagenRepo.save(imgPizzaHawaianaGrande);
        imagenRepo.save(imgPizzaHawaianaChica);
        imagenRepo.save(imgPizzaNapolitanaGrande);
        imagenRepo.save(imgPizzaNapolitanaChica);
        imagenRepo.save(imgPizzaMuzarellaGrande);
        imagenRepo.save(imgPizzaMuzarellaChica);
        imagenRepo.save(imgCervezaAndes);
        imagenRepo.save(imgCervezaQuilmes);

    }

}