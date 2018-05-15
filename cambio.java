
import java.util.Arrays;
//import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author marper96
 */

public class Cambio {
    
    static int id1,id2,id3,id4,id5;
    public static void getfrq(int id){
        switch (id) {
            case 1:
                id1++;
                break;
            case 2:
                id2++;
                break;
            case 3:
                id3++;
                break;
            case 4:
                id4++;
                break;
            case 5:
                id5++;
                break;
            default:
                break;
        }
        
    }
    public static int get_value(){
        int ret =0;
        if((id1==id2 ||id1 ==id3 ||id1==id4 ||id1==id5) && id1!=0){
            ret= 1;
            
        }
        else if((id2==id3 ||id2 ==id4 ||id2==id5) &&id2!=0){
            ret= 2;
            
        }
        else if((id3==id4 ||id3 ==id5 )&& id3 !=0){
            ret= 3;
            
        }
        else if(id4==id5  && id4!=0){
            ret= 4;
            
        }
       
        return ret;
        
       
        
    }
     public static int get_value(int a){
        if(id1 ==a){
            return 1;
        }
        if(id2 ==a){
            return 2;
        }
        if(id3 ==a){
            return 3;
        }
        if(id4 ==a){
            return 4;
        }
        else{
            return 5;
        }
    }
    public static void main(String[] args) {
        //HashSet<car> Car_Sightnings =new HashSet<car>();
        Scanner in =new Scanner(System.in);
        int num =in.nextInt();
        int[] frq =new int[num];
        for (int i = 0; i < num; i++) {
            frq[i] =in.nextByte();
            getfrq(frq[i]);
            
        }
        int arr[] = {id1,id2,id3,id4,id5};
        Arrays.sort(arr);
        if(arr[4]==arr[3]){
            int k =get_value();
            System.out.println(k);
        }
        else{
            System.out.println(get_value(arr[4]));
        }
        
        
        
    }
    
        
}
    


