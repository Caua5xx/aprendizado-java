import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class SistemaAnalise {
    public static void main(String[] args) {

        try (Scanner reader = new Scanner(Paths.get("Curso-MOOC-1/Parte-4/Fixação/dados_drone.txt"))) {
            ArrayList<Aircraft> drones = new ArrayList<>();

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                String droneModel = parts[0];
                int droneSpeed = Integer.valueOf(parts[1]);
                String droneFaction = parts[2];

                drones.add(new Aircraft(droneModel, droneSpeed, droneFaction));
            }

            System.out.println("Total De Aeronaves: " + drones.size());
            System.out.println("Aeronaves Inimigas: ");
            
            int higherSpeed = 0;
            Aircraft higherAircraftSpeed = null;

            for (int i = 0; i < drones.size(); i++) {
                Aircraft drone = drones.get(i);

                if (drone.getFaction().equals("INIMIGO")) {
                    System.out.println(" - " + drone.getModel());
                }
                
                if (drone.getSpeed() > higherSpeed) {
                    higherSpeed = drone.getSpeed();
                    higherAircraftSpeed = drone;
                }
            }

            System.out.println("Aeronave mais rápida: \n" + " - " + higherAircraftSpeed + "\n");

        } catch (Exception e) {
            System.out.println("⚠️ ERRO: " + e.getMessage());
        }
    }
}

public class Aircraft {
    private String model;
    private int speed;
    private String faction;

    public Aircraft(String droneModel, int droneSpeed, String droneFaction) {
        this.model = droneModel;
        this.speed = droneSpeed;
        this.faction = droneFaction;
    }

    @Override
    public String toString() {
        return "[" + this.faction + "] " + this.model + " - " + this.speed + "Km/h";
    }

    //Getters
    
    public String getFaction() {
        return this.faction;
    }

    public String getModel() {
        return this.model;
    }

    public int getSpeed() {
        return this.speed;
    }
}