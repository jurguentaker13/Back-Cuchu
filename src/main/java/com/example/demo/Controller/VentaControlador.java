package com.example.demo.Controller;


import com.example.demo.Entity.Venta;
import com.example.demo.SERVICE.VentaSer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ventas")
public class VentaControlador {

    @Autowired
    VentaSer sVenta;

    @GetMapping("/obtenerV")
    public List<Venta> Prueba() {
        return sVenta.obtenerTodasVentas();
    }

    @PostMapping("/guardarV")
    public List<Venta> guardar(int id, String productooservicio, int cantidad, int precio){
        Venta e = new Venta();
        e.setId(id);
        e.setProductooservicio(productooservicio);
        e.setCantidad(cantidad);
        e.setPrecio(precio);
        if (sVenta.guardar(e)) {
            return sVenta.obtenerTodasVentas();
        }
        return null;
    }
    
    @PutMapping ("/ActualizarV")
    public List<Venta> actualizar(int id, String productooservicio, int cantidad, int precio){
        Venta e = new Venta();
        e.setId(id);
        e.setProductooservicio(productooservicio);
        e.setCantidad(cantidad);
        e.setPrecio(precio);
        if (sVenta.guardar(e)) {
            return sVenta.obtenerTodasVentas();
        }
        return null;
    }
    
    @DeleteMapping("/eliminarV")
    public List <Venta> eliminar(int id){
        Venta e = new Venta();
        e.setId(id);
        if(sVenta.guardar(e)){
             return sVenta.obtenerTodasVentas(); 
        }
       return null;
    }
}
