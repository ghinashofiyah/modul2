package modul1202357201010;

import javax.swing.JOptionPane;

public class menukarnilai {
    
    public static void main(String[] args) {
        int data[][]
                ={{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        System.out.println("Array lama:");
        for(int a = 0;a < data.length;a++){
          for(int b = 0; b< data[a].length;b++){
            System.out.println(data[a][b]+ "");
          }
          System.out.println();
        };
        int baris = Integer.parselnt(JOptionPane.showInputDialog("masukkanbaris")
        int kolom = Integer.parselnt(JOptionPane.showInputDialog("masukkankolom:"));
       
        int nilai_baru =
        Integer.parselnt(JOptionPane.showInputDialog("masuk nilai baru"));
        data[baris][kolom] = nilaibaru; 
    int element  =0;    
    for(int a=0;a<data.length;a++){
        for(int b=0;b<data.length;b++){
            System.out.print(data[a][b]+"");
        }
        System.out.println(); 
        
    }
    
    int element = 0;
    for (int i = 0; i < data.length;i++){
        for (int j =1; i < data[i].length; j += 2){
            element += data[i][j];
        }
    }
        System.out.println(element);
  }
}