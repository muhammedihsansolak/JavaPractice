package coreJavaPractice.day17_Practice;

public class UtopianTree {
    public static void main(String[] args) {

        int treeSize = 0;
        int growth = 0;

        for (int i = 1; i <= 10 ; i++) {

            if (i >= 1 && i <= 3 ){
                growth = 1;
                treeSize += growth;
            } else if (i > 3) {
                growth = 2;
                treeSize += growth;
            }
            System.out.println("year "+i+" - growth "+ growth + " cm\ntree size: "+ treeSize + " cm");
        }





    }
}
