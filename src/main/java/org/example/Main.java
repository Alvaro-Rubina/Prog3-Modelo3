package org.example;

import org.example.model.entities.*;
import org.example.model.enums.MetodoPago;
import org.example.model.enums.TipoEnvio;
import org.example.repository.InMemoryRepository;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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
                .fechaNacimiento(LocalDate.of(2000, 4,21))
                .pedidos(new HashSet<>())
                .build();

        Cliente cliente2 = Cliente.builder()
                .nombre("John")
                .apellido("Doe")
                .telefono("1231231230")
                .email("johnDoe@gmail.com")
                .fechaNacimiento(LocalDate.of(2004, 1,8))
                .pedidos(new HashSet<>())
                .build();

        Cliente cliente3 = Cliente.builder()
                .nombre("Miguel")
                .apellido("Merentiel")
                .telefono("1616161616")
                .email("laBestiaMerentieeeeeeeeeel@gmail.com")
                .fechaNacimiento(LocalDate.of(1996, 2,24))
                .pedidos(new HashSet<>()).build();

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

        // Creacion de los articulos
        Articulo pizzaHawaianaGrande = Articulo.builder()
                .denominacion("Pizza Hawaiana grande")
                .precioVenta(9000)
                .precioCompra(5000)
                .stockActual(45)
                .stockMaximo(60)
                .tiempoEstimadoEnMinutos(30)
                .unidadMedida(ochoPorciones)
                .imagen(imgPizzaHawaianaGrande)
                .build();
        articuloRepo.save(pizzaHawaianaGrande);

        Articulo pizzaHawaianaChica = Articulo.builder()
                .denominacion("Pizza Hawaiana chica")
                .precioVenta(5000)
                .precioCompra(3000)
                .stockActual(30)
                .stockMaximo(40)
                .tiempoEstimadoEnMinutos(20)
                .unidadMedida(cuatroPorciones)
                .imagen(imgPizzaHawaianaChica)
                .build();
        articuloRepo.save(pizzaHawaianaChica);

        Articulo pizzaNapolitanaGrande = Articulo.builder()
                .denominacion("Pizza Napolitana grande")
                .precioVenta(8000)
                .precioCompra(4500)
                .stockActual(50)
                .stockMaximo(70)
                .tiempoEstimadoEnMinutos(25)
                .unidadMedida(ochoPorciones)
                .imagen(imgPizzaNapolitanaGrande)
                .build();
        articuloRepo.save(pizzaNapolitanaGrande);

        Articulo pizzaNapolitanaChica = Articulo.builder()
                .denominacion("Pizza Napolitana chica")
                .precioVenta(4500)
                .precioCompra(2500)
                .stockActual(35)
                .stockMaximo(45)
                .tiempoEstimadoEnMinutos(15)
                .unidadMedida(cuatroPorciones)
                .imagen(imgPizzaNapolitanaChica)
                .build();
        articuloRepo.save(pizzaNapolitanaChica);

        Articulo pizzaMuzarellaGrande = Articulo.builder()
                .denominacion("Pizza Muzzarella grande")
                .precioVenta(7000)
                .precioCompra(4000)
                .stockActual(40)
                .stockMaximo(55)
                .tiempoEstimadoEnMinutos(25)
                .unidadMedida(ochoPorciones)
                .imagen(imgPizzaMuzarellaGrande)
                .build();
        articuloRepo.save(pizzaMuzarellaGrande);

        Articulo pizzaMuzarellaChica = Articulo.builder()
                .denominacion("Pizza Muzzarella chica")
                .precioVenta(4000)
                .precioCompra(2000)
                .stockActual(25)
                .stockMaximo(35)
                .tiempoEstimadoEnMinutos(15)
                .unidadMedida(cuatroPorciones)
                .imagen(imgPizzaMuzarellaChica)
                .build();
        articuloRepo.save(pizzaMuzarellaChica);

        Articulo cervezaAndes = Articulo.builder()
                .denominacion("Cerveza Andes")
                .precioVenta(2000)
                .precioCompra(1000)
                .stockActual(100)
                .stockMaximo(150)
                .tiempoEstimadoEnMinutos(0)
                .unidadMedida(unLitro)
                .imagen(imgCervezaAndes)
                .build();
        articuloRepo.save(cervezaAndes);

        Articulo cervezaQuilmes = Articulo.builder()
                .denominacion("Cerveza Quilmes")
                .precioVenta(1500)
                .precioCompra(800)
                .stockActual(80)
                .stockMaximo(120)
                .tiempoEstimadoEnMinutos(0)
                .unidadMedida(unLitro)
                .imagen(imgCervezaQuilmes)
                .build();
        articuloRepo.save(cervezaQuilmes);

        // - El cliente1, realiza un pedido de una Pizza grande y una cerveza Quilmes.
        DetallePedido detallePedido1 = new DetallePedido(pizzaMuzarellaGrande, 1);
        DetallePedido detallePedido2 = new DetallePedido(cervezaQuilmes, 1);

        Pedido pedido1 = new Pedido(new HashSet<>(Set.of(detallePedido1, detallePedido2)), TipoEnvio.NORMAL, MetodoPago.TRANSFERENCIA);
        pedidoRepo.save(pedido1);

        cliente1.getPedidos().add(pedido1);
        clienteRepo.genericUpdate(1L, cliente1);

        // - Mostrar por consola los datos del pedido del cliente, las líneas del detalle de pedido
        // y el total a pagar.
        mostrarPedido(1L, 1L);

        // - El cliente2 realiza la compra de la 3 cervezas Quilmes y una Pizza Hawaiana chica.
        DetallePedido detallePedido3 = new DetallePedido(cervezaQuilmes, 3);
        DetallePedido detallePedido4 = new DetallePedido(pizzaHawaianaChica, 1);

        Pedido pedido2 = new Pedido(new HashSet<>(Set.of(detallePedido3, detallePedido4)), TipoEnvio.EXPRESS, MetodoPago.EFECTIVO);
        pedidoRepo.save(pedido2);

        cliente2.getPedidos().add(pedido2);
        clienteRepo.genericUpdate(2L, cliente2);

        // - Mostrar por consola el pedido y detalle para que el cliente2 sepa cuánto deberá pagar
        mostrarPedido(2L, 2L);

        // -El cliente3 compra 1 Pizza grande Hawaiana , 1 pizza chica Muzza , 1 grande Napolitana
        // y 2 cervezas Andes.
        DetallePedido detallePedido5 = new DetallePedido(pizzaHawaianaGrande, 1);
        DetallePedido detallePedido6 = new DetallePedido(pizzaMuzarellaChica, 1);
        DetallePedido detallePedido7 = new DetallePedido(pizzaNapolitanaGrande, 1);
        DetallePedido detallePedido8 = new DetallePedido(cervezaAndes, 2);

        Pedido pedido3 = new Pedido(new HashSet<>(Set.of(detallePedido5, detallePedido6, detallePedido7, detallePedido8)),
                TipoEnvio.EXPRESS, MetodoPago.DEBITO);
        pedidoRepo.save(pedido3);

        cliente3.getPedidos().add(pedido3);
        clienteRepo.genericUpdate(3L, cliente3);

        // - Mostrar por consola el pedido del cliente 3 y su total par apagar.
        mostrarPedido(3L, 3L);

        // - El cliente 1 en otro día realiza un pedido de 1 muzza chica y una cerveza Andes.
        DetallePedido detallePedido9 = new DetallePedido(cervezaAndes, 1);

        Pedido pedido4 = new Pedido(new HashSet<>(Set.of(detallePedido6, detallePedido9)), TipoEnvio.EXPRESS,
                MetodoPago.EFECTIVO);
        pedidoRepo.save(pedido4);

        cliente1.getPedidos().add(pedido4);
        clienteRepo.genericUpdate(1L, cliente1);

        // - Mostrar por consola el pedido realizado por el cliente1 y el total de la compra
        mostrarPedido(1L, 4L);

        // - Mostar por consola la cantidad de veces que el cliente 1 compró en el local.
        System.out.println("\n[Cantidad de veces que " +
                clienteRepo.findById(1L).get().getNombre() + " " + clienteRepo.findById(1L).get().getApellido() +
                " compró en el local: " + clienteRepo.findById(1L).get().getPedidos().size() + "]");

        // - Mostrar todos los artículos que comercializa el negocio
        System.out.println("\n- - - - - -  - - - \nArticulos que comercializa el negocio:");
        for (Articulo ar: articuloRepo.findAll()){
            System.out.println("    - " + ar.getDenominacion());
        }

    }

    public static void mostrarPedido(Long idCliente, Long idPedido){
        System.out.println("\n- - - PEDIDO DEL CLIENTE: " +
                clienteRepo.findById(idCliente).get().getNombre() + " " +
                clienteRepo.findById(idCliente).get().getApellido() + " - - -");
        System.out.println("* Fecha del pedido: " + pedidoRepo.findById(idPedido).get().getFechaPedido());
        System.out.println("* Hora estimada de finalizacion del pedido: " +
                pedidoRepo.findById(idPedido).get().getHoraEstimadaFinalizacion());
        System.out.println("* Estado del pedido: " + pedidoRepo.findById(idPedido).get().getEstado());
        System.out.println("* Tipo de envío: " + pedidoRepo.findById(idPedido).get().getTipoEnvio());
        System.out.println("* Forma de pago: " + pedidoRepo.findById(idPedido).get().getFormaPago());

        System.out.println("- - - - - - - - - - - - - - - - \n* Articulos:");
        for (DetallePedido detallePedido: pedidoRepo.findById(idPedido).get().getDetalles()){
            System.out.println("    - " + detallePedido.getArticulo().getDenominacion() + " (" +
                    detallePedido.getCantidad() + "), $" + detallePedido.getSubTotal());
        }
        System.out.println("- - - - - - - \n* TOTAL: " + pedidoRepo.findById(idPedido).get().getTotal());
    }

}