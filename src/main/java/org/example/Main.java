package org.example;

import org.example.Entidades.*;
import org.example.Repositorios.InMemoryRepository;

import java.time.LocalDate;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Inicializar repositorios
        InMemoryRepository<Articulo> articuloRepository = new InMemoryRepository<>();
        InMemoryRepository<Cliente> clienteRepository = new InMemoryRepository<>();
        InMemoryRepository<DetallePedido>detallePedidoRepository = new InMemoryRepository<>();
        InMemoryRepository<Pedido> pedidoRepository = new InMemoryRepository<>();
        InMemoryRepository<Imagenes> imagenesRepository = new InMemoryRepository<>();
        InMemoryRepository<UnidadMedida> unidadMedidaRepository = new InMemoryRepository<>();
//crear objeto cliente
        Cliente cliente1 = Cliente.builder().nombre("Alvaro").apellido("Rubina").email("alvaro@gmail.com").telefono("26175689").fechaNacimiento(LocalDate.of(2004, 1,8)).build();
        Cliente cliente2 = Cliente.builder().nombre("Diego").apellido("Canales").email("diego@gmail.com").telefono("26174589").fechaNacimiento(LocalDate.of(2005, 6,14)).build();
        Cliente cliente3 = Cliente.builder().nombre("Candela").apellido("Puerta").email("candela@gmail.com").telefono("263475689").fechaNacimiento(LocalDate.of(1999, 12,6)).build();



        //Crear Unidad de medida
        UnidadMedida ochoPorciones = UnidadMedida.builder().denominacion("Ocho Porciones").build();
        UnidadMedida cuatroPorciones = UnidadMedida.builder().denominacion("Cuatro Porciones").build();
        UnidadMedida unLitro = UnidadMedida.builder().denominacion("Un Litro").build();
//guardar unidad de medida
        unidadMedidaRepository.save(ochoPorciones);
        unidadMedidaRepository.save(cuatroPorciones);
        unidadMedidaRepository.save(unLitro);
//Crear Imagenes
        Imagenes imagen1 = Imagenes.builder().nombre("Pizza grande Hawaiana").url("www.imagen1.com").build();
        Imagenes imagen2 = Imagenes.builder().nombre("Pizza grande Napolitana").url("www.imagen2.com").build();
        Imagenes imagen3 = Imagenes.builder().nombre("Pizza grande Muzza").url("www.imagen3.com").build();
        Imagenes imagen4 = Imagenes.builder().nombre("Pizza chica Hawaiana").url("www.imagen4.com").build();
        Imagenes imagen5 = Imagenes.builder().nombre("Pizza chica Napolitana").url("www.imagen5.com").build();
        Imagenes imagen6 = Imagenes.builder().nombre("Pizza chica Muzza").url("www.imagen6.com").build();
        Imagenes imagen7 = Imagenes.builder().nombre("Cerveza Andes").url("www.imagen7.com").build();
        Imagenes imagen8 = Imagenes.builder().nombre("Cerveza Quilmes").url("www.imagen8.com").build();
