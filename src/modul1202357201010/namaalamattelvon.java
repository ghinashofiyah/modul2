package modul1202357201010;


public class namaalamattelvon {
    
    
    public static void main(String[] args) {
        String data [][]={
            {"NAMA","t\tALAMAT","t\tTELEPON"},
            {"ANI","t\tNGAWI","t\t085777654402"},
            {"lisa","t\ttegal","t\t082345271983"},
            {"cika","t\tsemarang","t\t082344968897"}
        };
        for (int a = 0;a < data.length; a++){
            for (int b = 0;b< data[a].length; b++){
                System.out.println(data[a][b]+" ");
            }
            System.out.println("");
        }       
    }
    
}
