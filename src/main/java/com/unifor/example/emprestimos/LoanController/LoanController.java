package com.unifor.example.emprestimos.LoanController;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.bank.loan.dto.LoanRequest;
import com.bank.loan.entity.Loan;
import com.bank.loan.service.LoanService;
@RestController
@RequestMapping("/api/loans")
public class LoanController{
 private final LoanService service;
 public LoanController(LoanService service){this.service=service;}
 @PostMapping
 public Loan create(@RequestBody LoanRequest req){ return service.create(req); }
 @GetMapping
 public List<Loan> all(){ return service.all(); }
 @PutMapping("/{id}/approve")
 public Loan approve(@PathVariable Long id){ return service.approve(id); }
}