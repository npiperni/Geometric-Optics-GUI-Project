package optics;

import controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.MenuItems;
import view.MainView;


public class Main extends Application {
    private static Stage s;

    @Override
    public void start(Stage stage) throws Exception{
        MainView mbt = new MainView();
        MenuItems mi = new MenuItems();
        MainController mbc = new MainController(mi, mbt);

        //BorderPane bp = new BorderPane();
        //MainView mv = new MainView();

        //bp.setTop(mbt);
        //bp.setCenter(mv);

        s = stage;

        mbt.getStylesheets().add("style.css");

        stage.setTitle("Geometric Optics");
        Scene scene = new Scene(mbt, 900, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static Stage getS() {
        return s;
    }

    public static void setS(Stage s) {
        Main.s = s;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
