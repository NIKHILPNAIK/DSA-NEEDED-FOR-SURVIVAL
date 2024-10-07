public class Ceiling {
    public static void main(String[] args) {
        int [] arr ={ 2, 4,8, 14,16, 18,22};
        int tar = 15;
        System.out.println(ceiling1(arr,tar));
    }
    static int ceiling1(int [] arr, int tar){
        int start =0;
        int end = arr.length-1;

        while(end >=start){
            int mid = start + (end-start)/2;
            if(arr[mid]==tar){
                return arr[mid];
            }
            else if(arr[mid]>tar){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return arr[start];
    }
}
