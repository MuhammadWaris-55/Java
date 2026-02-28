// public class fib{
    
//     public static void main(String[] args){
//         int n = 10;
//         int first = 0;
//         int second = 1;

//         System.out.println("Fibonaci series");

//         for(int i = 1; i<=n; i++){
//             System.out.println(first + " ");

//             int next = first + second;
//             first = second;
//             second = next;
//         }
//     }
// }

            //OR

// public class fib{
//     public static void fabseries(int x, int y , int z){
//         int n1 = x;
//         int n2 = y;
//         int sum;
//         System.out.println(n1);
//         System.out.println(n2);
//         for(int i = 0 ; i<z ; i++){
//             sum = n1 + n2;
//             System.out.println(sum);
//             n1 = n2;
//             n2 = sum;
//         }
//     }
//     public static void main(String[] args){
//         fabseries(0 , 1 , 5);
//     }
// }


//Fibonacci with facotrial
public class fib{
    public static void fabseries(int x, int y , int z){
        int n1 = x;
        int n2 = y;
        int sum;
        System.out.println(n1);
        System.out.println(n2);
        for(int i = 0 ; i<z ; i++){
            sum = n1 + n2;
            System.out.println(sum);
            n1 = n2;
            n2 = sum;
        }
    }
    public static void Fac(int num){
        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact = fact * i;
        }

        System.out.println(fact);

    }
    public static void main(String[] args){
        fabseries(0 , 1 , 5);
        Fac(8);
    }
}