package br.com.meubuscadorcep.cliente;

import br.com.meubuscadorcep.dominio.Endereco;
import br.com.meubuscadorcep.viacep.ServicoDeCep;
import java.util.Scanner;

public class BuscadorCep {

    public static void main(String[] args) throws Exception {
        System.out.print("Informe seu CEP: ");
        Scanner sc = new Scanner(System.in);
        String cep = sc.nextLine();
        Endereco endereco = ServicoDeCep.buscaEnderecoPeloCep(cep);

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
        sc.close();
    }
    }