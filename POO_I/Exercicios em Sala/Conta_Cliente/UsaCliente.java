/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab07
 */
public class UsaCliente {
    public static void main(String[] args) {
        
        Cliente cl01 = new Cliente();
        cl01.nome = "Vinicius";
        cl01.endereco = "Vila Velha, ES";
        cl01.cpf = "123.456.789-00";
        
        Conta conta01 = new Conta();
        conta01.numero = 12345;
        conta01.saldo = 5004.35;
        
        Cliente cl02 = new Cliente();
        cl02.nome = "Mariana";
        cl02.endereco = "Vitoria, ES";
        cl02.cpf = "987.654.321-00";
        
        Conta conta02 = new Conta();
        conta02.numero = 54321;
        conta02.saldo = 10987.96;
        
        cl01.contaCliente = conta01;
        System.out.println("Cliente " + cl01.nome);
        System.out.println("CPF: " + cl01.cpf);
        System.out.println("Residente de " + cl01.endereco);
        System.out.println("Numero da Conta: " + cl01.contaCliente.numero);
        System.out.println("Saldo atual: " + cl01.contaCliente.saldo);
        
        System.out.println("");
        
        cl02.contaCliente = conta02;
        System.out.println("Cliente " + cl02.nome);
        System.out.println("CPF: " + cl02.cpf);
        System.out.println("Residente de " + cl02.endereco);
        System.out.println("Numero da Conta: " + cl02.contaCliente.numero);
        System.out.println("Saldo atual: " + cl02.contaCliente.saldo);
        
        
    }
    
}
