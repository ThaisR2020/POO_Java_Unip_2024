public class KmToMiles {
    public static void main(String[] args) {
        double[] distanciasKm = {10, 50, 100}; // Exemplos de distâncias em KM
        
        for (double km : distanciasKm) {
            double milhas = kmToMiles(km);
            System.out.println("O valor convertido de " + km + " Km para Milhas é: " + milhas);
        }
    }
    
    public static double kmToMiles(double km) {
        return km / 1.60934;
    }
}
