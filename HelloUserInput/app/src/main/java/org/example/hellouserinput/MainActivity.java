package org.example.hellouserinput;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
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

        RecyclerView Names = (RecyclerView)findViewById(R.id.NameList);

        LinearLayoutManager llm = new LinearLayoutManager(this);

        llm.setOrientation(LinearLayoutManager.VERTICAL);
        llm.canScrollVertically();

        Names.setLayoutManager(llm);
    }

    public abstract static class NamesAdapter extends
            RecyclerView.Adapter<NamesAdapter.ViewHolder> {

        // Provide a direct reference to each of the views within a data item
        // Used to cache the views within the item layout for fast access
        public static class ViewHolder extends RecyclerView.ViewHolder {
            // Your holder should contain a member variable
            // for any view that will be set as you render a row
            public TextView NameTextView;


            // We also create a constructor that accepts the entire item row
            // and does the view lookups to find each subview
            public ViewHolder(View itemView) {
                // Stores the itemView in a public final member variable that can be used
                // to access the context from any ViewHolder instance.
                super(itemView);

                NameTextView = (TextView)itemView.findViewById(R.id.NameView);
            }
        }
    }

    public abstract class NameAdapter extends RecyclerView.Adapter<NamesAdapter.ViewHolder> {

        public NameAdapter(List<Attributes.Name> Names) {
            Names = NameArray;


        }


    }




        private TextView Salut;
    private EditText Name;
    public ArrayList NameArray = new ArrayList(1);






    public ArrayList Button(View v) {
        Button EnterButton = (Button) v;


        NameArray.add(Name);
        Salut = (TextView)findViewById(R.id.Hello);
        Name = (EditText)findViewById(R.id.Name);
        Salut.setText(getString(R.string.Hello) + " " + Name.getText());

        return NameArray;
    }



}
