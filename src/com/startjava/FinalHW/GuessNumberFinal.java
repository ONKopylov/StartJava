package com.startjava.FinalHW;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberFinal {

    private PlayerFinal pl1;
    private PlayerFinal pl2;

    private PlayerFinal winner;
    private int attempPl1;
    private int attempPl2;
    private int[] pl1Numbers;
    private int[] pl2Numbers;
    private int attemp;

    public GuessNumberFinal(PlayerFinal pl1, PlayerFinal pl2, int attemp) {
        this.pl1 = pl1;
        this.pl2 = pl2;
//        this.winner = "";
        this.attempPl1 = 0;
        this.attempPl2 = 0;
        this.attemp = attemp;
        this.pl1Numbers = new int[attemp];
        this.pl2Numbers = new int[attemp];
    }

    public int getAttempPl1() {
        return attempPl1;
    }

    public int getAttempPl2() {
        return attempPl2;
    }

    public int[] getPl1Numbers() {
        return pl1Numbers;
    }

    public int[] getPl2Numbers() {
        return pl2Numbers;
    }

    public void start() {

        Random rnd = new Random();
        int secretNum = rnd.nextInt(10) + 1;//rnd.nextInt(1) + 1;
        int count = 0;

        Scanner console = new Scanner(System.in);

        while (count < attemp) {

            count++;

            System.out.println(pl1.getName() + ", введите число: ");
            int num = console.nextInt();
            if (num == secretNum) {
                System.out.println("Победил игрок " + pl1.getName());
                pl1Numbers[count - 1] = num;
                attempPl1 = count;
                winner = pl1;
                break;
            } else if (num > secretNum) {
                System.out.println("Введенное число больше загаданного!");
            } else {
                System.out.println("Введенное число меньше загаданного!");
            }

            pl1Numbers[count - 1] = num;
            attempPl1 = count;

            System.out.println(pl2.getName() + ", введите число: ");
            num = console.nextInt();
            if (num == secretNum) {
                System.out.println("Победил игрок " + pl2.getName());
                pl2Numbers[count - 1] = num;
                attempPl2 = count;
                winner = pl2;
                break;
            } else if (num > secretNum) {
                System.out.println("Введенное число больше загаданного!");
            } else {
                System.out.println("Введенное число меньше загаданного!");
            }

            pl2Numbers[count - 1] = num;
            attempPl2 = count;
        }

    }

}
