package com.mycompany.testesoftware.service;

import com.mycompany.testesoftware.exceptions.CarroNaoDisponivelException;
import com.mycompany.testesoftware.exceptions.LocacaoException;
import com.mycompany.testesoftware.model.Carro;
import com.mycompany.testesoftware.model.Cliente;
import com.mycompany.testesoftware.model.Locacao;
import com.mycompany.testesoftware.utils.DataUtils;

import java.time.LocalDate;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;

public class LocacaoServiceTest {
    
    private LocacaoService service;

    //Defino regras para coletar erros
    @Rule
    public ErrorCollector erros = new ErrorCollector();

    //Defino regras para coletar as exceções
    @Rule
    public ExpectedException exception = ExpectedException.none();

    //Executa antes de cada teste
    @Before // Como se fosse o construtor do teste.
    public void inicializa() {
        System.out.println("Teste Iniciado. Preparo os pré-requisitos.");
        service = new LocacaoService();
    }

    //Crio um teste específico para alugar um carro
    @Test
    public void testeAlugaCarro() throws Exception {
        Cliente cliente = new Cliente("Gustavo");
        Carro carro = new Carro("Renault Clio 2012", 5, 10.0);

        Locacao locacao = service.alugaCarro(cliente, carro);

        erros.checkThat(locacao.getValor(), is(equalTo(10.0)));
        erros.checkThat(DataUtils.ehMesmaData(LocalDate.now(), locacao.getDataRetirada()), is(true));
        erros.checkThat(DataUtils.ehMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(3)), is(true));
   }

    //Crio um teste específico para carro nao disponível
    @Test(expected = CarroNaoDisponivelException.class)
    public void testeCarroNaoDisponivel() throws Exception{
        Cliente cliente = new Cliente("Martin");
        Carro carro = new Carro("Fiat Uno", 0, 10.0);

        service.alugaCarro(cliente, carro);
    }

    //Crio um teste específico tentar alugar sem passar o carro
    @Test
    public void testeVeiculoVazio() {
        Cliente cliente = new Cliente("Andrey");

        try {
            service.alugaCarro(cliente, null);
            fail(); // Da classe Assert
        } catch (CarroNaoDisponivelException | LocacaoException e) {
            assertEquals("Carro não informado", e.getMessage());
        }
    }
    
    //Crio um teste específico tentar alugar sem passar o cliente
    @Test
    public void testeClienteVazio() throws  CarroNaoDisponivelException, LocacaoException {
        Carro carro = new Carro("Renault Clio 2012", 5, 10.0);

        exception.expect(LocacaoException.class);
        exception.expectMessage("Cliente não informado");

        service.alugaCarro(null, carro);
    }

    @After
    public void finaliza() {
        System.out.println("Teste finalizado.");
    }

    
    
}
