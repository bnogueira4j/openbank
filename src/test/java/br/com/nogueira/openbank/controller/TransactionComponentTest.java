package br.com.nogueira.openbank.controller;

import br.com.nogueira.openbank.service.TransactionService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;

public class TransactionComponentTest {

    @LocalServerPort
    private int port;

    @Test
    public void testApplicationEndToEnd() {
        given().standaloneSetup(new TransactionController(new TransactionService()))
                .when()
                .get(String.format("http://localhost:%s/transactions/1234567", port))
                .then()
                .statusCode(Matchers.is(200));
    }
}
