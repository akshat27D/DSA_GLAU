import java.util.Scanner;

public class Selection_Sort {
    public void Search(int []arr){
        int n= arr.length;;
        int pos = 0;
        for(int i=0;i<n-1;i++){
            int min=arr[i];
            pos=i;
            for(int j=i+1;j<n;j++){
                if(min>arr[j]){
                    min=arr[j];
                    pos=j;
                }
            }
            if(pos!=i){
                int temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
            }

        }
        for (int j : arr) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        Selection_Sort ob = new Selection_Sort();
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int []arr=new int[n];
        for(int i=0;i< arr.length;i++) {
            arr[i] = S.nextInt();
        }
        ob.Search(arr);

    }
}
