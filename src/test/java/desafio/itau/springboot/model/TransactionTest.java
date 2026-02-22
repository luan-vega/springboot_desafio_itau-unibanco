package desafio.itau.springboot.model;

import desafio.itau_unibanco.springboot.model.Transaction;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionTest {

    @Test
    void testTransaction() {
        double valor = 100.0;
        OffsetDateTime dataHora = OffsetDateTime.now();

        Transaction transaction = new Transaction(valor, dataHora);

        assertEquals(valor, transaction.getValor());
        assertEquals(dataHora, transaction.getDataHora());
    }

    @Test
    void testTransactionWithNegativeValue() {
        double valor = -50.0;
        OffsetDateTime dataHora = OffsetDateTime.now();

        Transaction transaction = new Transaction(valor, dataHora);

        assertEquals(valor, transaction.getValor());
        assertEquals(dataHora, transaction.getDataHora());
    }

    @Test
    void testTransactionWithZeroValue() {
        double valor = 0.0;
        OffsetDateTime dataHora = OffsetDateTime.now();

        Transaction transaction = new Transaction(valor, dataHora);

        assertEquals(valor, transaction.getValor());
        assertEquals(dataHora, transaction.getDataHora());
    }

}
