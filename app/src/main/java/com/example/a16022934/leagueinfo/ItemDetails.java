package com.example.a16022934.leagueinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetails extends AppCompatActivity {

    ImageView ivItemImage;
    TextView tvItemName;
    TextView tvItemDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
        ivItemImage = findViewById(R.id.ivItemImage);
        tvItemName = findViewById(R.id.tvItemName);
        tvItemDesc = findViewById(R.id.tvItemDetails);

        Items selectedItem = (Items) getIntent().getSerializableExtra("item");
        ivItemImage.setImageResource(selectedItem.getRes());
        String nameArea = selectedItem.getName() + "\nCost: " + selectedItem.getCost();
        tvItemName.setText(nameArea);
        String desc = "";
        for (int i = 0; i < selectedItem.getStats().length; i++){
            desc = desc + selectedItem.getStats()[i] + "\n";
        }
        desc = desc + "\n";
        for (int i = 0; i < selectedItem.getPassiveAndActives().length; i++){
            desc = desc + selectedItem.getPassiveAndActives()[i] + "\n";
        }
        tvItemDesc.setText(desc);

    }
}
