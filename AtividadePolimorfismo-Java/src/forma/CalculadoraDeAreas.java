package forma;

import java.util.List;

public class CalculadoraDeAreas {
    public static double somarAreas(List<Forma> formas) {
        double soma = 0;
        for (Forma forma : formas) {
            soma += forma.calcularArea();
        }
        return soma;
    }
}
