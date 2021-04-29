package bai_tap;

import java.util.Scanner;

public class Doc_so {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập số cần viết thành chữ");
        int input=scanner.nextInt();
        int dozens=input/10;
        int unit=input%10;
        System.out.println("đây là số vừa nhập: "+input);
        if (input>=0&&input<10){
            switch (input){
                case 0:
                    System.out.println(input+" : zero");
                    break;
                case 1:
                    System.out.println(input+" : one");
                    break;
                case 2:
                    System.out.println(input+" : two");
                    break;
                case 3:
                    System.out.println(input+" : three");
                    break;
                case 4:
                    System.out.println(input+" : four");
                    break;
                case 5:
                    System.out.println(input+" : five");
                    break;
                case 6:
                    System.out.println(input+" : six");
                    break;
                case 7:
                    System.out.println(input+" : seven");
                    break;
                case 8:
                    System.out.println(input+" : eight");
                    break;
                case 9:
                    System.out.println(input+" : nine");
                    break;
            }
        }else if (input<20){
            switch (dozens){
                case 1:
                    switch (unit){
                        case 0:
                            System.out.println(input+" : ten");
                            break;
                        case 1:
                            System.out.println(input+" : eleven");
                            break;
                        case 2:
                            System.out.println(input+" : twelve");
                            break;
                        case 3:
                            System.out.println(input+" : thirteen");
                            break;
                        case 4:
                            System.out.println(input+" : fourteen");
                            break;
                        case 5:
                            System.out.println(input+" : fifteen");
                            break;
                        case 6:
                            System.out.println(input+" : sixteen");
                            break;
                        case 7:
                            System.out.println(input+" : seventeen");
                            break;
                        case 8:
                            System.out.println(input+" : eighteen");
                            break;
                        case 9:
                            System.out.println(input+" : nineteen");
                            break;
                    }
            }
        }
    }
}
