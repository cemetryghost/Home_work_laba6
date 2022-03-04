package com.company;
import java.util.Scanner;

class Home_Work{
    int x;
    int y;
    Home_Work(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void example(){
        if((y+1)!=0){
            double z = (double) (x+y)/(y+1);
            System.out.println(z);
        }
        else{
            System.out.println("Деление на ноль !");
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Число X ");
        int x = in.nextInt();
        System.out.println("Число Y");
        int y = in.nextInt();
        Home_Work exam = new Home_Work(x, y);
        exam.example();
    }
}
