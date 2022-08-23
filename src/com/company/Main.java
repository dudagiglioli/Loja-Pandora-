package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estado;
        int p1, p2, p3, p4, p5;
        double total, v1, v2, v3, v4, v5, frete, opcao, desconto, acrescimo, parcela, parcela1;
        //p1
        System.out.println("TABELA DE BERLOQUES");
        System.out.println("1 - Charm Pendente Aviao - Globo E Mala");
        System.out.println("2 - Charm Pendente Duplo Lampada Que Brilha No Escuro");
        System.out.println("3 - Charm Disney Mickey E Minnie Mouse Cadeado");
        System.out.println("Escolha um produto: ");
        p1 = sc.nextInt();
        if (p1 == 1){
            System.out.println("Produto: Charm Pendente Aviao - Globo E Mala");
            v1 = 629.0;
            System.out.println("Valor: " + v1 );

        }
        else if(p1 == 2){
            System.out.println("Produto: Charm Pendente Duplo Lampada Que Brilha No Escuro");
            v1 = 799.0;
            System.out.println("Valor: " + v1);
        }
        else{
            System.out.println("Produto: Charm Disney Mickey E Minnie Mouse Cadeado");
            v1 = 969.0;
            System.out.println("Valor: " + v1);
        }
        System.out.println();

        System.out.println("TABELA DE ANÉIS");
        System.out.println("1 - Anel you & Me");
        System.out.println("2 - Anel Solitario Pandora Coroa Signature");
        System.out.println("3 - Anel Amor Para Sempre");
        System.out.println("Escolha um produto: ");
        p2 = sc.nextInt();
        if (p2 == 1){
            System.out.println("Produto:  Anel you & Me");
            v2 = 569.0;
            System.out.println("Valor: " + v2);
        }
        else if(p2 == 2){
            System.out.println("Produto: Anel Solitario Pandora Coroa Signature");
            v2 = 1.069;
            System.out.println("Valor: " + v2);
        }
        else{
            System.out.println("Produto: Anel Amor Para Sempre");
            v2= 389.0;
            System.out.println("Valor: " + v2);
        }
        System.out.println();

        System.out.println("TABELA DE BRACELETES");
        System.out.println("1 - Bracelete Moments Com Fecho Azul Brilhante");
        System.out.println("2 - Bracelete Pandora Monents_ Fecho Os Vingadores Marvel");
        System.out.println("3 - Bracelete Rigido Crie _ Combine");
        System.out.println("Escolha um produto: ");
        p3 = sc.nextInt();
        if (p3 == 1){
            System.out.println("Produto: Charm Pendente Aviao - Globo E Mala");
            v3 = 629.0;
            System.out.println("Valor: " + v3);
        }
        else if(p3 == 2){
            System.out.println("Produto: Charm Pendente Duplo Lampada Que Brilha No Escuro");
            v3 = 799.0;
            System.out.println("Valor: " + v3);
        }
        else{
            System.out.println("Produto: Colar De Corrente Espessa Em Trama");
            v3 = 969.0;
            System.out.println("Valor: " + v3);
        }
        System.out.println();

        System.out.println("TABELA DE COLARES");
        System.out.println("1 - Colar De Prata Pandora");
        System.out.println("2 - Colar Novos Elos");
        System.out.println("3 - Bracelete Rigido Crie _ Combine");
        System.out.println("Escolha um produto: ");
        p4 = sc.nextInt();
        if (p4 == 1){
            System.out.println("Produto: Colar De Prata Pandora");
            v4 = 274.0;
            System.out.println("Valor: " + v4);
        }
        else if(p4 == 2){
            System.out.println("Produto: Colar Novos Elos");
            v4 = 171.0;
            System.out.println("Valor: " + v4);
        }
        else{
            System.out.println("Produto: Colar De Corrente Espessa Em Trama");
            v4 = 221.0;
            System.out.println("Valor: " + v4);
        }
        System.out.println();

        System.out.println("TABELA DE PINGENTES");
        System.out.println("1 - Bracelete Moments Com Fecho Azul Brilhante");
        System.out.println("2 - Bracelete Pandora Monents_ Fecho Os Vingadores Marvel");
        System.out.println("3 - Pendente O De Coracao Pandora Moments");
        System.out.println("Escolha um produto: ");
        p5 = sc.nextInt();
        if (p5 == 1){
            System.out.println("Produto: Pingente Amuleto Rosa");
            v5 = 229.0;
            System.out.println("Valor: " + v5);
        }
        else if(p5 == 2){
            System.out.println("Produto: Pandora Moments Pequeno Rosa Em Pavé");
            v5 = 199.0;
            System.out.println("Valor: " + v5);
        }
        else{
            System.out.println("Produto: CPendente O De Coracao Pandora Moments");
            v5 = 100.0;
            System.out.println("Valor: " + v5);
        }
        System.out.println();

        total = v1 + v2 + v3 + v4 + v5;
        System.out.println("Valor total da compra: $" + total);
        System.out.println();

//frete
        System.out.println("Informe o seu estado: ");
        estado = sc.next();

        if (!estado.equals("SP")){
            System.out.println("O valor do frete é de $100");
            frete = total + 100;
            System.out.println("Total: " + frete);
        }
        else if (total >= 2500){
            System.out.println("Frete grátis");
            System.out.println("Total: $" + total);
        }
        else{
            System.out.println("Frete grátis");
            System.out.println("Total: $" + total);
        }
        System.out.println();

        //forma de pagamento

        System.out.println("OPÇÕES DE PAGAMENTO");
        System.out.println("1- Á vista - 10% de desconto");
        System.out.println("2- 12x no cartão -  20% acréscimo");
        System.out.println("3- 3 parcelas sem juros");

        System.out.println("Informe a forma de pagamento: ");
        opcao = sc.nextInt();

        if (opcao == 1){
            desconto = total - (total * 0.1);
            System.out.println("O valor do pagamento: $" + desconto);
        }
        else if (opcao == 2){
            acrescimo = total + (total * 0.2);
            System.out.println("O valor do pagamento: $" + acrescimo);
            parcela1 = acrescimo / 12;
            System.out.println("O valor da parcela: $" + parcela1);
        }
        else {
            parcela = total / 3;
            System.out.println("O valor da parcela: $" + parcela);
        }
    }
}