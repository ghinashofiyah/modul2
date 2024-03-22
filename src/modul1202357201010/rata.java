package modul1202357201010;

public class rata {

    public static void main(String[] args) {
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10},{4, 6, 4, 2, 8, 4, 2, 10}};
   
    
        for (int a = 0; a < data.length; a++) {
            double ratarata =0.0;
            for (int b = 0; b < data[a].length; b++) {
                System.out.print(data[a][b] + " ");
                ratarata += data[a][b];
            }
    
            ratarata /= data [a].length;
            System.out.println("\nratarata : " + ratarata);   
        }
    }    
}   

