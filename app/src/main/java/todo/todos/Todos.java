package todo.todos;


/**
 * Created by sayedhussaini on 10/3/18.
 *  Class for Todos
 */

public class Todos {
    public String userId;
    public int id;
    public String title;
    public boolean complete;
    public int numIncomp;
    public Todos(){

    }


    public void addIncomp(){
        this.numIncomp++;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public boolean isComplete() {
        return complete;
    }


    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
