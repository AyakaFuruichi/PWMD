public class App {
    public static void main(String[] args) throws Exception {

        FindMax fMax = new FindMax();

        //Input 1
        //If input is:
        Integer arr_i[] = {2,8,20,3,4};
        int arr_i_size = arr_i.length;
        System.out.println(fMax.array_max(arr_i, arr_i_size));
        //Expected output 1: 20

        //Input 2
        //If input is 
        Double arr_d[] = {2.7,3.8,5.5,6.7,9.7};
        int arr__d_size = arr_d.length;
        System.out.println(fMax.array_max(arr_d, arr__d_size));
        //Expected output 2: 9.7
    }
}

class FindMax {
    public static <T extends Comparable<T>> T array_max(T data[], int n){
        T max = data[0];

        for(int i= 1; i < n-1; i++ ){
            if(data[i+1].compareTo(max) > 0){
                max = data[i+1];
            }
        }
        return max;
    }
    
    // public static Integer array_max(Integer data[], int n) {
    //     //body of code
    //     return 0;
    // }

    // public static Double array_max(Double data[], int n) {
    //     //body of code
    //     return 0.0;
    // }
}