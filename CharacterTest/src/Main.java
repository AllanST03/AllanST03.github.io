import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner PY = new Scanner(System.in);
        String PlayerchoicePY;



        while (true){
            System.out.print("Do you want to take the test about which one piece character are you?" + "     " +
                    "Type : 'y' for yes or 'n' for no");
            PlayerchoicePY = PY.nextLine();
            if (PlayerchoicePY.equals("y")|| PlayerchoicePY.equals("n") ){
                break;}
            else {
                System.out.println(PlayerchoicePY + " : is not valid");}   }

        if (PlayerchoicePY.equals("n")){
            System.exit(0); } // To stop the programming
        else {

            // Question 1
            Scanner Q1 = new Scanner(System.in);
            String PLQ1;
            while (true){
                System.out.print("Are you good with directions?" + "     " +
                        "Type : 'y' for yes or 'n' for no");
                PLQ1 = Q1.nextLine();
                if (PLQ1.equals("y")|| PLQ1.equals("n") ){
                    break;}
                else {
                    System.out.println(PLQ1 + " : is not valid");}   }

            // Question 2
            Scanner Q2 = new Scanner(System.in);
            String PLQ2;
            while (true){
                System.out.print("Do you like money?" + "     " +
                        "Type : 'y' for yes or 'n' for no");
                PLQ2 = Q2.nextLine();
                if (PLQ2.equals("y")|| PLQ2.equals("n") ){
                    break;}
                else {
                    System.out.println(PLQ2 + " : is not valid");}   }

            // Question 3
            Scanner Q3 = new Scanner(System.in);
            String PLQ3;
            while (true){
                System.out.print("Are you a good Leader?" + "     " +
                        "Type : 'y' for yes or 'n' for no");
                PLQ3 = Q3.nextLine();
                if (PLQ3.equals("y")|| PLQ3.equals("n") ){
                    break;}
                else {
                    System.out.println(PLQ3 + " : is not valid");}   }

            // Question 4
            Scanner Q4 = new Scanner(System.in);
            String PLQ4;
            while (true){
                System.out.print("Are you Strong?" + "     " +
                        "Type : 'y' for yes or 'n' for no");
                PLQ4 = Q4.nextLine();
                if (PLQ4.equals("y")|| PLQ4.equals("n") ){
                    break;}
                else {
                    System.out.println(PLQ4 + " : is not valid");}   }

            // Question 5
            Scanner Q5 = new Scanner(System.in);
            String PLQ5;
            while (true){
                System.out.print("Do you like moss?" + "     " +
                        "Type : 'y' for yes or 'n' for no");
                PLQ5 = Q5.nextLine();
                if (PLQ5.equals("y")|| PLQ5.equals("n") ){
                    break;}
                else {
                    System.out.println(PLQ5 + " : is not valid");}   }
// class
            Zoro zoro = new Zoro(PLQ1,PLQ2,PLQ3,PLQ4,PLQ5);
            Nami nami = new Nami(PLQ1,PLQ2,PLQ3,PLQ4,PLQ5);
            Ussop ussop = new Ussop(PLQ1,PLQ2,PLQ3,PLQ4,PLQ5);
            Luffy luffy = new Luffy(PLQ1,PLQ2,PLQ3,PLQ4,PLQ5);
            Sanji sanji = new Sanji(PLQ1,PLQ2,PLQ3,PLQ4,PLQ5);
// test
            if(zoro.test() == true){
                System.out.println("You are Zoro");}
            else if (nami.test() == true) {
                System.out.println("You are Nami");}
            else if (ussop.test() == true) {
                System.out.println("You are Ussop");}
            else if (luffy.test() == true) {
                System.out.println("You are Luffy");}
            else if (sanji.test() == true){
                System.out.println("You are Sanji");
            }
            else{
                System.out.println("You are ST. CHARLOSSSSSS");}


        }




    }
}