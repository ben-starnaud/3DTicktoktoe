import java.awt.*;


public class Image {

    public static void main(String[] args) {

        StdDraw.setCanvasSize(600, 750);
        //Board Setup
        int x = 600;
        int y = 750;
        int ch = 0;
        double r = 100;
        double c = 100;
        //Scales
        StdDraw.setXscale(0, x);// x was 7.5
        StdDraw.setYscale(0, y); //y was 15
        //Bottom 4x4 block
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledSquare(250, 250, 200);
        StdDraw.setPenRadius(0.010);
        StdDraw.setPenColor(Color.black);
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                StdDraw.square(i * 100, j * 100, 50);
            }
        }
        StdDraw.setFont(new Font("Arial", Font.BOLD, 20));
        StdDraw.text(475, 400, "p");
        StdDraw.text(475, 300, "r");
        StdDraw.text(475, 200, "b");
        StdDraw.text(475, 100, "t");
        StdDraw.picture(525, 400, "transporter.png",70,70);
        StdDraw.picture(525, 300, "bomb.png", 70, 70);
        StdDraw.picture(525, 200, "shifter.png", 70, 70);
        StdDraw.picture(525, 100, "paintbrush.png", 70, 70);
        StdDraw.picture(550, 700, "tictactoe.png", 150, 70);
        StdDraw.text(575, 400, "x2");
        StdDraw.text(575, 300, "x2");
        StdDraw.text(575, 200, "x2");
        StdDraw.text(575, 100, "x2");

        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledRectangle(250, 560, 225, 75);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setFont(new Font("Arial", Font.BOLD, 20));

       // StdDraw.text(100, 640, "A");
       // StdDraw.text(250, 640, "B");
       // StdDraw.text(400, 640, "C");
        StdDraw.rectangle(250, 560, 225, 75);
        StdDraw.text(100,560,"Stacks :");


        for (int i = 0, j = 0; i < 3 && j < 4; i++, j++) {

            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledCircle(205 + (i * 105), 560, 50);
        }

        while (!StdDraw.hasNextKeyTyped()) {
            //waiting for input
        }
        while (ch != 'q') {

            while (!StdDraw.hasNextKeyTyped()) {
                //waiting for input
            }
            if (StdDraw.hasNextKeyTyped()) {
                ch = StdDraw.nextKeyTyped();
                System.out.println(ch);
                if (ch == 'w' || ch == 's' || ch == 'a' || ch == 'd') {
                    StdDraw.setPenColor(StdDraw.BLACK);
                    StdDraw.square(c, r, 50);
                    switch (ch) {
                        case 'w' -> {
                            System.out.println("up");
                            r = r + 100;
                        }
                        case 's' -> {
                            System.out.println("down");
                            r = r - 100;
                        }
                        case 'a' -> {
                            System.out.println("left");
                            c = c - 100;
                        }
                        case 'd' -> {
                            System.out.println("right");
                            c = c + 100;
                        }
                    }
                    if (r < 100  || r > 400){
                        if (r < 100) {
                            r = r + 100;
                            StdDraw.setPenColor(StdDraw.RED);
                            StdDraw.square(c, r, 50);
                        } else if (r > 400) {
                            r = r - 100;
                            StdDraw.setPenColor(StdDraw.RED);
                            StdDraw.square(c, r, 50);
                        } else {
                            StdDraw.setPenColor(StdDraw.RED);
                            StdDraw.square(c, r, 50);

                        }
                    } else {

                        if (c < 100 || c > 400) {
                            if (c < 100) {
                                c = 400;
                                StdDraw.setPenColor(StdDraw.RED);
                                StdDraw.square(c, r, 50);
                            } else if (c > 400) {

                                c = 100;
                                StdDraw.setPenColor(StdDraw.RED);
                                StdDraw.square(c, r, 50);
                            } else {
                                StdDraw.setPenColor(StdDraw.RED);
                                StdDraw.square(c, r, 50);

                            }
                        } else {
                            StdDraw.setPenColor(StdDraw.RED);
                            StdDraw.square(c, r, 50);

                        }
                    }
                }

            }

        }
    }
}



   /*     //circles for B1 - B3
        int x = 4; //size of piece
        int linecount = 6; // lineCount


        boolean blueTurn;
        if (linecount % 2 != 0) {   // Boolean If statement for Player Turn
            blueTurn = true;
        } else {
            blueTurn = false;
        }*/

    /*    if (blueTurn) {

            for (int i = 1, j = 0; i < 5 && j < 4; i++, j++) {
                if (i == x) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledCircle(3.75, 7.25, 0.9 - (j * 0.15));
                }
            }
        } else {
            for (int i = 1, j = 0; i < 5 && j < 4; i++, j++) {
                if (i == x) {
                    StdDraw.setPenColor(StdDraw.GREEN);
                    StdDraw.filledCircle(3.75, 7.25, 0.9 - (j * 0.15));
                }
            }
        }
        StdDraw.show(2000);
        StdDraw.close();
*/
            //Scales
         /*   StdDraw.setYscale(0, 15);
            StdDraw.setXscale(0, 7.5);
            //Bottom 4x4 block
            StdDraw.filledSquare(3.75, 3.75, 3.75);
            StdDraw.setPenRadius(0.015);
            StdDraw.setPenColor(Color.white);
            //vertical
            StdDraw.line(1.875, 0, 1.875, 7.5);
            StdDraw.line(3.75, 0, 3.75, 7.5);
            StdDraw.line(5.625, 0, 5.625, 7.5);
            //horizontal
            StdDraw.line(0, 1.875, 7.5, 1.875);
            StdDraw.line(0, 3.75, 7.5, 3.75);
            StdDraw.line(0, 5.565, 7.5, 5.565);
            //Lower Grey Square
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.square(3.75, 3.75, 3.75);
            //Upper Grey Square
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.square(3.75, 11.25, 3.75);
            //Top Text and A,B and C text
            StdDraw.text(3.75, 14.55, "GUI");
            StdDraw.text(4.85, 13.85, "A");
            StdDraw.text(4.85, 11.85, "B");
            StdDraw.text(4.85, 9.85, "C");
            //Left block
            StdDraw.line(1.25, 8.75, 1.25, 13.75);
            StdDraw.line(6.25, 8.75, 6.25, 13.75);
            //horizontal lines for objects on Left
            for (int i = 0; i < 5; i++) {
                StdDraw.line(0, 8.75 + (i * 1.25), 1.25, 8.75 + (i * 1.25));
            }
            //horizontal lines for objects on Right
            for (int i = 0; i < 5; i++) {
                StdDraw.line(6.25, 8.75 + (i * 1.25), 7.5, 8.75 + (i * 1.25));
            }

            //Left hand obstacles
            StdDraw.text(1.65, 9.37, "p");
            StdDraw.text(1.65, 10.62, "r");
            StdDraw.text(1.65, 11.87, "b");
            StdDraw.text(1.65, 13.15, "t");
            StdDraw.picture(0.625, 13.125, "transporter.png", 1.1, 1.1);
            StdDraw.picture(0.625, 11.875, "bomb.png", 1.1, 1.1);
            StdDraw.picture(0.625, 10.625, "shifter.png", 1.1, 1.1);
            StdDraw.picture(0.625, 9.375, "paintbrush.png", 1.1, 1.1);
            //Right hand obstacles
            StdDraw.text(5.8, 9.37, "p");
            StdDraw.text(5.8, 10.62, "r");
            StdDraw.text(5.8, 11.87, "b");
            StdDraw.text(5.8, 13.15, "t");
            StdDraw.picture(6.875, 13.125, "transporter.png", 1.1, 1.1);
            StdDraw.picture(6.875, 11.875, "bomb.png", 1.1, 1.1);
            StdDraw.picture(6.875, 10.625, "shifter.png", 1.1, 1.1);
            StdDraw.picture(6.875, 9.375, "paintbrush.png", 1.1, 1.1);


            // StdDraw.rectangle(3.75,11.25,1.4,3);
            // for (int i = 0; i < 3; i++){
            //    StdDraw.line(2.35,8.25 + 2*i,5.15,8.25 + 2*i);
            // }
            StdDraw.setPenRadius(0.02);
            StdDraw.setPenColor(Color.blue);

            for (int i = 0; i < 3; i++) {
                StdDraw.filledCircle(3.75, 9.25 + 2 * i, 0.9);
                StdDraw.filledCircle(3.75, 9.25 + 2 * i, 0.75);
                StdDraw.filledCircle(3.75, 9.25 + 2 * i, 0.50);
                StdDraw.filledCircle(3.75, 9.25 + 2 * i, 0.35);
            }
        }*/


            /*private static void printGameBoard (String[][]gameBoard){

        System.out.print("   c1 c2 c3 c4 ");
        System.out.println();
        for (int i = 1; i < 5; i++) {
            System.out.print("r"+i+" ");
            for (int j = 1; j < 5; j++) {
                System.out.print(gameBoard[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
    }
    private static String[][] gameBoard = {
            {"   ", "  ", "  ", "  ", "  "},
            {"   ", "__", "__", "__", "__"},
            {"   ", "__", "__", "__", "__"},
            {"   ", "__", "__", "__", "__"},
            {"   ", "__", "__", "__", "__"}}; */










