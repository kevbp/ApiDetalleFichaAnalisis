/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiDetalleFichaAnalisis;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detalleFichaAnalisis")
public class Control {

    @Autowired
    private Servicio serv;

    @PostMapping("/grabar")
    public DetalleFichaAnalisis grabar(@RequestBody DetalleFichaAnalisis det) {
        return serv.grabar(det);
    }

    @GetMapping("/buscar/{id}")
    public DetalleFichaAnalisis buscar(@PathVariable Long id) {
        return serv.buscar(id);
    }

    @GetMapping("/listarPorFichaAnalisis/{idFicAna}")
    public List<DetalleFichaAnalisis> listarPorFichaAnalisis(@PathVariable Long idFicAna) {
        return serv.listarPorFichaAnalisis(idFicAna);
    }

    @GetMapping("/listar")
    public List<DetalleFichaAnalisis> listar() {
        return serv.listar();
    }

    @PutMapping("/actualizar/{id}")
    public DetalleFichaAnalisis actualizar(@PathVariable Long id, @RequestBody DetalleFichaAnalisis det) {
        return serv.actualizar(id, det);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        serv.eliminar(id);
    }
}
