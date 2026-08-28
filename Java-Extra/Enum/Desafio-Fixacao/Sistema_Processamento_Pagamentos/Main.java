package Sistema_Processamento_Pagamentos;

public class Main {
    static void main(String[] args) {

        System.out.println(MetodoPagamento.PIX.calcularValorFinal(1000));
        System.out.println(MetodoPagamento.CARTAO_CREDITO.calcularValorFinal(1000));
        System.out.println(MetodoPagamento.CARTAO_DEBITO.calcularValorFinal(1000));
        System.out.println(MetodoPagamento.BOLETO.calcularValorFinal(1000));

        System.out.println("Valor Original: R1000|Método: " + MetodoPagamento.PIX + "|Valor Final: R" +MetodoPagamento.PIX.calcularValorFinal(1000)+"|Compensação: "+MetodoPagamento.PIX.getTempoCompensacaoDias()+" dias");
        System.out.println("Valor Original: R1000|Método: " + MetodoPagamento.CARTAO_CREDITO + "|Valor Final: R" +MetodoPagamento.CARTAO_CREDITO.calcularValorFinal(1000)+"|Compensação: "+MetodoPagamento.CARTAO_CREDITO.getTempoCompensacaoDias()+" dias");
        System.out.println("Valor Original: R1000|Método: " + MetodoPagamento.CARTAO_DEBITO + "|Valor Final: R" +MetodoPagamento.CARTAO_DEBITO.calcularValorFinal(1000)+"|Compensação: "+MetodoPagamento.CARTAO_DEBITO.getTempoCompensacaoDias()+" dias");
        System.out.println("Valor Original: R1000|Método: " + MetodoPagamento.BOLETO + "|Valor Final: R" +MetodoPagamento.BOLETO.calcularValorFinal(1000)+"|Compensação: "+MetodoPagamento.BOLETO.getTempoCompensacaoDias()+" dias");

        System.out.println(StatusTransacao.PENDENTE.canChangeTo(StatusTransacao.CONCLUIDO));
        System.out.println(StatusTransacao.PROCESSANDO.canChangeTo(StatusTransacao.CONCLUIDO));
        System.out.println(StatusTransacao.CONCLUIDO.canChangeTo(StatusTransacao.CANCELADO));
        System.out.println(StatusTransacao.CANCELADO.canChangeTo(StatusTransacao.CONCLUIDO));

    }
}
