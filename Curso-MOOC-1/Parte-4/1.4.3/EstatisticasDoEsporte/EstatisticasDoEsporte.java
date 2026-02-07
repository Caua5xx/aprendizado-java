import java.util.Scanner;
import java.nio.file.Paths;

public class EstatisticasDoEsporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do arquivo: ");
        String file = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get("Curso-MOOC-1/Parte-4/1.4.3/EstatisticasDoEsporte/" + file + ".csv"))) {
            System.out.print("Equipe: ");
            String team = scanner.nextLine();
            int gamesPlayed = 0;
            int wonGames = 0;
            int lostGames = 0;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);

                System.out.println(homeTeam + " [" + homeTeamPoints + "] x [" + visitingTeamPoints + "] " + visitingTeam);

                if (homeTeam.equals(team) || visitingTeam.equals(team)) {
                    gamesPlayed++;

                    if(homeTeam.equals(team) && homeTeamPoints > visitingTeamPoints) {
                        wonGames++;
                        continue;
                    } else if (visitingTeam.equals(team) && visitingTeamPoints > homeTeamPoints) {
                        wonGames++;
                        continue;
                    } else if (homeTeam.equals(team) && homeTeamPoints < visitingTeamPoints) {
                        lostGames++;
                        continue;
                    } else {
                        lostGames++;
                    }
                }
            }
            System.out.println("Jogos: " + gamesPlayed);
            System.out.println("Jogos vencidos: " + wonGames);
            System.out.println("Jogos perdidos: " + lostGames);

        } catch (Exception e) {
            System.out.println("ERRO: " + e);
        }
    }
}