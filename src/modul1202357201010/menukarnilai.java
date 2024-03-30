package modul1202357201010;

import javax.swing.JOptionPane;

public class menukarnilai {
    
    public static void main(String[] args) {
        int data[][]={{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        
        int baris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Baris"));
        int kolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Kolom"));
        
        int nilai_baru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Baru"));
        data[baris][kolom] = nilai_baru;
        
        for(int a=0; a<data.length;a++){
            for(int b=0; b<data[a].length;b++){
                System.out.print(data[a][b]+" ");
            }
        }
        System.out.println("\n");
    }
}
       
        