public class Main {
    static void main() {

        Animal animal1 = new Animal("Pássaro", AnimalTipo.AEREO);
        Animal animal2 = new Animal("Cachorro", AnimalTipo.TERRESTRE);
        Animal animal3 = new Animal("Peixe", AnimalTipo.AQUATICO);

        animal1.getTipo().movimentar();
        animal2.getTipo().movimentar();
        animal3.getTipo().movimentar();

        AnimalTipo animalTipo1 = AnimalTipo.getAnimalTipoPorMovimento("vôo");
        AnimalTipo animalTipo2 = AnimalTipo.getAnimalTipoPorMovimento("anda");
        AnimalTipo animalTipo3 = AnimalTipo.getAnimalTipoPorMovimento("nada");
        System.out.println(animalTipo1);
        System.out.println(animalTipo2);
        System.out.println(animalTipo3);
    }
}
