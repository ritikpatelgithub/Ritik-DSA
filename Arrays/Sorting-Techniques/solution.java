import java.util.Arrays;

public class SortingTechniques {
    public static void main(String[] args) {
int [] arr={1,5,3,5,6,12,34,22,2,24,4,8};
      //  bubbleSort(arr);
       // selectionSort(arr);
       // mergeSort(arr);
        quickSort(arr,0,arr.length-1);
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
    public static void mergeSort(int [] arr){
        if (arr.length==1){
            return;
        }
        int [] left =new int[arr.length/2];
        int [] right=new int[arr.length-left.length];
        for (int i=0;i<left.length;i++){
            left[i]=arr[i];
        }
        for(int i=0;i<right.length;i++){
            right[i]=arr[left.length+i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);

    }
    public static void merge(int [] a,int [] b,int [] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if (a[i]<b[j]){
                c[k++]=a[i++];
            }else{
                c[k++]=b[j++];
            }
        }
        while (i<a.length){
            c[k++]=a[i++];
        }
        while (j<b.length){
            c[k++]=b[j++];
        }
    }
    public static void quickSort(int [] arr,int start,int end){
        if (start>=end){
            return;
        }
        int i=start,j=end;
        int pivot=arr[(start+end)/2];
        while (i<=j){
            while (arr[i]<pivot){
                i++;
            }
            while (arr[j]>pivot){
                j--;
            }
            if (i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

        }
        quickSort(arr,start,j);
        quickSort(arr,i,end);
    }
}
