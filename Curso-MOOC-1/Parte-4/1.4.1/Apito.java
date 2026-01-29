public class Apito {
    public static void main(String[] args) {
        ApitoE apitoDePato = new ApitoE("Kvaak");
        ApitoE apitoDeAlgo = new ApitoE("Peef");

        apitoDePato.som();
        apitoDeAlgo.som();
        apitoDePato.som();
    }
}

public class ApitoE {
    private String som;

    public ApitoE(String somDoApito) {
        som = somDoApito;
    }

    public void som() {
        System.out.println(som);
    }
}
