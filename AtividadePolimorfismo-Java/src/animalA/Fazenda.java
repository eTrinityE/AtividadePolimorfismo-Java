package animalA;

import java.util.List;

public class Fazenda {
    public void alimentarAnimais(List<AnimalA> animais) {
        for (AnimalA animalA : animais) {
            animalA.comer();
        }
    }
}
