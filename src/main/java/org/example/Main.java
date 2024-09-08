package org.example;

import org.example.Entidades.*;
import org.example.repository.InMemoryRepository;

import java.awt.*;
import java.time.LocalDate;
import java.util.Enumeration;
import java.util.Set;

public class Main {

    static InMemoryRepository<Articulo> repoArticulo = new InMemoryRepository<>();
    static InMemoryRepository<Cliente> repoCliente = new InMemoryRepository<>();
    static InMemoryRepository<Pedido> repoPedido = new InMemoryRepository<>();
    static InMemoryRepository<Imagen> repoImagen = new InMemoryRepository<>();
    static InMemoryRepository<UnidadMedida> repoUnidadMedida = new InMemoryRepository<>();

    public static void main(String[] args) {

        // Clientes

        Cliente cliente1 = Cliente.builder()
                .nombre("Alvaro")
                .apellido("Rubina")
                .telefono("2614359473")
                .email("AlvaroRubina@gmail.com")
                .fechaNacimiento(LocalDate.of(1995,5,23))
                .build();

        Cliente cliente2 = Cliente.builder()
                .nombre("Candela")
                .apellido("Puerta")
                .telefono("2613469435")
                .email("CandelaPuerta@gmail.com")
                .fechaNacimiento(LocalDate.of(2003,06,13))
                .build();

        Cliente cliente3 = Cliente.builder()
                .nombre("Diego")
                .apellido("Canales")
                .telefono("2614988438")
                .email("DiegoCanales@gmail.com")
                .fechaNacimiento(LocalDate.of(2000,4,4))
                .build();

        repoCliente.save(cliente1);
        repoCliente.save(cliente2);
        repoCliente.save(cliente3);

        // Unidades de Medida

        UnidadMedida ochoPorciones = UnidadMedida.builder().denominacion("Ocho Porciones").build();

        UnidadMedida cuatroPorciones = UnidadMedida.builder().denominacion("Cuatro Porciones").build();

        UnidadMedida unLitro = UnidadMedida.builder().denominacion("Un litro").build();

        repoUnidadMedida.save(ochoPorciones);
        repoUnidadMedida.save(cuatroPorciones);
        repoUnidadMedida.save(unLitro);

        // Imagenes
        Imagen imagen1 = Imagen.builder().denominacion("Pizza Grande Hawaiana").build();
        Imagen imagen2 = Imagen.builder().denominacion("Pizza Grande Napolitana").build();
        Imagen imagen3 = Imagen.builder().denominacion("Pizza Grande Muzzarella").build();
        Imagen imagen4 = Imagen.builder().denominacion("Pizza Chica Hawaiana").build();
        Imagen imagen5 = Imagen.builder().denominacion("Pizza Chica Napolitana").build();
        Imagen imagen6 = Imagen.builder().denominacion("Pizza Chica Muzzarella").build();
        Imagen imagen7 = Imagen.builder().denominacion("Cerveza Andes").build();
        Imagen imagen8 = Imagen.builder().denominacion("Cerveza Quilmes").build();

        repoImagen.save(imagen1);
        repoImagen.save(imagen2);
        repoImagen.save(imagen3);
        repoImagen.save(imagen4);
        repoImagen.save(imagen5);
        repoImagen.save(imagen6);
        repoImagen.save(imagen7);
        repoImagen.save(imagen8);

        //  Articulos

        Articulo pizzaGHawaiana = Articulo.builder()
                .imagen(imagen1)
                .denominacion("Pizza Grande Hawaiana")
                .precioVenta(8000.0)
                .precioCompra(5000.0)
                .stockActual(90)
                .stockMaximo(100)
                .tiempoEstimadoMinutos(20)
                .unidadMedida(ochoPorciones)
                .build();

        repoArticulo.save(pizzaGHawaiana);

        Articulo pizzaCHawaiana = Articulo.builder()
                .imagen(imagen4)
                .denominacion("Pizza Chica Hawaiana")
                .precioVenta(4000.0)
                .precioCompra(2500.0)
                .stockActual(40)
                .stockMaximo(50)
                .tiempoEstimadoMinutos(10)
                .unidadMedida(cuatroPorciones)
                .build();

        repoArticulo.save(pizzaCHawaiana);

        Articulo pizzaGNapolitana = Articulo.builder()
                .imagen(imagen2)
                .denominacion("Pizza Grande Napolitana")
                .precioVenta(8000.0)
                .precioCompra(4500.0)
                .stockActual(70)
                .stockMaximo(90)
                .tiempoEstimadoMinutos(20)
                .unidadMedida(ochoPorciones)
                .build();

        repoArticulo.save(pizzaGNapolitana);

        Articulo pizzaCNapolitana = Articulo.builder()
                .imagen(imagen5)
                .denominacion("Pizza Chica Napolitana")
                .precioVenta(4000.0)
                .precioCompra(1900.0)
                .stockActual(40)
                .stockMaximo(70)
                .tiempoEstimadoMinutos(10)
                .unidadMedida(cuatroPorciones)
                .build();

        repoArticulo.save(pizzaCNapolitana);

        Articulo pizzaGMuzarella = Articulo.builder()
                .imagen(imagen3)
                .denominacion("Pizza Grande Muzarella")
                .precioVenta(7500.0)
                .precioCompra(3500.0)
                .stockActual(30)
                .stockMaximo(50)
                .tiempoEstimadoMinutos(20)
                .unidadMedida(ochoPorciones)
                .build();

        repoArticulo.save(pizzaGMuzarella);

        Articulo pizzaCMuzarella = Articulo.builder()
                .imagen(imagen6)
                .denominacion("Pizza Chica Muzarella")
                .precioVenta(5000.0)
                .precioCompra(2400.0)
                .stockActual(16)
                .stockMaximo(70)
                .tiempoEstimadoMinutos(10)
                .unidadMedida(cuatroPorciones)
                .build();

        repoArticulo.save(pizzaCMuzarella);

        Articulo CervezaAndes = Articulo.builder()
                .imagen(imagen7)
                .denominacion("Cerveza Andes")
                .precioVenta(4000.0)
                .precioCompra(2100.0)
                .stockActual(70)
                .stockMaximo(100)
                .tiempoEstimadoMinutos(0)
                .unidadMedida(unLitro)
                .build();

        repoArticulo.save(CervezaAndes);

        Articulo CervezaQuilmes = Articulo.builder()
                .imagen(imagen8)
                .denominacion("Cerveza Quilmes")
                .precioVenta(4000.0)
                .precioCompra(2100.0)
                .stockActual(70)
                .stockMaximo(100)
                .tiempoEstimadoMinutos(0)
                .unidadMedida(unLitro)
                .build();

        repoArticulo.save(CervezaQuilmes);

        // 5-

        //Cliente1 Pizza Grande y Quilmes

        DetallePedido detallePedido1 = DetallePedido.builder().cantidad(1).articulo(pizzaGMuzarella).build();
        DetallePedido detallePedido2 = DetallePedido.builder().cantidad(1).articulo(CervezaQuilmes).build();

        Pedido pedido1 = Pedido.builder()
                .detalles(Set.of(detallePedido1, detallePedido2))
                .tipoEnvio(TipoEnvio.A_DOMICILIO)
                .formaPago(FormaPago.TRANSFERENCIA)
                .totalCosto(detallePedido1.getSubTotal()+detallePedido2.getSubTotal())
                .build();

        repoPedido.save(pedido1);

        cliente1.getHace().add(pedido1);
        repoCliente.genericUpdate(1L, cliente1);


        // Ticket
        System.out.println("* Pedido 1");
        System.out.println("Cliente: " + cliente1.getNombre() + " " + cliente1.getApellido());
        System.out.println("Forma de Pago " + pedido1.getFormaPago() + " " + "Tipo Envio: " + pedido1.getTipoEnvio());
        System.out.println("Total: " + pedido1.getTotalCosto());











    }
}