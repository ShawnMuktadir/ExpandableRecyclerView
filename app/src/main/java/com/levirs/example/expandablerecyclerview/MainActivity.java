package com.levirs.example.expandablerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> googleProduct = new ArrayList<>();
        googleProduct.add(new Product("Google AdSense"));
        googleProduct.add(new Product("Google Drive"));
        googleProduct.add(new Product("Google Mail"));
        googleProduct.add(new Product("Google Doc"));
        googleProduct.add(new Product("Android"));

        Company google = new Company("Google", googleProduct);
        companies.add(google);

        ArrayList<Product> microsoftProduct = new ArrayList<>();
        microsoftProduct.add(new Product("Windows"));
        microsoftProduct.add(new Product("SkyDrive"));
        microsoftProduct.add(new Product("Microsoft Store"));
        microsoftProduct.add(new Product("Microsoft Office"));

        Company microsoft = new Company("Microsoft", microsoftProduct);
        companies.add(microsoft);

        ProductAdapter adapter = new ProductAdapter(companies);
        recyclerView.setAdapter(adapter);
    }
}
