import model.Teknoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Teknoc t1 = new Teknoc(1, 5, 10);
        t1.map.print();
     //   System.out.println("__________"); // elvalasztom a ket kirajzolt map-et egymastol
     //   t1.goForward(6);
     //   t1.map.print();

        Scanner sc = new Scanner(System.in);
        String[] commands;
        do {
            System.out.println("Mit szeretnél csinálni?");
            String input = sc.nextLine();
            commands = input.split(" ");
            switch(commands[0]) {
                case "r":
                case "l":
                    if (commands.length == 2) {
                        int num = Integer.parseInt(commands[1]);
                        for (int i = 0; i < num; i++) {
                            if (commands[0].equals("l")) {
                                t1.rotateLeft();
                            } else {
                                t1.rotateRight();
                            }
                        }
                    } else {
                        if (commands[0].equals("l")) {
                            t1.rotateLeft();
                        } else {
                            t1.rotateRight();
                        }
                    }
                    t1.map.print();
                    break;
                case "go":
                    if (commands.length == 2) {
                        int num = Integer.parseInt(commands[1]);
                        for(int i = 0; i < num; i++) {
                            t1.goForward(1);
                            }
                        } else {
                            t1.goForward(1);
                        }
                    t1.map.print();
                    break;
                case "b":
                    if (commands.length == 2) {
                        int num = Integer.parseInt(commands[1]);
                        for(int i = 0; i < num; i++) {
                            t1.goForward(-1);
                        }
                    } else {
                        t1.goForward(-1);
                    }
                    t1.map.print();
                    break;
                case "pd":
                    t1.penDown();
                    t1.map.print();
                    break;
                case "pu":
                    t1.penUp();
                    t1.map.print();
                    break;

            }
        } while (!commands[0].equals("QUIT"));


    }
}
