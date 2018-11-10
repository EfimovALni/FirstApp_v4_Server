import com.google.gson.Gson;
import model.SecondScreenModel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import static spark.Spark.get;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SecondScreenModel modelSecond;

        get("/s", (request, response) -> "Hello from server.");


        Gson gson = new Gson();

        /** Read JSON file */
        Reader reader = new FileReader("E:\\ServerSpark\\src\\main\\java\\SecondScreen.json");

        modelSecond = gson.fromJson(reader, SecondScreenModel.class);
        get("/new", (request, response) -> modelSecond, gson::toJson);


        for (int i = 0; i < modelSecond.getButtonsMy().size(); i++) {
            System.out.println(modelSecond.getButtonsMy().get(i));
        }

    }
}

