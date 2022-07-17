package com.startjava.FinalHW;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntFunction;

public class GuessNumberFinalTest {

    public static void main(String[] args) {

        int attemp = 3;
        int[] pl1Numbers = new int[attemp];
        int[] pl2Numbers = new int[attemp];

        Scanner console = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String name1 = console.nextLine();
        PlayerFinal pl1 = new PlayerFinal(name1);

        System.out.print("Введите имя второго игрока: ");
        String name2 = console.nextLine();
        PlayerFinal pl2 = new PlayerFinal(name2);

        System.out.println("У каждого из игроков только " + attemp + " попыток!");

        GuessNumberFinal game = new GuessNumberFinal(pl1, pl2, attemp);

        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                game.start();
//                game.winner.equals(null);
                if (game.winner == null) {


                }
            }
            System.out.print("Хотите продолжить игру? [yes/no]");
            answer = console.nextLine();
        } while (!"no".equals(answer));
    }

}
