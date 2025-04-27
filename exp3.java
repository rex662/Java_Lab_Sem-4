public class exp3 {
    public static void main(String[] args) {
        int intval = 100;
        double doubleval = intval;

        System.out.println("Implict Casting:");
        System.out.println("Integer Value:"+intval);
        System.out.println("Double Value:"+doubleval);

        int convint = (int) doubleval;

        System.out.println("Explict Casting:");
        System.out.println("Double Value:"+doubleval);
        System.out.println("Converted Value:"+convint);
        
    }
}
