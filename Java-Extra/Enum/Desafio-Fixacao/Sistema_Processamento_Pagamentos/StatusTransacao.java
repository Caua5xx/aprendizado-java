package Sistema_Processamento_Pagamentos;

public enum StatusTransacao {

    PENDENTE {
        @Override
        public boolean canChangeTo(StatusTransacao novoStatus) {
            return true;
        }
    },
    PROCESSANDO {
        @Override
        public boolean canChangeTo(StatusTransacao novoStatus) {
            switch (novoStatus) {
                case CANCELADO, CONCLUIDO -> {
                    return true;
                }
                default -> {
                    return false;
                }
            }
        }
    },
    CONCLUIDO {
        @Override
        public boolean canChangeTo(StatusTransacao novoStatus) {
            return false;
        }
    },
    CANCELADO {
        @Override
        public boolean canChangeTo(StatusTransacao novoStatus) {
            return false;
        }
    };

    public abstract boolean canChangeTo(StatusTransacao novoStatus);
}
