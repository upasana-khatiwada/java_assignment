public class Main {
    public static void main(String[] args) {

        int[] arr = {4,6,9,2,12,24,-1};
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j< arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[0]);
        int n = arr.length-1;
        System.out.println(arr[n]);
    }
}