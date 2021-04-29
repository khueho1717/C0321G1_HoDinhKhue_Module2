package bai_tap;

import java.util.Scanner;

public class Doc_so {
    //    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("mời bạn nhập số cần viết thành chữ");
//        int input=scanner.nextInt();
//        int dozens=input/10;
//        int unit=input%10;
//        System.out.println("đây là số vừa nhập: "+input);
//        if (input>=0&&input<10){
//            switch (input){
//                case 0:
//                    System.out.println(input+" : zero");
//                    break;
//                case 1:
//                    System.out.println(input+" : one");
//                    break;
//                case 2:
//                    System.out.println(input+" : two");
//                    break;
//                case 3:
//                    System.out.println(input+" : three");
//                    break;
//                case 4:
//                    System.out.println(input+" : four");
//                    break;
//                case 5:
//                    System.out.println(input+" : five");
//                    break;
//                case 6:
//                    System.out.println(input+" : six");
//                    break;
//                case 7:
//                    System.out.println(input+" : seven");
//                    break;
//                case 8:
//                    System.out.println(input+" : eight");
//                    break;
//                case 9:
//                    System.out.println(input+" : nine");
//                    break;
//            }
//        }else if (input<20){
//            switch (dozens){
//                case 1:
//                    switch (unit){
//                        case 0:
//                            System.out.println(input+" : ten");
//                            break;
//                        case 1:
//                            System.out.println(input+" : eleven");
//                            break;
//                        case 2:
//                            System.out.println(input+" : twelve");
//                            break;
//                        case 3:
//                            System.out.println(input+" : thirteen");
//                            break;
//                        case 4:
//                            System.out.println(input+" : fourteen");
//                            break;
//                        case 5:
//                            System.out.println(input+" : fifteen");
//                            break;
//                        case 6:
//                            System.out.println(input+" : sixteen");
//                            break;
//                        case 7:
//                            System.out.println(input+" : seventeen");
//                            break;
//                        case 8:
//                            System.out.println(input+" : eighteen");
//                            break;
//                        case 9:
//                            System.out.println(input+" : nineteen");
//                            break;
//                    }
//            }
//        }
//    }
//}
    public static void main(String[] args) {
        String input, result;
        do {
            System.out.println("Nhập số (tối đa 3 chữ số): ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            if (input.length() > 3 || input.length() == 0) {
                System.out.println("Vui lòng nhập số có tối đa 3 chữ số!!!");
            } else {
                break;
            }
        } while (true);
        int number = Integer.parseInt(input);
        if (number >= 100) {
            int hangTram = number / 100;
            int hangChuc = number - hangTram * 100;
            result = convertHangDonVi(hangTram) + " hundred";
            if (hangChuc != 0) {
                result += " and " + convertHangChuc(hangChuc);
            }
        } else {
            result = convertHangChuc(number);
        }
        System.out.println(result);
    }

    public static String convertHangChuc(int number) {
        String result = "";
        if (number < 10) {
            if (number == 0) {
                result = "zero";
            } else {
                result = convertHangDonVi(number);
            }
        } else if (number < 20) {
            if (number < 16 && number != 14) {
                switch (number) {
                    case 10:
                        result = "ten";
                        break;
                    case 11:
                        result = "eleven";
                        break;
                    case 12:
                        result = "twelve";
                        break;
                    case 13:
                        result = "thirteen";
                        break;
                    case 15:
                        result = "fifteen";
                        break;
                }
            } else {
                result = convertHangDonVi(number % 10) + "teen";
            }
        } else {
            switch (number / 10) {
                case 2:
                    result = "twenty " + convertHangDonVi(number % 20);
                    break;
                case 3:
                    result = "thirty " + convertHangDonVi(number % 30);
                    break;
                case 4:
                    result = "forty " + convertHangDonVi(number % 40);
                    break;
                case 5:
                    result = "fifty " + convertHangDonVi(number % 50);
                    break;
                case 6:
                    result = "sixty " + convertHangDonVi(number % 60);
                    break;
                case 7:
                    result = "seventy " + convertHangDonVi(number % 70);
                    break;
                case 8:
                    result = "eighty " + convertHangDonVi(number % 80);
                    break;
                case 9:
                    result = "ninety " + convertHangDonVi(number % 90);
                    break;
            }
        }
        return result;
    }

    public static String convertHangDonVi(int x) {
        String result;
        switch (x) {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            default:
                result = "";
        }
        return result;
    }
}