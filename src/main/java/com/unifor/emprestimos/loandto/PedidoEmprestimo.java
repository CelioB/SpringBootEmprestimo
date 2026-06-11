package com.unifor.emprestimos.loandto;

public record PedidoEmprestimo(
        Double principal,
        Double interestRate,
        Integer months
) {
}