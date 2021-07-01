package br.com.nogueira.openbank.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionServiceTest {

    private final TransactionService transactionService = new TransactionService();

    @Test
    public void findAllByAccountNumber_shouldReturnSizeGreaterThanZero() {
        assertEquals(1, transactionService.findAllByAccountNumber(1234567).size());
    }
}
