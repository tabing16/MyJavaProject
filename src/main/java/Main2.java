public class Main2 {
    public static void main(String[] args) {
        int a[] = new int[5];

        a[0] = 10;
        a[1] = 11;
        a[2] = 14;
        a[3] = 15;
        a[4] = 16;

//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

//        for (int i:a){
//            System.out.println(i);
//        }
        printArray(a);
    }

    public static void printArray(int[] arr){
        for(int i:arr){
            System.out.println(i);
        }
    }
}
