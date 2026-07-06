import java.util.ArrayList;

public class KelasJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Double> ass = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        ass.add(10.0);

        // for each
        for (Integer terserah : arr) {
            System.out.println(terserah);
        }

        for (Double terseruy : ass) {
            System.out.println(terseruy);
        }

        // for i
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("terserah berdasarkan i  : " + arr.get(i));
        }
        // do while
        do {
            
        } while (condition);

        // whlie
    }
}
