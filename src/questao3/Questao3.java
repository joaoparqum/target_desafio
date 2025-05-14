package questao3;

public class Questao3 {

    public static void main(String[] args) {

        double[] faturamento = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0,
                26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722,
                0.0, 0.0, 3847.4823, 373.7838, 2659.7563,
                48924.2448, 18419.2614, 0.0, 0.0};

        double menor = Double.MAX_VALUE;
        double maior = Double.MAX_VALUE;
        double soma = 0.0;
        int diasComFaturamento = 0;

        for (double valor : faturamento) {
            if( valor > 0.0 ){
                soma+=valor;
                diasComFaturamento++;

                if (valor < menor){
                    menor = valor;
                }

                if (valor > maior){
                    maior = valor;
                }
            }
        }

        double media = soma / diasComFaturamento;

        int diasAcimaMedia = 0;
        for (double valor : faturamento) {
            if(valor>media){
                diasAcimaMedia++;
            }
        }

        System.out.printf("Menor faturamento do mês: R$ %.2f\n", menor);
        System.out.printf("Maior faturamento do mês: R$ %.2f\n", maior);
        System.out.printf("Número de dias com faturamento acima da média mensal: %d\n", diasAcimaMedia);

    }

}
