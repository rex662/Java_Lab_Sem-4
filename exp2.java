class car{
    String brand;
    String make;

    public car(String brand, String make){
        this.brand=brand;
        this.make=make;
    }

    public void displayinfo(){
        System.out.println("Brand:"+brand);
        System.out.println("Make:"+make);
    }
}

public class exp2 {
    public static void main(String[] args) { 
        car car1 = new car("Honda","City");
        car1.displayinfo();
    }
}
