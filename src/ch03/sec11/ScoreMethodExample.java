package ch03.sec11;

public class ScoreMethodExample {
    public static void main(String[] args) {
        int randomScore = getRandomValue(10, 200);

        char grade = getGrade(randomScore); 
        // 100점 초과시 혹은 0점 미만시 ''리턴
        // 90점 이상 'a'리턴
        // 80점 이상 'b'리턴
        // 70점 이상 'c'리턴
        // 70점 미만 'b'리턴

        System.out.printf("%d : %c\n", randomScore, grade);
    }
    public static int getRandomValue(int from, int to){
        return (int)(Math.random() * (to-from+1)) + from;
    }
    public static char getGrade(int ran){

//        if (ran > 100 || ran < 0) {
//            return 'X';
//        } else if (ran >= 90) {
//            return 'A';
//        } else if (ran >= 80) {
//            return 'B';
//        } else if (ran >= 70) {
//            return 'C';
//        } else {
//            return 'D';
//        }
        return (ran > 100 || ran < 0) ? 'X' :
                (ran >= 90) ? 'A' :
                (ran >= 80) ? 'B' :
                (ran >= 70) ? 'C' : 'D';
    }
}
