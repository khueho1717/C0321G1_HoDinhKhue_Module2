package bai15_io_text_file.bai_tap.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    // Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";

    // CSV file header
    private static final String FILE_HEADER = "id,code,name";

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "bt_th_module2/src/bai15_io_text_file/bai_tap/read_file_csv/contries.csv";
        writeCsvFile(fileName);
    }

    public static void writeCsvFile(String fileName) throws FileNotFoundException {
        // Create new Countrys objects
        Country country1 = new Country(1, "US", "United States");
        Country country2 = new Country(2, "VN", "Viet Nam");
        Country country3 = new Country(3, "AU", "Australia");
        Country country4 = new Country(4, "CN", "China");
        Country country5 = new Country(5, "JP", "Japan");
        Country country6 = new Country(6, "CN", "China");
        Country country7 = new Country(7, "JP", "Japan");
        Country country8 = new Country(8, "TL", "Thailand");


        List<Country> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);
        countries.add(country5);
        countries.add(country6);
        countries.add(country7);
        countries.add(country8);

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);

            // Write the CSV file header
            fileWriter.append(FILE_HEADER);

            // Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            // Write a new Country object list to the CSV file
            for (Country country : countries) {
                fileWriter.append(String.valueOf(country.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getCode());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getName());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
//        String url = "bt_th_module2/src/bai15_io_text_file/bai_tap/read_file_csv/contries.csv";
//
//        // Đọc dữ liệu từ File với File và FileReader
//        File file = new File(url);
//        BufferedReader reader = new BufferedReader(new FileReader(file));
//
//        try {
//            String line = reader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = reader.readLine();
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Main.class.getName())
//                    .log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(Main.class.getName())
//                    .log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                reader.close();
//                // file.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Main.class.getName())
//                        .log(Level.SEVERE, null, ex);
//            }
//        }
    }
}
