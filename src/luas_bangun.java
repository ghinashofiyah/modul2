
import javax.swing.JOptionPane;

public class luas_bangun {

public static double LuasPersegiPanjang(double panjang, double lebar){
    return panjang * lebar;
}    

public static double LuasSegitiga(double alas, double tinggi){
    return 0.5 * tinggi;
}

public static double LuasLingkaran(double jarijari){
    return Math.PI * Math.pow(jarijari, 2);
}

public static void main(String[] args) {
    
    double panjangpersegipanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang: "));
    double lebarpersegipanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang: "));
    double LuasPersegiPanjang = LuasPersegiPanjang(panjangpersegipanjang, lebarpersegipanjang);
    JOptionPane.showInputDialog(null,"Luas Persegi Panjang:" + LuasPersegiPanjang);
    System.out.println("Luas Persegi Panjang:" + LuasPersegiPanjang);
    
    
    double alasSegitiga  = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga: "));
    double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga: "));
    double LuasSegitiga = LuasSegitiga(alasSegitiga, tinggiSegitiga);
    JOptionPane.showInputDialog("null,Luas Segitiga + Luas Segitiga: ");
    System.out.println("Luas Segitiga:" + LuasSegitiga);
    
    double jarijariLingkaran  = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jarijari Lingkaran: "));
    double LuasLingkaran = LuasLingkaran(jarijariLingkaran);
    JOptionPane.showInputDialog(null,"Luas Lingkaran:" + LuasLingkaran);
    System.out.println("Luas Lingkaran:" + LuasLingkaran);
    
    
      
        }
    }
    
