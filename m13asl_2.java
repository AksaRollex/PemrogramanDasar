public class m13asl_2 { 
    public void main (String[] args) {
        // menghitung hitung luas lingkaran dengan jari-jari 7 cm
        // dan hasilnya dibulatkan 2 angka di belakang koma

        // rumus = phi x r x r
    
        double jari = 7;
        double luas = Math.PI * Math.pow(jari, 2);
        double hasil = Math.round(luas * 100.0) / 100.0;
        System.out.println("Luas lingkaran dengan jari-jari " + jari + " cm adalah " + hasil + " cm^2");

    }
}
