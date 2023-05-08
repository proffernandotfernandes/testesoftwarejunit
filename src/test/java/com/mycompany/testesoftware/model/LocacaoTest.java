package com.mycompany.testesoftware.model;

import com.mycompany.testesoftware.exceptions.CarroNaoDisponivelException;
import com.mycompany.testesoftware.exceptions.LocacaoException;
import com.mycompany.testesoftware.service.LocacaoService;
import org.junit.Test;
import static org.junit.Assert.*;

public class LocacaoTest {
    
    public LocacaoTest() {
    }

    @Test
    public void testarLocacao() throws LocacaoException, CarroNaoDisponivelException{
        
        LocacaoService service = new LocacaoService();
        Cliente cliente = new Cliente("Gustavo");
        Carro carro = new Carro("Renault Clio 2012", 5, 10.0);

        Locacao locacao = service.alugaCarro(cliente, carro);
    }


}
