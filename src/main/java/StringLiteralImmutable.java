public class StringLiteralImmutable {
    public static void main(String[] args) {
        String a = "Arif";
        String b = "Arif";
        int[] aa = {76, 68, 12, 79};
        int[] StudentInClass = new int[9];
        StudentInClass[0] = 1;
        StudentInClass[1] = 2;
        String[] Student = new String[9];
        Student[0] = "Sofian";
        Student[1] = "Amzal";
        Student[2] = "Shakawat";
        Student[3] = "Ahsan";
        Student[4] = "Harpreet";

        System.out.println(Student);

        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        for (int i = 0; i < weekdays.length; i++) {
            System.out.println(weekdays[i]);
        }
        if (weekdays[4].length() > 10 && weekdays[4].contains("day")) System.out.println(weekdays[4].toUpperCase());
        else System.out.println((weekdays[1].concat(weekdays[2])).toLowerCase());
    }
}
