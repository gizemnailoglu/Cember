package  com.company;
import java.lang.Math;
public class Cember{


     public  Cember (){


     }

         double yaricap ;

        double alan(double yaricap){

            double alan= Math.PI*yaricap*yaricap;
            return alan;
        }

        double yaricap(double alan){
            this.yaricap=yaricap;
            return  yaricap;
        }



}