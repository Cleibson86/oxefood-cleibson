package br.com.ifpe.oxefood.api.produto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood.modelo.cliente.Cliente;
import br.com.ifpe.oxefood.modelo.cliente.ClienteService;

@RestController
@RequestMapping("/api/produto")
@CrossOrigin
public class entregadorController {

    @GetMapping
    public List<entregador> listarTodos() {
        return EntregadorService.listarTodos();
    }

    @GetMapping("/{id}")
    public Entregador obterPorID(@PathVariable Long id) {
        return EntregadorService.obterPorID(id);
    }



   @Autowired
   private EntregadorService EntregadorService;

   @PostMapping
   public ResponseEntity<Entregador> save(@RequestBody EntregadorRequest request) {

       Entregador entregador = EntregadorService.save(request.build());
       return new ResponseEntity<Entregador>(entregador, HttpStatus.CREATED);
   }
}


























































































































































































