package domain;

public class Tesoura implements Algoritimo{

    @Override
    public void executar(TipoAlgoritmo tipo) {
        switch(tipo) {
        case PEDRA:
            System.out.println("Perdeu! Pedra quebra Tesoura");
           break;
        case SPOCK:
            System.out.println("Perdeu! Spock derrete Tesoura");
           break;
        case PAPEL:
            System.out.println("Ganhou! Teosura corta Papel");
           break;
        case LAGARTO:
            System.out.println("Ganhou! Tesoura corta o Lagarto");
           break;
        default:
           System.out.println("Empatou! Tesoura empata com Tesoura");
        }
    }
    
}
