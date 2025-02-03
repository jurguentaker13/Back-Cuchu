/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controller;


import com.example.demo.Entity.Usuario;
import com.example.demo.SERVICE.UsuarioSer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
    @Autowired
    UsuarioSer susuario;
    
    @GetMapping("/tabla")
    public List<Usuario> Prueba (){
            return susuario.obtenerTodosUsuarios();
    }
    @PostMapping("/GuardarU")
    public List <Usuario> guardar(int id, String  nombreUsuario, String Contrasena, String roles ){
        Usuario e = new Usuario();
        e.setId(id);
        e.setNombreUsuario(nombreUsuario);
        e.setContrasena(Contrasena);
        e.setRoles(roles);
        if(susuario.guardar(e)){
             return susuario.obtenerTodosUsuarios();
        }
       return null;
    }
    @PutMapping ("/ActualizarU")
    public List <Usuario> actualizar(int id, String  nombreUsuario, String Contrasena, String roles ){
        Usuario e = new Usuario();
        e.setId(id);
        e.setNombreUsuario(nombreUsuario);
        e.setContrasena(Contrasena);
        e.setRoles(roles);
        if(susuario.guardar(e)){
             return susuario.obtenerTodosUsuarios();
        }
       return null;
    }
    @DeleteMapping("/EliminarU")
    public List <Usuario> eliminar(int id){
        Usuario e = new Usuario();
        e.setId(id);
        if(susuario.guardar(e)){
             return susuario.obtenerTodosUsuarios();
        }
       return null;
    }
}
