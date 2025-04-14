# guidelines
Repository for JPMS guideline docs and examples

## ServiceLoader
One needs to use the `ServiceLoader.load` method that takes a ModuleLayer:

```java
ServiceLoader<IService> handlers = ServiceLoader.load(IService.class.getModule().getLayer(), IService.class);
```

## JavaFX

### Launching a JavaFX application
To launch a JavaFX application, one needs to use the `Application.launch` method that takes a the `javafx.application.Application` class to launch:

```java
import javafx.application.Application;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(App.class, args);
    }
}
```

### Loading an FXML file 
Don't rely on the FXMLLoader having the correct context ClassLoader set when calling load. Instead, set the FXMLLoader ClassLoader explicitly:
```java
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.net.URL;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        URL location = getClass().getResource("app.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(location);
        fxmlLoader.setClassLoader(getClass().getClassLoader());
        HBox hbox = fxmlLoader.load();
        Scene scene = new Scene(hbox);
        stage.setScene(scene);
        stage.setTitle("App");
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(App.class, args);
    }
}
```