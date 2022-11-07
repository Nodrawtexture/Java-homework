package hm2;

import java.util.Objects;

public class Poker {
    public static void main(String[] args) {
        if (args.length == 1) {
            int n = Integer.parseInt(args[0]);
            if (n < 11 && n > 1) {
                String[][] cards = new String[4][13];
                String[] jqka = {"Jack", "Queen", "King", "Ace"};
                for (int i=0; i<4; i++) {
                    for (int j = 0; j < 13; j++) {
                        if (j < 9) {
                            switch (i) {
                                case 0 -> cards[i][j] = (j + 2) + " of clubs";
                                case 1 -> cards[i][j] = (j + 2) + " of diamonds";
                                case 2 -> cards[i][j] = (j + 2) + " of hearts";
                                case 3 -> cards[i][j] = (j + 2) + " of spades";
                            }
                        } else {
                            switch (i) {
                                case 0 -> cards[i][j] = jqka[j - 9] + " of clubs";
                                case 1 -> cards[i][j] = jqka[j - 9] + " of diamonds";
                                case 2 -> cards[i][j] = jqka[j - 9] + " of hearts";
                                case 3 -> cards[i][j] = jqka[j - 9] + " of spades";
                            }
                        }
                    }
                }
                String[][] players = new String[n][5];
                for (int i=0; i<n; i++){
                    for (int j=0; j<5; j++){
                        int rand1 = (int)Math.floor(Math.random() * cards.length);
                        int rand2 = (int)Math.floor(Math.random() * 13);
                        if (Objects.equals(cards[rand1][rand2], "0")){
                            j--;
                        }
                        else{
                            players[i][j] = cards[rand1][rand2];
                            cards[rand1][rand2] = "0";
                        }
                    }
                }
                for (int i=0; i<n; i++){
                    System.out.print("Игрок " + (i+1) + ": ");
                    for (int j=0; j<5; j++){
                        System.out.print(players[i][j] + ", ");
                    }
                    System.out.println("\n");
                }
            }
            else {
                System.out.println("Введено неверное количество игроков");
                System.exit(0);
            }
        }
        else {
            System.out.println("Введено неверное количество игроков");
            System.exit(0);
        }
    }
}
