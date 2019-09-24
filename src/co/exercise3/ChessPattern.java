package co.exercise3;

public class ChessPattern {
    public static void main(String[] args) {
        String[][] chess=new String[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(i%2==0){
                    if(j%2==0){
                        chess[i][j]="WW";
                    }
                    else chess[i][j]="BB";
                }
                if(i%2!=0){
                    if(j%2==0){
                        chess[i][j]="BB";
                    }
                    else chess[i][j]="WW";
                }
            }
        }
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(chess[i][j]+"|");
            }
            System.out.println();
        }
    }
}
