/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Clinica.ApiDetalleFichaAnalisis;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositorio extends JpaRepository<DetalleFichaAnalisis, Long>{
    List<DetalleFichaAnalisis> findByIdFicAna(Long idFicAna);
}
