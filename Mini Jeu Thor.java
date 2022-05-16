import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // C'est la position X de l'éclair
        int lightY = in.nextInt(); // position Y
        int initialTX = in.nextInt(); // Thor commencant position X
        int initialTY = in.nextInt(); // Thor commencant position Y

        int thorX = initialTX;
        int thorY = initialTY;

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); 
            
            String directionX="";
            String directionY="";
            if (thorX > lightX) {
                directionX="W";
                thorX = thorX - 1;
            } else if (thorX < lightX) {
                directionX = "E";
                thorX = thorX + 1;
            }
            
            if (thorY > lightY) {
                directionY = "N";
                thorY = thorY - 1;
            } else if (thorY < lightY) {
                directionY = "S";
                thorY = thorY + 1;
            }
            
            System.out.println(directionY + directionX); 
        }
    }
}
