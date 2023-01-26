package HomeWork13;

public class Task4 {
    public static void main(String[] args) {
     /*
     How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
      */
//        String s = "This is sentence i want to reverse";
//
//        String[] words = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//
//        for (String word : words) {
//            sb.append(new StringBuilder(word).reverse().toString() + " ");
//        }
//        String output = sb.toString().trim();
//        System.out.println(output);

        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");

//        for(String word:arr){
//            for (int i =word.length()-1 ; i >=0; i--) {
//                System.out.print(word.charAt(i));
//            }
//            System.out.print(" ");
//        }


        for(String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st + " ");

        }
//        for(String word:arr){
//            System.out.print(new StringBuilder(word).reverse()+" ");
//        }



    }
}
