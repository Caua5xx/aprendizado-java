public enum AnimalTipo {
    AEREO(1, "AEREO", "vôo") {
        @Override
        public void movimentar() {
            System.out.println("voou");
        }
    },
    TERRESTRE(2, "TERRESTRE", "anda") {
        @Override
        public void movimentar() {
            System.out.println("andou");
        }
    },
AQUATICO(3, "AQUATICO", "nada") {
        @Override
        public void movimentar() {
            System.out.println("nadou");
        }
    };

    private int id;
    private String tipoString;
    private String tipoMovimento;

    AnimalTipo(int id, String tipoString, String tipoMovimento) {
        this.id = id;
        this.tipoString = tipoString;
        this.tipoMovimento = tipoMovimento;
    }

    public static AnimalTipo getAnimalTipoPorMovimento(String tipoMovimento) {
        for (AnimalTipo animalTipo: values()) {
            if (animalTipo.getTipoMovimento().equals(tipoMovimento)) {
                return animalTipo;
            }
        }

        return null;
    }

    public abstract void movimentar();

    public int getId() {
        return id;
    }

    public String getTipoString() {
        return tipoString;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }
}
