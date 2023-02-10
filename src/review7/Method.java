package review7;

public class Method {
    void hello(){
        System.out.println("Hello");

    }
    void sayHello(String name){
        System.out.println("Hello " + name);
    }
    int findLargest(int num1,int num2){
        if (num1 > num2){
            return num1;



        }else {
            return num2;
        }
    }

    double findAverage(double d1, double d2){
        double d3 = (d1 + d2) / 2;
        return d3;
    }

    public static int minValue(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min ){
                min = arr[i];
            }
        }
        return min;
    }

    String reverceStr(String str){
        StringBuilder newStr = new StringBuilder(str);
        StringBuilder ss = newStr.reverse();
        String s = ss.toString();
        return s;

    }

    public static void main(String[] args) {
        String name = "Mohammed";
        int characters = name.length();
        Method obj = new Method();
        obj.sayHello(name);
        obj.hello();
        System.out.println(characters);
        System.out.println(obj.findLargest(100,200));
        System.out.println(obj.findAverage(3.8,5.9));

        System.out.println(obj.reverceStr("hello"));
        //System.out.println(obj.minValue());
        int[] arr = {2, 5,8,3,9};
        System.out.println(minValue(arr));

    }
}