//guardar imagenes
        imagenesRepository.save(imagen1);
        imagenesRepository.save(imagen2);
        imagenesRepository.save(imagen3);
        imagenesRepository.save(imagen4);
        imagenesRepository.save(imagen5);
        imagenesRepository.save(imagen6);
        imagenesRepository.save(imagen7);
        imagenesRepository.save(imagen8);
        //crear articulos
        Articulo PgrandeHawaiana = Articulo.builder()
                .imagen(imagen1)
                .stockActual(40)
                .denominacion("Pizza grande hawaiana")
                .tiempoEstimadoMinutos(30)
                .precioVenta(2500.0)
                .precioCompra(2000.0)
                .unidad(ochoPorciones)
                .build();
        Articulo PgrandeNapolitana = Articulo.builder()
                .imagen(imagen2)
                .stockActual(50)
                .denominacion("Pizza grande napolitana")
                .tiempoEstimadoMinutos(35)
                .precioVenta(2800.0)
                .precioCompra(2500.0)
                .unidad(ochoPorciones)
                .build();
        Articulo PgrandeMuzza = Articulo.builder()
                .imagen(imagen3)
                .stockActual(50)
                .denominacion("Pizza grande muzza")
                .tiempoEstimadoMinutos(35)
                .precioVenta(2500.0)
                .precioCompra(2000.0)
                .unidad(ochoPorciones)
                .build();
        Articulo PchicaHawaiana = Articulo.builder()
                .imagen(imagen4)
                .stockActual(50)
                .denominacion("Pizza chica hawaiana")
                .tiempoEstimadoMinutos(25)
                .precioVenta(1500.0)
                .precioCompra(1000.0)
                .unidad(cuatroPorciones)
                .build();
        Articulo PchicaNapolitana = Articulo.builder()
                .imagen(imagen5)
                .stockActual(50)
                .denominacion("Pizza chica napolitana")
                .tiempoEstimadoMinutos(15)
                .precioVenta(1500.0)
                .precioCompra(1000.0)
                .unidad(cuatroPorciones)
                .build();
        Articulo PchicaMuzza = Articulo.builder()
                .imagen(imagen6)
                .stockActual(50)
                .denominacion("Pizza chica muzza")
                .tiempoEstimadoMinutos(23)
                .precioVenta(1600.0)
                .precioCompra(1000.0)
                .unidad(cuatroPorciones)
                .build();
        Articulo CervezaAndes = Articulo.builder()
                .imagen(imagen7)
                .stockActual(50)
                .denominacion("Cerveza Andes")
                .tiempoEstimadoMinutos(25)
                .precioVenta(1500.0)
                .precioCompra(900.0)
                .unidad(unLitro)
                .build();
        Articulo CervezaQuilmes = Articulo.builder()
                .imagen(imagen8)
                .stockActual(50)
                .denominacion("Cerveza Quilmes")
                .tiempoEstimadoMinutos(25)
                .precioVenta(1500.0)
                .precioCompra(1000.0)
                .unidad(unLitro)
                .build();
        //guardar Articulos
        articuloRepository.save(PgrandeHawaiana);
        articuloRepository.save(PchicaHawaiana);
        articuloRepository.save(PchicaMuzza);
        articuloRepository.save(CervezaAndes);
        articuloRepository.save(CervezaQuilmes);
        articuloRepository.save(PgrandeNapolitana);
        articuloRepository.save(PchicaNapolitana);
        articuloRepository.save(PgrandeMuzza);
        // - El cliente1, realiza un pedido de una Pizza grande y una cerveza Quilmes.
        DetallePedido detallePedido1 = DetallePedido.builder().cantidad(1).articulo(PgrandeMuzza).build();
        DetallePedido detallePedido2 = DetallePedido.builder().cantidad(1).articulo(CervezaQuilmes).build();

        Pedido pedido1 = Pedido.builder().detalles(Set.of(detallePedido1,detallePedido2)).tipoEnvio(TipoEnvio.RETIRO_TIENDA).formaPago(FormaPago.TRANSFERENCIA).build();
        pedidoRepository.save(pedido1);

        cliente1.getHace().add(pedido1);
        clienteRepository.genericUpdate(1L, cliente1);



        // - El cliente2 realiza la compra de la 3 cervezas Quilmes y una Pizza Hawaiana chica.
        DetallePedido detallePedido3 = DetallePedido.builder().cantidad(1).articulo(PchicaHawaiana).build();
        DetallePedido detallePedido4 = DetallePedido.builder().cantidad(3).articulo(CervezaQuilmes).build();

        Pedido pedido2 = Pedido.builder().detalles(Set.of(detallePedido3,detallePedido4)).tipoEnvio(TipoEnvio.RETIRO_TIENDA).formaPago(FormaPago.TRANSFERENCIA).build();
        pedidoRepository.save(pedido2);

        cliente2.getHace().add(pedido2);
        clienteRepository.genericUpdate(2L, cliente2);


        // -El cliente3 compra 1 Pizza grande Hawaiana , 1 pizza chica Muzza , 1 grande Napolitana
        // y 2 cervezas Andes.
        DetallePedido detallePedido5 = DetallePedido.builder().cantidad(1).articulo(PgrandeHawaiana).build();
        DetallePedido detallePedido6 = DetallePedido.builder().cantidad(1).articulo(PchicaMuzza).build();
        DetallePedido detallePedido7 = DetallePedido.builder().cantidad(1).articulo(PgrandeNapolitana).build();
        DetallePedido detallePedido8 = DetallePedido.builder().cantidad(3).articulo(CervezaAndes).build();

        Pedido pedido3 = Pedido.builder().detalles(Set.of(detallePedido5,detallePedido6,detallePedido7,detallePedido8)).tipoEnvio(TipoEnvio.RETIRO_TIENDA).formaPago(FormaPago.TRANSFERENCIA).build();
        pedidoRepository.save(pedido3);

        cliente3.getHace().add(pedido3);
        clienteRepository.genericUpdate(3L, cliente3);


        // - El cliente 1 en otro día realiza un pedido de 1 muzza chica y una cerveza Andes.
        DetallePedido detallePedido9 = DetallePedido.builder().cantidad(1).articulo(PchicaMuzza).build();
        DetallePedido detallePedido10 = DetallePedido.builder().cantidad(1).articulo(CervezaAndes).build();


        Pedido pedido4 = Pedido.builder().detalles(Set.of(detallePedido9,detallePedido10)).tipoEnvio(TipoEnvio.RETIRO_TIENDA).formaPago(FormaPago.EFECTIVO).build();
        pedidoRepository.save(pedido3);

        cliente1.getHace().add(pedido4);
        clienteRepository.genericUpdate(1L, cliente1);



    /*    // - Mostar por consola la cantidad de veces que el cliente 1 compró en el local.
        System.out.println("\n[Cantidad de veces que " +
                clienteRepository.findById(1L).get().getNombre() + " " + clienteRepository.findById(1L).get().getApellido() +
                " compró en el local: " + clienteRepository.findById(1L).get().getHace().size() + "]");

        // - Mostrar todos los artículos que comercializa el negocio
        System.out.println("\n- - - - - -  - - - \nArticulos que comercializa el negocio:");
        for (Articulo ar: articuloRepository.findAll()){
            System.out.println("    - " + ar.getDenominacion());
        }*/
    }

}