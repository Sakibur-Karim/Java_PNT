public class grade {
    public static void main(String[] args) {
        int score = 71;
//        if(score>=90){
//            System.out.println(score+" A");
//        }
//        else if(score>=80 & score<90){
//            System.out.println(score+" B");
//        }
//        else if(score>=70 & score<80){
//            System.out.println(score+" C");
//        }
//        else if(score>=60 & score<70){
//            System.out.println(score+" D");
//        }
//        else if(score>=50 & score<60){
//            System.out.println(score+" F");
//        }
//
//    }
        char grade = ' ';
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(score + " " + grade);
    }
}
