import javax.lang.model.util.ElementScanner6;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 32.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Novo Saldo: " + saldo);
        
        }else
        System.out.println("Saldo Insuficiente: " + saldo);

    }
}
