package contaC;

import java.util.List;

public class Banco {
    public void pagaJuros(List<ContaC> contas) {
        for (ContaC conta : contas) {
            if (conta instanceof ContaPoupancaC) {
                ((ContaPoupancaC) conta).calcularJuros();
            }
        }
    }
}
