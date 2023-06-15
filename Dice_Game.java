class Dice_Game {
    public static void main(String[] args){
        Dice_Game dg = new Dice_Game();
        dg.run();
    }

    public void run() {
        
        System.out.println("Rolling dice...");
        int d1, d2;
        d1 = new java.util.Random().nextInt(6);
        d1++;
        d2 = new java.util.Random().nextInt(6);
        d2++;
        System.out.println("Die 1: " + d1);
        System.out.println("Die 2: " + d2);
        int sum = d1 + d2;
        System.out.println("Total value: " + sum);
        if(sum > 7) System.out.println( "You won!");
        else System.out.println( "You lost!");
    }
}