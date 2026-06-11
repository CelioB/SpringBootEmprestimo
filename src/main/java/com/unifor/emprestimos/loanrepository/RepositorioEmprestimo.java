package com.unifor.emprestimos.loanrepository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.unifor.emprestimos.loanentity.Emprestimos;

public interface RepositorioEmprestimo extends JpaRepository<Emprestimos, Long> {
}