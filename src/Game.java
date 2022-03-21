public class Game {
    public static void main(String[] args) {

        //I create 3 player object. Object properties in "Player" class.
        Player kayla = new Player(false,"Kayla");
        Player katie = new Player(false,"Katie");
        Player joseph = new Player(true,"Joseph");


        //use methods
        System.out.println("-----------------------------------");
        System.out.println("Operation #1: Kayla shoots at Katie");
        kayla.shoot(katie);
        System.out.println("-----------------------------------");
        System.out.println("Operation #2: Kayla shoots at Joseph");
        kayla.shoot(joseph);
        System.out.println("-----------------------------------");
        System.out.println("Operation #3: Kayla shoots at Joseph");
        kayla.shoot(joseph);
        System.out.println("-----------------------------------");
        System.out.println("Operation #4: Kayla shoots at Joseph");
        kayla.shoot(joseph);
        System.out.println("-----------------------------------");
        System.out.println("Operation #5: Kayla shoots at Joseph");
        kayla.shoot(joseph);
        System.out.println("-----------------------------------");
        System.out.println("Operation #6: Kayla shoots at Joseph");
        kayla.shoot(joseph);
        System.out.println("-----------------------------------");
        System.out.println("Operation #7: Kayla shoots at Joseph");
        kayla.shoot(joseph);
        System.out.println("-----------------------------------");
        System.out.println("Operation #8: Kayla shoots at Joseph");
        kayla.shoot(joseph);
        System.out.println("-----------------------------------");
        System.out.println("Operation #9: Joseph takes cure");
        joseph.takeCure();
        System.out.println("-----------------------------------");
        System.out.println("Operation #10: Kayla loads magazine");
        kayla.loadMagazine();
        System.out.println("-----------------------------------");
        System.out.println("Operation #11: Kayla loans money to Joseph");
        kayla.loansMoney(joseph);
        System.out.println("-----------------------------------");
        System.out.println("Operation #12: Kayla loans money to Katie");
        kayla.loansMoney(katie);
        System.out.println("-----------------------------------");






    }




}