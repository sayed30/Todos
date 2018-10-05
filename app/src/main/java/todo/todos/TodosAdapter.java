package todo.todos;
import android.support.v7.widget.RecyclerView;
import android.content.Context;
import java.util.List;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.widget.TextView;
/**
 * Created by sayedhussaini on 10/3/18.
 * Class for table view
 */

public class TodosAdapter extends RecyclerView.Adapter<TodosAdapter.ViewHolder> {

    private Context context;
    private List<Todos> list;

    public TodosAdapter(Context context, List<Todos> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Todos todo = list.get(position);

        holder.textTitle.setText(todo.getTitle());
        holder.textUserId.setText(String.valueOf(todo.getUserId()));
        holder.textCompleted.setText(String.valueOf(todo.isComplete()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textTitle, textUserId, textCompleted;


            public ViewHolder(View itemView) {
                super(itemView);

                textTitle = itemView.findViewById(R.id.main_title);
                textUserId = itemView.findViewById(R.id.textUserId);
                textCompleted = itemView.findViewById(R.id.textCompleted);
            }
    }

}