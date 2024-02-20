public class BinarySearch {
    public static void main(String[] args) {
int[] array={2,3,4,15,16,19,34};
int ans=sort(array,16);
System.out.println(ans);
    }

    static int sort(int[] array,int target){
        int start=0;
        int end=array.length-1;
        boolean isdes=false;
        if(array[start]>array[end])
        {
            isdes=true;
        }
        while(start<=end){

            int mid=(start+end)/2;
            if(array[mid]==target)
            {
                return mid;
            }
            else if(array[mid]<target)
            {
                if(isdes){
                    end=mid-1;}
                else{
                    start=mid+1;
                }

            }
            else{
                if(isdes){
                    start=mid+1;
                }else {
                    end=mid-1;
                }

            }
          }

        return -1;
    }
}