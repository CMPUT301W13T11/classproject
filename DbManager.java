
public class DbManager<V implements FView> implements FModel<V implements FView> {
  
  private Collection<V> views;

  // implement FModel methods
  public void addView(V view) {
    if (!views.contains(view)) {
      views.add(view);
    }
  }

  public void deleteView(V view) {
    views.remove(view);
  }

  public void notifyViews() {
    for (V view : views) {
      view.update(this);
    }
  }

}
