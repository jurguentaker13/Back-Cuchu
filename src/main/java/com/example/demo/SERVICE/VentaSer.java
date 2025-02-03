
package com.example.demo.SERVICE;


import com.example.demo.Entity.Venta;
import com.example.demo.Repository.VentaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaSer {
    @Autowired
    VentaRepo rVenta;
    
     public List <Venta> obtenerTodasVentas(){
        return rVenta.findAll();
    }
     
     public boolean guardar(Venta e){
        boolean respuesta = false;
        try{
            rVenta.save(e);
            respuesta = true;
        }catch(Exception error){
            System.out.println("Error al guardar" + error);
            respuesta = false;
        }
        return respuesta;
    }
     
     public boolean actualizar(Venta e){
        boolean respuesta = false;
        try{
            rVenta.save(e);
            respuesta = true;
        }catch(Exception error){
            System.out.println("Error al actualizar" + error);
            respuesta = false;
        }
        return respuesta;
    }
    
      public boolean eliminar(Venta e){
        boolean respuesta = false;
        try{
            rVenta.delete(e);
            respuesta = true;
        }catch(Exception error){
            System.out.println("Error al eliminar" + error);
            respuesta = false;
        }
        return respuesta;
    }
    
}
