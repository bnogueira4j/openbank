package br.com.nogueira.openbank.service;

import br.com.nogueira.openbank.entity.Transaction;
import br.com.nogueira.openbank.repository.MerchantDetailsRepository;
import br.com.nogueira.openbank.repository.TransactionApiClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TransactionService {

    private final TransactionApiClient transactionApiClient;
    private final MerchantDetailsRepository merchantDetailsRepository;

    @Autowired
    public TransactionService(final TransactionApiClient transactionApiClient, final MerchantDetailsRepository merchantDetailsRepository) {
        this.transactionApiClient = transactionApiClient;
        this.merchantDetailsRepository = merchantDetailsRepository;
    }

    @CircuitBreaker(name = "transactionService", fallbackMethod = "foundNone")
    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
        var transactions = transactionApiClient.findAllByAccountNumber(accountNumber);
        transactions.forEach(transaction -> {
            merchantDetailsRepository
                    .findMerchantLogo(transaction.getMerchantName())
                    .ifPresent(
                            transaction::setMerchantLogo
                    );
        });
        return transactions;
    }

    private List<Transaction> foundNone(final Integer accountNumber, final Throwable throwable) {
        System.out.println("FALLLLLLBACKKKKKKKKKKKKKKKKKKKKKKK");
        return Collections.emptyList();
    }
}
