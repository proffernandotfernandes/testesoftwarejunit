package com.mycompany.testesoftware.service;

import com.mycompany.testesoftware.exceptions.CarroNaoDisponivelException;
import com.mycompany.testesoftware.exceptions.LocacaoException;
import com.mycompany.testesoftware.model.Carro;
import com.mycompany.testesoftware.model.Cliente;
import com.mycompany.testesoftware.model.Locacao;
import java.time.LocalDate;


public class LocacaoService {
    
    public Locacao alugaCarro(Cliente cliente, Carro carro) throws LocacaoException, CarroNaoDisponivelException {
        if(cliente == null) throw new LocacaoException("Cliente não informado");

        if(carro == null) throw new LocacaoException("Carro não informado");

        if(carro.getDisponiveis() == 0) throw new CarroNaoDisponivelException("Carro não disponível!");

        Locacao locacao = new Locacao();
        locacao.setCliente(cliente);
        locacao.setCarro(carro);
        locacao.setDataRetirada(LocalDate.now());
        locacao.setDataRetorno(adicionaDias(LocalDate.now(), 3));
        locacao.setValor(carro.getValor());

        //Salvar a locacao, no banco de dados
        return locacao;
    }

    private LocalDate adicionaDias(LocalDate now, int i) {
        return now.plusDays(i);
    }

//    public static void main(String[] args){
//        //Testar os métodos alugaCarro
//    }

}
