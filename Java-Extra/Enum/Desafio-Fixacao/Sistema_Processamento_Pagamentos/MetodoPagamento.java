package Sistema_Processamento_Pagamentos;

public enum MetodoPagamento {

    PIX(0, 0) {
        final double desconto = 0.05;

        @Override
        public double calcularValorFinal(double valorInicial) {
            return valorInicial - (valorInicial * desconto);
        }
    },

    CARTAO_CREDITO(5, 30) {
        @Override
        public double calcularValorFinal(double valorInicial) {
            return valorInicial + (valorInicial * CARTAO_CREDITO.taxaFixa / 100);
        }
    },

    CARTAO_DEBITO(2, 1) {
        @Override
        public double calcularValorFinal(double valorInicial) {
            return valorInicial + (valorInicial * CARTAO_DEBITO.taxaFixa / 100);
        }
    },

    BOLETO(2, 3) {
        @Override
        public double calcularValorFinal(double valorInicial) {
            return valorInicial + BOLETO.taxaFixa;
        }
    };

    private final double taxaFixa;
    private final int tempoCompensacaoDias;


    MetodoPagamento(double taxaFixa, int tempoCompensacaoDias) {
        this.taxaFixa = taxaFixa;
        this.tempoCompensacaoDias = tempoCompensacaoDias;
    }

    public abstract double calcularValorFinal(double valorInicial);

    public int getTempoCompensacaoDias() {
        return tempoCompensacaoDias;
    }
}
