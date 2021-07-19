package br.com.nogueira.openbank.repository;

import br.com.nogueira.openbank.entity.Transaction;

import java.util.List;

public interface TransactionApiClient {
    List<Transaction> findAllByAccountNumber(final Integer accountNumber);
}
