public class twoSums {
    public static void main(String[] args) {
        int[]arr = {2,3,4,5,6,7,10,11};
        int s= 0;
        int e = arr.length-1;
        int target = 9;;
        while (s<e){
            int sum = arr[s]+arr[e];
            if(sum==target) {
                System.out.println(" indexes of array " + " " + s + " " + e);
                break;
            }
            else if (sum>target){
                e--;
            }
            else{
                s++;
            }
        }
    }
}
