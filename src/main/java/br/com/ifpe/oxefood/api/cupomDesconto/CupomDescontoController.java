package br.com.ifpe.oxefood.api.cupomDesconto;

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

import br.com.ifpe.oxefood.modelo.cupomDesconto.cupomDesconto;
import br.com.ifpe.oxefood.modelo.cupomDesconto.cupomDescontoService;

@RestController
@RequestMapping("/api/cupomDesconto")
@CrossOrigin
public class CupomDescontoController {

    @GetMapping
    public List<cupomDesconto> listarTodos() {
        return cupomDescontoService.listarTodos();
    }

    @GetMapping("/{id}")
    public cupomDesconto obterPorID(@PathVariable Long id) {
        return cupomDescontoService.obterPorID(id);
    }



   @Autowired
   private cupomDescontoService cupomDescontoService;

   @PostMapping
   public ResponseEntity<cupomDesconto> save(@RequestBody cupomDescontoRequest request) {

       CupomDescontoRequest cupomDesconto = cupomDescontoService.save(request.build());
       return new ResponseEntity<cupomDesconto>(cupomDesconto, HttpStatus.CREATED);
   }
}

