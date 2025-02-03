
package com.example.demo.Repository;


import com.example.demo.Entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VentaRepo extends JpaRepository <Venta, Integer> {
    
}
