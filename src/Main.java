import java.awt.*;
public class Main {

    public static void main(String[] args) {

        /** The following segment is for the first handin */
        if (args.length == 1) {
            /** Text Mode */
            In in = new In(args[0]);

            // example methods to use from the In.java class provided in stdlib
            while (in.hasNextLine()) {
                int inputInt = in.readInt();
                String inputString = in.readString();

                System.out.println(inputInt);
                System.out.println(inputString);
                //... see In.java for other available methods
            }

        } else {
            System.out.println("Incorrect number of command line arguments provided");
            System.exit(0);
        }

        /** The following segment is for the final handin */
//        if (args.length == 0) {
//            /** Visual Mode */
//            // some helpful methods from the StdDraw library are listed below
//            int someWidth = 500;
//            int someHeight = 600;
//            StdDraw.setCanvasSize(someWidth, someHeight);
//            StdDraw.setXscale(0, someWidth);
//            StdDraw.setYscale(0, someHeight);
//
//            StdDraw.setPenColor(StdDraw.BLACK);
//            int someSize = 20;
//            Font font = new Font("Arial", Font.BOLD, someSize);
//            StdDraw.setFont(font);
//            StdDraw.text(someWidth/2, someHeight/2, "some text");
//            StdDraw.show(0);
//
//            while (!StdDraw.hasNextKeyTyped()) {
//                // wait
//            }
//            char input = StdDraw.nextKeyTyped();
//            if (input == 'p') {
//                StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
//                StdDraw.filledRectangle(someWidth/2, someHeight/2, someWidth, someHeight);
//                StdDraw.text(someWidth/2, someHeight/2, "Keyboard input");
//            }
//            StdDraw.show(2000);
//
//            StdDraw.close();
//            //... see Draw.java for other available methods
//
//            Stopwatch stopwatch = new Stopwatch();
//            while (stopwatch.elapsedTime() < 2) {
//                // wait
//            }
//        } else if (args.length == 1) {
//            /** Text Mode */
//        } else {
//            System.out.println("Incorrect number of command line arguments provided");
//            System.exit(0);
//        }
    }
}