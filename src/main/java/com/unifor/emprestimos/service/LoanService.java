package com.unifor.emprestimos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.unifor.emprestimos.loandto.PedidoEmprestimo;
import com.unifor.emprestimos.loanentity.Emprestimos;
import com.unifor.emprestimos.loanrepository.RepositorioEmprestimo;

@Service
public class LoanService {

    private final RepositorioEmprestimo repo;

    public LoanService(RepositorioEmprestimo repo) {
        this.repo = repo;
    }

    public Emprestimos create(PedidoEmprestimo req) {

        Emprestimos emprestimo = new Emprestimos();

        emprestimo.setPrincipal(req.principal());
        emprestimo.setInterestRate(req.interestRate());
        emprestimo.setMonths(req.months());

        return repo.save(emprestimo);
    }

    public List<Emprestimos> all() {
        return repo.findAll();
    }

    public Emprestimos approve(Long id) {

        Emprestimos emprestimo =
                repo.findById(id).orElseThrow();

        emprestimo.setStatus("APPROVED");

        return repo.save(emprestimo);
    }
}