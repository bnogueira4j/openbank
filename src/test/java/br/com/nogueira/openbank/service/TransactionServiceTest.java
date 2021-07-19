package br.com.nogueira.openbank.service;

import br.com.nogueira.openbank.entity.Transaction;
import br.com.nogueira.openbank.repository.MerchantDetailsRepository;
import br.com.nogueira.openbank.repository.TransactionApiClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TransactionServiceTest {

    @Mock
    private TransactionApiClient transactionApiClient;
    @Mock
    private MerchantDetailsRepository merchantDetailsRepository;
    @InjectMocks
    private TransactionService transactionService;

    @BeforeEach
    void setup() {
        when(transactionApiClient.findAllByAccountNumber(any())).thenReturn(List.of(new Transaction()));
    }

    @Test
    public void findAllByAccountNumber_shouldReturnSizeGreaterThanZero() {
        assertEquals(1, transactionService.findAllByAccountNumber(1234567).size());
    }
}
