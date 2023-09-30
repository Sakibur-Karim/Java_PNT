public class Encapsulation {
    private String Model;
    private int Year;
    private String Transmission;
    private int TopSpeed;
    private double Price;

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setModel("Tesla");
        System.out.println(e.getModel());
        e.setPrice(5000);
        System.out.println(e.getPrice());
        e.setYear(2050);
        System.out.println(e.getYear());
        e.setTrans("Auto");
        System.out.println(e.getTrans());
        e.setTopSpeed(300);
        System.out.println(e.getTopSpeed());
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getTrans() {
        return Transmission;
    }

    public void setTrans(String Transmission) {
        this.Transmission = Transmission;
    }

    public int getTopSpeed() {
        return TopSpeed;
    }

    public void setTopSpeed(int TopSpeed) {
        this.TopSpeed = TopSpeed;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
}
