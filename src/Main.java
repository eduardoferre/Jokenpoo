import java.util.Scanner;
public class Main {

    public static JokenPo startGame(){
        System.out.println("******* Jo-KeN-Po **********\n");
        Scanner scanf = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String playerName = scanf.next().toUpperCase();

        Player user = new Player(playerName);
        Player IA = new Player("IA");

        System.out.print(playerName+", informe quantos rounds você deseja jogar:  ");
        int rounds = scanf.nextInt();

        return new JokenPo(user, IA, rounds);
    }

    public static void main(String[] args) {
      JokenPo jokenpo = startGame();

      jokenpo.toPlay();
      jokenpo.showFinalResult();

    }
}