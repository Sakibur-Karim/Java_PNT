public class doWhile {
    public static void main(String[] args) {
//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<=10);

//        for(int i=10;i>=1;i--){
//            System.out.println(i);
//        }
//


        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 3:
                    continue;
                case 5:
                    continue;
                case 7:
                    continue;
            }
            System.out.println(i);
        }

    }
}
