public class pairsum {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,3,7};
        int k=11;
        int sum=0;
        for(int i=0;i<=1;i++){
            sum=sum+arr[i];
            System.out.print(sum+",");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println("pair is"+" "+arr[i]+" "+"and"+" "+arr[j]);
                }
            }
        }
    }
}