public class kadanes {
    public static int kadanes(int arr[]){
        if(arr==null || arr.length==0) {
            return 0;
        }
        int Currrentmax=arr[0];
        int maxsum=arr[0];
        for(int i=0;i<arr.length;i++){
            Currrentmax=Math.max(arr[i],Currrentmax+arr[i]);
            maxsum=Math.max(maxsum,Currrentmax);
        }
        return maxsum;

}
    public static void main(String[] args){
    System.out.println(new int[]{-1,-2,-3,-4,-5});

    }
}
