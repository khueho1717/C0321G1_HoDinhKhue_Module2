package bai15_io_text_file.thuc_hanh.tim_max_ghi_file;

import bai15_io_text_file.thuc_hanh.tinh_tong_file_text.ReadFileExample;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer>numbers){
        int max=numbers.get(0);
        for (int i=0;i<numbers.size();i++){
            if (max<numbers.get(i)){
                max=numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("bt_th_module2/src/bai15_io_text_file/thuc_hanh/tim_max_ghi_file/number.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("bt_th_module2/src/bai15_io_text_file/thuc_hanh/tim_max_ghi_file/number.txt", maxValue);
    }
}
