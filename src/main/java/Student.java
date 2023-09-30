public class Student {
    public static String country = "USA";
    String name;
    int age;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Saif";
        s1.age = 43;
        country = "USA";

        Student s2 = new Student();
        s2.name = "Arif";
        s2.age = 56;
        country = "USA";

        Student s3 = new Student();
        s3.name = "Amzal";
        s3.age = 12;
        country = "USA";

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(country);
        System.out.println("**********");

        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(country);
        System.out.println("**********");

        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(country);
    }
}
