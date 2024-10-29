public class Quick_Sort_on_Array {

    public static int partition(int arr [] , int l , int h){

        int pivot = arr[h];
        int i = l - 1;

        for (int j = l; j < h; j++) {
            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

i++;
int temp = arr[i];
arr[i]  = pivot;
arr[h] = temp;
return i;



    }

    public static void quickSort(int arr [], int l , int h){

      if(l < h){

        int pidx = partition(arr,l,h);

        quickSort(arr, l, pidx - 1);
        quickSort(arr, pidx + 1, h);
      }

    }

    public static void main(String[] args) {
        int arr [] = {9,7,9,6,3,2};

        int n = arr.length;

        quickSort(arr,0,n-1);


        for (int i : arr) {
            System.out.print(i + " ");
           
        }
         System.out.println();


    }

   
    
}