import animal.*;
import animalA.*;
import computador.*;
import contaC.*;
import figura.*;
import funcionarioF.*;
import pessoa.*;
import veiculo.*;
import produto.*;
import conta.*;
import forma.*;
import veiculoV.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("      -x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("ex1");

        Pessoa p1 = new Aluno("João", "Engenharia");
        Pessoa p2 = new Professor("Maria", "Matemática");
        Pessoa p3 = new Funcionario("José", "Secretário");
        p1.apresentar();
        p2.apresentar();
        p3.apresentar();
        System.out.println();
        System.out.println("      -x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("ex2");

        Animal a1 = new Cachorro();
        Animal a2 = new Gato();
        Animal a3 = new Vaca();
        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
        System.out.println();
        System.out.println("      -x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("ex3");

        Veiculo v1 = new Carro();
        Veiculo v2 = new Moto();
        Veiculo v3 = new Caminhao();
        v1.acelerar(60);
        v2.acelerar(80);
        v3.acelerar(40);
        System.out.println();
        System.out.println("      -x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("ex4");

        FuncionarioF f1 = new Assistente();
        FuncionarioF f2 = new Gerente();
        FuncionarioF f3 = new Diretor();
        System.out.println("Salário do Assistente: " + f1.calcularSalario());
        System.out.println("Salário do Gerente: " + f2.calcularSalario());
        System.out.println("Salário do Diretor: " + f3.calcularSalario());
        System.out.println();
        System.out.println("      -x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("ex5");

        Produto eletronico = new Eletronico(1000);
        Produto vestuario = new Vestuario(200);
        Produto alimento = new Alimento(50);
        System.out.println("Desconto Eletrônico: " + eletronico.calcularDesconto());
        System.out.println("Desconto Vestuário: " + vestuario.calcularDesconto());
        System.out.println("Desconto Alimento: " + alimento.calcularDesconto());
        System.out.println();
        System.out.println("      -x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("ex6");

        Conta conta1 = new Conta(1000);
        Conta conta2 = new ContaCorrente(1000, 500);
        Conta conta3 = new ContaPoupanca(1000, 0.01);
        conta1.verificarConta();
        conta2.verificarConta();
        conta3.verificarConta();
        System.out.println();
        System.out.println("      -x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("ex7");

        Figura circulo = new Circulo(2);
        Figura retangulo = new Retangulo(3, 4);
        Figura triangulo = new Triangulo(5, 6);
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
        System.out.println();
        System.out.println("      -x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("ex8");

        Computador notebook = new Notebook();
        Computador desktop = new Desktop();
        Computador servidor = new Servidor();
        notebook.iniciar();
        desktop.iniciar();
        servidor.iniciar();
        System.out.println();
        System.out.println("      -x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("ex9");

        List<Forma> formas = new ArrayList<>();
        formas.add(new TrianguloT(3, 4));
        formas.add(new TrianguloT(5, 6));
        formas.add(new CirculoC(2));
        formas.add(new CirculoC(3.5));
        formas.add(new Quadrado(5));
        double somaDasAreas = CalculadoraDeAreas.somarAreas(formas);
        System.out.println("A soma das áreas é: " + somaDasAreas);
        System.out.println();
        System.out.println("      -x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("ex10");

        CachorroC cachorroC = new CachorroC();
        GatoG gatoG = new GatoG();
        VacaV vacaV = new VacaV();
        Galinha galinha = new Galinha();
        List<AnimalA> animais = new ArrayList<>();
        animais.add(cachorroC);
        animais.add(gatoG);
        animais.add(vacaV);
        animais.add(galinha);
        Fazenda fazenda = new Fazenda();
        fazenda.alimentarAnimais(animais);
        System.out.println();
        System.out.println("      -x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("ex11 - apenas codigo, nada printado");

        ContaC c1 = new ContaC(1000);
        ContaEspecial c2 = new ContaEspecial(500, 1000);
        ContaCorrenteC c3 = new ContaCorrenteC(2000);
        ContaPoupancaC c4 = new ContaPoupancaC(3000, 0.02);
        c1.sacar(200);
        c2.sacar(1000);
        c3.sacar(500);
        c4.sacar(1000);
        Banco banco = new Banco();
        List<ContaC> contas = Arrays.asList(c1, c2, c3, c4);
        banco.pagaJuros(contas);
        System.out.println();
        System.out.println("      -x-x-x-x-x-x-x-x--x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println("ex12");

        VeiculoV veiculo1 = new CarroC("Fiat", "Uno", 2020);
        VeiculoV veiculo2 = new MotoM("Honda", "CG 160", 2022);

        Garagem garagem = new Garagem();
        garagem.estacionar(veiculo1);
        garagem.estacionar(veiculo2);
    }
}