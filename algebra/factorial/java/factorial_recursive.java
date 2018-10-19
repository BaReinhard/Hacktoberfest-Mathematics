// Author: Brett Reinhard
import java.rmi.server.ExportException;

public class Mathematics {
    public static long factorial(long number){
        if(number ==1 ){
            return 1;
        }else{
            return number * factorial(number-1);
        }
    }

}

