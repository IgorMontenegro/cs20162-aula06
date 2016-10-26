package br.inf.ufg.exercicio;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlgoritmosTest {
    // Teste case funcao cpf2
    @Test
    public void CPF2ValidoTest() {
        int[] d = { 0, 3, 7, 7, 1, 7, 6, 3, 1, 1, 8 };
        assertTrue(Exercicio.cpf2(d));
    }

    @Test
    public void CPF2InValidoTest() {
        int[] d = { 0, 0, 0, 7, 1, 7, 6, 3, 1, 1, 8 };
        assertFalse(Exercicio.cpf2(d));
    }

    @Test(expected = IllegalArgumentException.class)
    public void CPF2InValido12DigitosTest() {
        int[] d = { 0, 0, 0, 7, 1, 7, 6, 3, 1, 1, 8, 1 };
        Exercicio.cpf2(d);
    }
    
    // Teste case funcao cpf
    @Test
    public void CPFValidoTest() {
        int[] d = { 0, 3, 7, 7, 1, 7, 6, 3, 1, 1, 8 };
        assertTrue(Exercicio.cpf(d));
    }
        
    
    //Testes case funcao mod 
    @Test(expected = IllegalArgumentException.class)
    public void modInvalidoValorYTest(){
    Exercicio.mod(-1, 1);
    }
    public void modInvalidoValorXTest(){
        Exercicio.mod(0, -2);
    }
    
    @Test
    public void CPFInValidoTest() {
        int[] d = { 0, 0, 0, 7, 1, 7, 6, 3, 1, 1, 8 };
        assertFalse(Exercicio.cpf(d));
    }

    @Test(expected = IllegalArgumentException.class)
    public void CPFInValido12DigitosTest() {
        int[] d = { 0, 0, 0, 7, 1, 7, 6, 3, 1, 1, 8, 1 };
        Exercicio.cpf(d);
    }

    //Teste case cp3
    @Test(expected = IllegalArgumentException.class)
    public void CPF3InValido12DigitosTest() {
        int[] d = { 0, 0, 0, 7, 1, 7, 6, 3, 1, 1, 8, 1 };
        Exercicio.cpf3(d);
    }
    @Test
    public void CPF3InValidoTest() {
        int[] d = { 0, 0, 0, 7, 1, 7, 6, 3, 1, 1, 8 };
        assertFalse(Exercicio.cpf3(d));
    }
    public void CPF3ValidoTest() {
        int[] d = { 0, 3, 7, 7, 1, 7, 6, 3, 1, 1, 8 };
        assertTrue(Exercicio.cpf3(d));
    }
    
}