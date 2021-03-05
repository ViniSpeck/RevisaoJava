public class PopulacaoMundial {
    public static void main(String[] args) {
        double worldPopulation = 7850144799.0;
        final double growthEstimate = 1.0105;
        int years = Integer.parseInt(args[0]);

        for (int i = 0; i < years; i++) {
            worldPopulation*=growthEstimate;
        }
        System.out.format("%,.0f pessoas.", worldPopulation);
    }
}
