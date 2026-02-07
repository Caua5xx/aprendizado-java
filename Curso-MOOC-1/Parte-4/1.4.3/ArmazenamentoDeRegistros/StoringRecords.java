import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do arquivo: ");
        String file = scanner.nextLine();

        ArrayList<Person> list = readRecordsFromFile(file);

        for (Person p: list) {
            System.out.println(p);
        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> people = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get("Curso-MOOC-1/Parte-4/1.4.3/ArmazenamentoDeRegistros/" + file + ".txt"))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                Person person = new Person(name, age);
                people.add(person);
            }

        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        }

        return people;
    }
    
}

public class Person {
    private String name;
    private int age;

    public Person(String initialName, int initialAge) {
        this.name = initialName;
        this.age = initialAge;
    }

    @Override
    public String toString() {
        if (this.age <= 1) {
            return this.name + " (" + age + " ano)";
        } else {
            return this.name + " (" + age + " anos)";
        }
    }
}