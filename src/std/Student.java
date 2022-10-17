package std;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Student {



    public int[] nAusreichend(int[] grades){
            int[] ret=new int[]{};
            int j=0;
            for(int i:grades){
                if(i<40){
                    ret[j]=i;
                    j++;
                }
            }
            return ret;
    }

    public float durchschnitt(int[] grades){
        int sum=0;
        int ct=0;
        for(int i:grades){
            sum+=i;
            ct++;
        }
        return sum/ct;
    }

    public int isabg(int grade){
        int res=0;
        if(grade>=38 && (grade%5==3 || grade%5==4)){
            res=5*((grade/5)+1);
        }
        return res;
    }

    public int[] abgerundet(int[] grades){
        int[] ret=new int[]{};
        int j=0;
        for(int i:grades){
            if(isabg(i)!=0){
                ret[j]=i;
                j++;
            }
        }
        return ret;
    }

    public int maxi(int[] grades){
        int[] ret=abgerundet(grades);
        int max=-1;
        for(int k:ret){
            if(k>max)
                max=k;
        }
        return max;
    }
}
