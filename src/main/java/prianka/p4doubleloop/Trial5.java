package main.java.prianka.p4doubleloop;

public class Trial5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            //Printing of N
            System.out.print("**");
            for(int aa =2;aa<=i;aa++){
                System.out.print(" ");
            }
            System.out.print("**");
            for(int bb=i;bb<=9;bb++){
                System.out.print(" ");
            }
            System.out.print("**");
            for (int m = 1; m < 2; m++) {
                System.out.print(" ");
            }
            for (int n = i; n <= 10; n++) {
                System.out.print(" ");
            }
            {
                System.out.print("**");
            }
            for (int o = 2; o <= i; o++) {
                if (i != 6) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int p = 2; p <= i; p++) {
                if (i != 6) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("**");
            for (int q = 1; q <= 1; q++) {
                System.out.print("  ");
            }
            System.out.print("**");
            for (int r = i; r <= 9; r++) {
                System.out.print(" ");
            }

            for (int s = i; s <= 9; s++) {
                System.out.print(" ");
            }
            System.out.print("**");
            for (int u = 1; u <= i; u++) {
                System.out.print(" ");
            }
            for (int v = i; v <= i; v++) {
//          printing of J
                if (v == 1) {
                    System.out.print("******");
                } else if (v == 8) {
                    System.out.print("**    ");
                } else if (v == 9) {
                    System.out.print(" **   ");
                } else if (v == 10) {
                    System.out.print("  ****");
                } else {
                    System.out.print("      ");
                }
            }
            //printing of E

                System.out.print("**");

                for (int w = i; w <= i; w++) {
                    if (w == 1) {
                        System.out.print("******");
                    } else {
                        System.out.print("      ");
                    }
                }
            for(int y=1;y<=2;y++) {
                System.out.print("  **");
                for (int x = i; x <= i; x++) {
                    if ((x == 1) || (x == 6) || (x == 10)) {
                        System.out.print("********");
                    } else {
                        System.out.print("        ");
                    }
                    System.out.print("  ");
                }
            }
            for(int za=1;za<=4;za++) {
                for (int zp = i; zp <= i; zp++) {
                    if (i == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("**");
            for(int zb=1;zb<=4;zb++) {
                for (int zq = i; zq <= i; zq++) {
                    if (i== 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }








            System.out.println();
        }
    }
}

