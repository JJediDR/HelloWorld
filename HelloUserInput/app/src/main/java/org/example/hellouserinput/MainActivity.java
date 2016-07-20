package org.example.hellouserinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView names = (RecyclerView)findViewById(R.id.NameList);

        LinearLayoutManager linearLM = new LinearLayoutManager(this);

        linearLM.setOrientation(LinearLayoutManager.VERTICAL);
        linearLM.canScrollVertically();

        names.setLayoutManager(linearLM);
    }

    public abstract static class NamesAdapter extends
            RecyclerView.Adapter<NamesAdapter.ViewHolder> {

        // Provide a direct reference to each of the views within a data item
        // Used to cache the views within the item layout for fast access
        public static class ViewHolder extends RecyclerView.ViewHolder {
            // Your holder should contain a member variable
            // for any view that will be set as you render a row
            public TextView nameTextView;


            // We also create a constructor that accepts the entire item row
            // and does the view lookups to find each subview
            public ViewHolder(View itemView) {
                // Stores the itemView in a public final member variable that can be used
                // to access the context from any ViewHolder instance.
                super(itemView);

                nameTextView = (TextView)itemView.findViewById(R.id.NameView);
            }
        }
    }

    public abstract class nameAdapter extends RecyclerView.Adapter<NamesAdapter.ViewHolder> {

        public nameAdapter(List<Attributes.Name> names) {
            names = nameArray;


        }


    }




        private TextView salut;
    private EditText name;
    public ArrayList nameArray = new ArrayList(1);






    public ArrayList Button(View v) {
        Button EnterButton = (Button) v;


        nameArray.add(name);
        salut = (TextView)findViewById(R.id.hello);
        name = (EditText)findViewById(R.id.nameInputBox);
        salut.setText(getString(R.string.Hello) + " " + name.getText());

        return nameArray;
    }



}
