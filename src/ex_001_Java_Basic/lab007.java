package ex_001_Java_Basic;

public class lab007 {
    public static void main(String[] args) {
        int score=55;
        char grade=(score>=90)?'A':(score>=80)?'B':(score>=70)?'C':(score>=60)?'D':'F';
        System.out.println("your grade is"+ grade);
    }
}
