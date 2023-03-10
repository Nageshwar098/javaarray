public class secndmax {
    public static void main(String[] args) {
        int arr[]={3,1,6,8,3};
        int arr1[]=new int[arr.length];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max){
                arr1[i]=arr[i];
            }
        }
        int max2=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>max2){
                max2=arr1[i];
            }
        }
        System.out.println(max2);
    }
}