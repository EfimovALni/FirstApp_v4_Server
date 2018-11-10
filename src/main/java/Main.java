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

/** C.1. Start. Only for testing */
        System.out.println("\n*** Spinner ***");
        System.out.println(modelSecond.getSpinnerMy().getPromptMy());
        for (int i = 0; i < modelSecond.getSpinnerMy().getItemsMy().size(); i++) {
            System.out.println(i + ". " + modelSecond.getSpinnerMy().getItemsMy().get(i).getItemMy());
        }

        System.out.println("\n*** Texts ***");
        for (int i = 0; i < modelSecond.getTextsMy().size(); i++) {
            System.out.println(i + ". " + modelSecond.getTextsMy().get(i).getText());
        }

        System.out.println("\n*** Checkbox ***");
        for (int i = 0; i < modelSecond.getCheckboxMy().size(); i++) {
            System.out.println(i + ". " + modelSecond.getCheckboxMy().get(i).getText());
        }

        System.out.println("\n*** Buttons ***");
        for (int i = 0; i < modelSecond.getButtonsMy().size(); i++) {
            System.out.println(i + ". " + modelSecond.getButtonsMy().get(i).getText());
        }
/** C.1. End. Only for testing */
    }
}

