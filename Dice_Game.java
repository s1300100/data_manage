class Dice_Game {
    public static void main(String[] args){
        Dice_Game dg = new Dice_Game();
        dg.run();
    }

    public void run() {
       
        System.out.println("What is your name?");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("Hello, " + name + "!");
    }
}