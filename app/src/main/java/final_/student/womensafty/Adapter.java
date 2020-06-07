package final_.student.womensafty;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.myview> {
    @NonNull
    @Override
    public myview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myview( LayoutInflater.from(parent.getContext()).inflate(R.layout.designview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull myview holder, int position) {
        holder.msg.setText(constants.dataList.get(position).msg);
        holder.date.setText(constants.dataList.get(position).date);
    }

    @Override
    public int getItemCount() {
        return constants.dataList.size();
    }

    public class myview extends RecyclerView.ViewHolder {
        TextView msg,date;
        public myview(@NonNull View itemView) {
            super(itemView);
            msg=itemView.findViewById(R.id.msg);
            date=itemView.findViewById(R.id.date);
        }
    }
}
