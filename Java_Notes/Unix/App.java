import io.javalin.Javalin;
public class App {
    public static void main(String[] args) {
        Javalin app = new Javalin.create(Config -> config.plugins.enableDevLogging());
        app.get("/hello", ctx -> ctx.result("Hello World!"));
        app.start();
    }
    
}
