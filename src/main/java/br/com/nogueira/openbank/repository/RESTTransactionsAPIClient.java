package br.com.nogueira.openbank.repository;

import br.com.nogueira.openbank.entity.Transaction;
import br.com.nogueira.openbank.integration.OBTransactionAdapter;
import com.acme.banking.model.OBReadTransaction6;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Repository
public class RESTTransactionsAPIClient implements TransactionApiClient {

    private final WebClient webClient;
    private final OBTransactionAdapter obTransactionAdapter = new OBTransactionAdapter();

    @Autowired
    public RESTTransactionsAPIClient(final WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public List<Transaction> findAllByAccountNumber(Integer accountNumber) {
        OBReadTransaction6 result = null;

        try {
            result =
                    webClient
                            .get()
                            .uri("accounts/" + accountNumber + "/transactions")
                            .retrieve()
                            .bodyToMono(OBReadTransaction6.class)
                            .block();

        } catch (Exception e) {
            log.error("failed to retrieve account information due to the following reason {}", e.getMessage());
        }

        if (result == null || result.getData() == null) {
            return Collections.emptyList();
        }

        return result
                .getData()
                .getTransaction()
                .stream()
                .map(obTransactionAdapter::adapt)
                .collect(Collectors.toList());
    }
}
