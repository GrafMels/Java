package Project001;

/**
 * Program001
 */
public class Program001 {

    public static void main(String[] args) {
    int[] A = {3,2,0,3,7,4,5,9,0};
    int[] B = {2,3,6,4,5,6};
    int[] C = new int[A.length*2];
    for (int i = 0; i < C.length; i++) {
        C[i]=99;  
    }
    int k = 0;
    int i_min = 0;
    int j_min = 0;
    for (int i = i_min; i < B.length; i++) {
        for (int j = j_min; j < A.length; j++) {
            if(A[j]==B[i]){
                System.out.println(A[j] + " " + B[i]);
                C[k]=A[j];
                i_min = i;
                j_min = j;
                System.out.println(i + " " + j);
                k++;
                i++;
                j++;
            }
        }
    }
    System.out.println();
    for (int i = 0; i < C.length & C[i] != 99; i++) {
        System.out.println(C[i]);  
    }
    
    }
}