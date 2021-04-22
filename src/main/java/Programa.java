import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final CarrosGeral carrinho1 = new CarroDePasseio();
        System.out.println("dê a marca de 'carrinho1'");
        carrinho1.setMarca(ler.next());
        System.out.println("dê o código de 'carrinho1'");
        carrinho1.setCodigo(ler.nextInt());
        System.out.println("dê o peso de 'carrinho1'");
        carrinho1.setPeso(ler.nextFloat());
        carrinho1.getInformation();
        for(TesteEnum teste:TesteEnum.values()){
            System.out.println("Tipo: "+teste);
        }
    }
}
