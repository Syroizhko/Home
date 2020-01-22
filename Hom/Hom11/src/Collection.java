import java.lang.reflect.Array;
import java.util.Arrays;

public class Collection {
    int[]arr;
    int[]arr2;


    public Collection(int[] arr,int[]arr2) {
        this.arr = arr;
        this.arr2=arr2;
    }

    Cls1 cls1=new Cls1();
    Cls2 cls2=new Cls2();

   public class Cls1  implements Iterator {

        @Override
        public void hasNext(){
            System.out.println(Arrays.toString(arr));
        }


        @Override
        public void next(){
            for (int i=0;i<arr.length;i++) {
                if (i%2==1) {
                    arr[i]=0;
                }

            }
            System.out.println(Arrays.toString(arr));

        }
   }
       public class Cls2 implements Iterator {

           @Override
           public void hasNext(){
               System.out.println("--------------");
               for (int i = arr2.length-1; i >= 0 ; i--){

                   System.out.print(arr2[i] + ", ");

               }
               System.out.println(" ");

           }


           @Override
           public void next() {
               for(int j =0; j<arr2.length;j++){
                   if(j%2==1){
                       arr2[j]= 0;
                   }
               }
               System.out.println(Arrays.toString(arr2));

           }
       }

   //}



}

