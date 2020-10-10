package agh.cs.lab1;


public class World {
    static void run (Direction[] argumenty) {

        System.out.println("Ide sobie xD");
        for (Direction argument: argumenty){
            switch(argument){
                case FORWARD:
                    System.out.println("Do przodu");
                    break;
                case BACKWARD:
                    System.out.println("Do tyłu");
                    break;
                case LEFT:
                    System.out.println("W lewo");
                    break;
                case RIGHT:
                    System.out.println("W prawo");
                    break;
            }
        }
    }

    static Direction[] convert(String[] argumenty){
        Direction[] wynik = new Direction[argumenty.length];
        for (int i=0;i<wynik.length;i++) {
            switch (argumenty[i]) {
                case "f":
                    wynik[i] = Direction.FORWARD;
                    break;
                case "b":
                    wynik[i] = Direction.BACKWARD;
                    break;
                case "l":
                    wynik[i] = Direction.LEFT;
                    break;
                case "r":
                    wynik[i] = Direction.RIGHT;
                    break;
                default:
                    wynik[i] = Direction.ERROR;

            }
        }
        return wynik;
    }

    public static void main(String[] args) {
        System.out.println("Uruchamianie systemu.");
        Direction[] enumy = convert(args);
        System.out.println(enumy);
        run(enumy);
        System.out.println("Wyłączanie systemu.");
    }
}
