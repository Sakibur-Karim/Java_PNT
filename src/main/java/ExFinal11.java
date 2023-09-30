public class ExFinal11 {
    final static int AGE = 20;
    final String NAME = "Harpreet";
    String country = "USA";

    public static void main(String[] args) {
        ExFinal11 e = new ExFinal11();
        e.country = "Canada";
//        e.AGE = 120; Error re-assigning
        System.out.println(e.NAME);
        System.out.println(e.country);
        System.out.println(AGE);
    }
}
