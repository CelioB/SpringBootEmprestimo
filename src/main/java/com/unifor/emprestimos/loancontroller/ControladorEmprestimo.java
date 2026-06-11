package com.unifor.emprestimos.loancontroller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.unifor.emprestimos.loandto.PedidoEmprestimo;
import com.unifor.emprestimos.loanentity.Emprestimos;
import com.unifor.emprestimos.loanservice.ServicoEmprestimo;

@RestController
@RequestMapping("/api/loans")
public class ControladorEmprestimo {

    private final ServicoEmprestimo service;

    public ControladorEmprestimo(ServicoEmprestimo service) {
        this.service = service;
    }

    @PostMapping
    public Emprestimos create(
            @RequestBody PedidoEmprestimo req) {

        return service.create(req);
    }

    @GetMapping
    public List<Emprestimos> all() {
        return service.all();
    }

    @PutMapping("/{id}/approve")
    public Emprestimos approve(
            @PathVariable Long id) {

        return service.approve(id);
    }
}