package task3;

import java.util.HashSet;
import java.util.Arrays;

interface RandomGenerator{
abstract public int random();
}

class OTPGenerator implements RandomGenerator{
public int random(){
    int randomDigit;
    HashSet<Integer> randomValue=new HashSet<Integer>();
    while(randomValue.size()<6){
        randomDigit=(int)Math.round(Math.random()*9);
        randomValue.add(randomDigit);
    }
    Object[] array=randomValue.toArray();
    String OTPValue="";
    for(int i=0;i<array.length;i++){
        OTPValue=String.valueOf(array[i])+OTPValue;
    }
     return Integer.parseInt(OTPValue);

        
}
}
class OTPProvider {
    public static RandomGenerator getRandomGenerator(){
        return new OTPGenerator();
    }
}
class task3{
public static void main(String[] args){
RandomGenerator r= OTPProvider.getRandomGenerator();
System.out.println("OTP is : "+r.random());
}
}
