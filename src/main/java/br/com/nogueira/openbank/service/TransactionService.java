package br.com.nogueira.openbank.service;

import br.com.nogueira.openbank.entity.Transaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
        return List.of(new Transaction(
                "credit",
                java.time.LocalDate.now(),
                1234567,
                "USD",
                BigDecimal.valueOf(100.00),
                "acme",
                "acme.png"));
    }
}
