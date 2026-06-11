package com.unifor.example.emprestimos;
@Entity
@Table(name = "loans")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ownerUsername;     // usuário dono do empréstimo (do token)
    private BigDecimal principalAmount;
    private BigDecimal interestRate;
    private Integer months;
    private BigDecimal monthlyPayment;
    @Enumerated(EnumType.STRING)
    private LoanStatus status;        // Enum: PENDING, APPROVED, REJECTED, PAID
    // getters e setters omitidos para brevidade
}
@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String borrowerName;

    private String borrowerDocument;

    private BigDecimal principalAmount;

    private BigDecimal annualInterestRate;

    private Integer months;

    private BigDecimal monthlyPayment;

    private BigDecimal totalPayment;

    private String status;
}