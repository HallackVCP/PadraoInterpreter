package org.example;

public class Loja {
    public static String formula = "pcJuros * preco + preco";

    public static double calcularPrecoTotalComJuros(double pcJuros, double preco) {
        String expressao;
        expressao = formula.replace("pcJuros", Double.toString(pcJuros));
        expressao = expressao.replace("preco", Double.toString(preco));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }

}
