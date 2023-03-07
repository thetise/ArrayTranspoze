package ArrayHomeworks;

public class MatrisTranspose {
    public static void main(String[] args) {

        int[][] list = {{2,3,4}, {5,6,4}};

        int[][] newlist = new int[list[0].length][list.length];

        System.out.println("Matris : ");

        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list[0].length; j++){
                System.out.print(list[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Transpoze : ");

        for(int j = 0; j < newlist.length; j++){
            for(int k = 0; k  < newlist[0].length; k++){
                System.out.print(list[k][j] + " ");
            }
            System.out.println("");
        }
    }
}
