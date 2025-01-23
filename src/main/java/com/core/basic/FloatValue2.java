package com.core.basic;

public class FloatValue2 {

        public static void main(String[] args)
        {
            float f=10.5f;
            //int a=f;
            // Compile time error
            int a=(int)f;
            System.out.println("value of f:=" +f);
            System.out.println("value of a:=" +a);
        }
}

