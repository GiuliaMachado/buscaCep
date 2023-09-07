package br.com.meubuscadorcep.dominio;

public class Endereco {
    String logradouro;
    String bairro;
    String localidade;
    
    public String getLogradouro(){
        return logradouro;
    }
    
    public String getBairro(){
        return bairro;
    }
    public String getLocalidade(){
        return localidade;
    }
    
    @Override
    public String toString(){
        return String.format("Endereço{logradouro: %s, bairro: %s, localidade: %s", logradouro, bairro, localidade); 
    }
}
