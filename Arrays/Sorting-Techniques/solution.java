import java.util.Arrays;

public class SortingTechniques {
    public static void main(String[] args) {
int [] arr={1,5,3,5,6,12,34,22,2,24,4,8};
      //  bubbleSort(arr);
       // selectionSort(arr);
        insertionSort(arr);
       // System.out.println(Arrays.toString(arr));
        Arrays.stream(arr).forEach(value -> System.out.print(value+" "));
    }
    public static void bubbleSort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int [] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int index=i;
            for (int j=i+1;j<n;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            if (i!=index){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }
        }
    }
    //int [] arr={1,5,3,5,6,12,34,22,2,24,4,8};

    public static void insertionSort(int [] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
