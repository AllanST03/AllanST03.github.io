public class Nami {

    String Question1;
    String Question2;
    String Question3;
    String Question4;
    String Question5;

    Nami(String Q1, String Q2, String Q3, String Q4, String Q5){
        this.Question1=Q1;
        this.Question2=Q2;
        this.Question3=Q3;
        this.Question4=Q4;
        this.Question5=Q5;}

    boolean test(){
        if (Question1.equals("y") && Question2.equals("y") && Question4.equals("n") && Question5.equals("y") ){
            return true;}
        return false;}
}
