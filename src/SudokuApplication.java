import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class SudokuApplication extends Application{
    private IUerInterfaceContract.View uiImp1;
    @Override
    public void start(Stage primaryStage) throws Exception{

        uiImp1 = new UserInterfaceImpl(primaryStage);
        try{
            SduokuBuildLogic.build(uiImp1);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
       /* Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
    }
    public static void main(String[] args) {
        lauch(args);
    }
}