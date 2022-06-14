package Branches26;

public class zadachaDom26 {

	public static void main(String[] args) {
		int x1 = 12;
        int x2 = 10;
        int x3 = 8;
        int max;
        int min;
        if(x1>=x2){
            if(x2>=x3){
                max=x1;
                min=x3;
            }else{
                if(x1>=x3){
                    max=x1;
                }else{
                    max=x3;
                }
                min = x2;
            }
        }else{
            if(x2>=x3){
                if(x1>=x3){
                    min=x3;
                }else{
                    min=x1;
                }
                max=x2;
            }else{
                max=x3;
                min=x1;
            }
        }
        int sum;
        sum = min+max;
        System.out.println("Ñóììà: "+sum);
    }
}