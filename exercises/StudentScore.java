package exercises;

import java.util.*;
public class StudentScore {

    public static void main(String[] args) {
        Random ram=new Random();
        int chi=0,eng=0,mat=0;
        double[][] scores=new double[5][4];
        for(int i=0;i<5;i++){
            double sum=0;
            for(int j=0;j<4;j++){
                if(j<=2){
                    scores[i][j]=ram.nextDouble(0,100);
                    sum+=scores[i][j];
                    if(j==0&&scores[i][j]>=90){
                        chi++;
                    } else if (j==1&&scores[i][j]>=90) {
                        mat++;
                    } else if (j==2&&scores[i][j]>=90) {
                        eng++;
                    }
                }
                if(j==3){
                    scores[i][j]=sum;
                }
            }
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                System.out.printf("%.1f\t",scores[i][j]);
            }
            System.out.println();
        }
        System.out.printf("语文90+:%d 数学90+:%d 英语90+%d%n",chi,mat,eng);
    }
}
