import java.util.Scanner;
 public class set1{

    public static void main(String [] args){
        //set1.countTotalNegNumber();
        //set1.findMax();
        //set1.mergeSortedArray();
        //set1.integerPalindrome();
        //set1.reverseArray();
        //set1.searchElement();
        //set1.rightTriangle();
        //set1.parallelogram();
        //set1.halfDiamond();
        set1.diamond();
        
     }



/////////////////////////////////////////////////////////////////////////////////////


     // Method to count total negative numbers in the given array.
    public static void countTotalNegNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int Count = 0;
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < 0){
                Count = Count + 1;
            }
        } 
        
        System.out.println("Total Negative Number : " + Count );
    }
 

//////////////////////////////////////////////////////////////////////////////////////////////


 public static void findMax(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        } 
        int max = arr[0];
        for(int i=0;i<n;i++){
            for(int j = i+1 ;j<n ;j++){
                if(arr[j] > arr[i]){
                    max = arr[j];
                }
            }
        }
        System.out.println("greatest element in array: " + max );
        
 }
  ///////////////////////////////////////////////////////////////////////////////////


 public static void mergeSortedArray(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of 1st array: ");
    int n1 = sc.nextInt();
    int arr1[] = new int[n1];
    System.out.println("Enter array elements: ");
    for(int i=0; i<n1; i++) {
        arr1[i] = sc.nextInt();
    } 
    System.out.println("Enter the size of 2nd array: ");
    int n2 = sc.nextInt();
    int arr2[] = new int[n2];
    System.out.println("Enter array elements: ");
    for(int i=0; i<n2; i++) {
        arr2[i] = sc.nextInt();
    } 
    int n3 = n1+n2;
    int arr3[] = new int[n3];
    int i=0,j=0,k=0;


    while(i<n1 && j< n2){
        if(arr1[i] < arr2[j]){
            arr3[k] = arr1[i];
            i++; k++;
        }
        else{
            arr3[k] = arr2[j];
            j++;k++;
        }
    }

    while(i < n1){
        arr3[k] = arr1[i];
        i++;k++;
    }
    while(j <n2){
        arr3[k] = arr2[j];
        j++;k++;
    }
     System.out.println("new array:");
     for(int s = 0;s<n3;s++){
       System.out.print(arr3[s] + " ");
     }
 
   }


   /////////////////////////////////////////////////////////////////////////////////////////


   public static void integerPalindrome(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        } 
        int count = 0;
        for(int i =0;i<n/2;i++){
            if(arr[i] != arr[n-i-1]){
                count = 1;
                break;
            }
        }
        if(count == 1){
            System.out.println("Array is not a palindrome");
        }
        else{
            System.out.println("Array is a palindrome");
        }
   }


   ///////////////////////////////////////////////////////////////////////////////////

   public static void reverseArray(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        } 
        System.out.println("Reversed array:");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
   }

   ////////////////////////////////////////////////////////////////////////////////////


// search an element in array and print index of its occurance in array
   public static void searchElement(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        } 
        System.out.println("Enter the element to search: ");
        int element = sc.nextInt();
        int count =0;
         
        System.out.println("index of occurance is/are: ");
        for(int i=0;i<n;i++){
            if(arr[i] == element){
                System.out.print((i+1) + " ");
                count++;
            }
        }
        if(count == 0){
            System.out.println("Element not found in array");
        }
   }
   /////////////////////////////////////////////////////////////////////////////////////////


   // patterns
   //right triangle
   // parallelogram pattern
   //half diamond
   // diamond
   // 12345
   // 54321
   // 12345
   // 54321
   // 12345

   // 11111
   // 10001
   // 10001
   // 10001
   // 11111

   public static void rightTriangle(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
   }


   public static void parallelogram(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int c = n;
       for(int i=0;i<n;i++){
        for(int j=0;j<c-1;j++){
            System.out.print(" ");
        }
        c= c-1;
        for(int k=0;k<n;k++){
            System.out.print("*");
        }
        
        System.out.println();
       }
        }
   
   
        public static void halfDiamond(){
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int i,j;
        for (i = 0; i < n; i++) 
        { 
            for ( j = 0; j < i + 1; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        } 
      
        for ( i = 1; i < n; i++) 
        { 
            for (j = i; j < n; j++){
                System.out.print("*"); 
            }
            System.out.println(); 
        } 
        }
   
    
    public static void diamond(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i; j++) {
            System.out.print(" ");
          }
    
          for (int j = 0; j < i * 2 - 1; j++) {
            System.out.print("*");
          }
          System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
    
          for (int j = 0; j < n - i; j++) {
            System.out.print(" ");
          }
          for (int j = 0; j < i * 2 - 1; j++) {
            System.out.print("*");
          }
          System.out.println();
        }
      
    }
}
