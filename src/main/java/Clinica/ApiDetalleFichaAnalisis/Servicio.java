/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiDetalleFichaAnalisis;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {

    @Autowired
    private Repositorio repo;

    public DetalleFichaAnalisis grabar(DetalleFichaAnalisis det) {
        return repo.save(det);
    }

    public DetalleFichaAnalisis buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<DetalleFichaAnalisis> listar() {
        return repo.findAll();
    }

    public List<DetalleFichaAnalisis> listarPorFichaAnalisis(Long idFicAna) {
        return repo.findByIdFicAna(idFicAna);
    }

    public DetalleFichaAnalisis actualizar(Long id, DetalleFichaAnalisis det) {
        return repo.findById(id).map(existing -> {
            existing.setIdFicAna(det.getIdFicAna());
            existing.setIdTipAna(det.getIdTipAna());
            existing.setNomFicAna(det.getNomFicAna());
            existing.setDesFicAna(det.getDesFicAna());
            existing.setPre(det.getPre());
            existing.setCan(det.getCan());
            existing.setImp(det.getImp());
            return repo.save(existing);
        }).orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
