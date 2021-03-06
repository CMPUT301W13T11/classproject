
public class RecipeApplication extends Application {

  // Singleton Database Model
  transient private static DbManager db = null;

  public static DbManager getDbManager() {
    if (db == null) {
      db = new DbManager();
    }
    return db;
  }

  // Singleton ServerClient Model
  transient private static ServerClient client = null;

  public static ServerClient getServerClient() {
    if (client == null) {
      client = new ServerClient();
    }
    return client;
  }

  // Singleton Database Controller
  transient private static DbController dbController = null;

  public static DbController getDbController() {
    if (dbController == null) {
      dbController = new dbController();
    }
    return dbController;
  }

  // Singleton Client Controller
  transient private static ClientController clientController = null;

  public static ClientController getClientController() {
    if (clientController == null) {
      clientController = new ClientController();
    }
    return clientController;
  }

  @Override
  public void onCreate() {
    super.onCreate();
  }

}
