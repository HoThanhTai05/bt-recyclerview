package com.example.webmasterdotnetvn.bai13_recyclerview; // (Nhớ sửa lại package của bạn)

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.ArrayList;

// Implement interface (giống video)
public class MainActivity extends AppCompatActivity implements RecyclerViewInterface {

    ArrayList<QuocGia> listQuocGia = new ArrayList<>();
    QuocGiaAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // 1. Khởi tạo dữ liệu
        setupData();

        // 2. Khởi tạo Adapter (truyền 'this' làm listener,
        adapter = new QuocGiaAdapter(this, listQuocGia, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    // Hàm tạo dữ liệu mẫu
    private void setupData() {

        listQuocGia.add(new QuocGia("Việt Nam", "Hà Nội", R.drawable.vietnam_flag,"98 triệu dân")); // Thay 'ic_flag' bằng tên file của bạn
        listQuocGia.add(new QuocGia("Nhật Bản", "Tokyo", R.drawable.japan_flag,"125.7 triệu dân"));   // Thay 'ic_flag' bằng tên file của bạn
        listQuocGia.add(new QuocGia("Hàn Quốc", "Seoul", R.drawable.korea_flag,"51.7 triệu dân"));   // Thay 'ic_flag' bằng tên file của bạn
        listQuocGia.add(new QuocGia("Pháp", "Paris", R.drawable.france_flag,"65.6 triệu dân"));     // Thay 'ic_flag' bằng tên file của bạn
        listQuocGia.add(new QuocGia("Mỹ", "Washington, D.C.", R.drawable.usa_flag,"331.9 triệu dân"));       // Thay 'ic_flag' bằng tên file của bạn
        listQuocGia.add(new QuocGia("Anh", "London", R.drawable.england_flag,"55.9 triệu dân"));         // Thay 'ic_flag' bằng tên file của bạn
        listQuocGia.add(new QuocGia("Đức", "Berlin", R.drawable.germany_flag, "83.2 triệu dân"));
        listQuocGia.add(new QuocGia("Canada", "Ottawa", R.drawable.canada_flag, "38.2 triệu dân"));
        listQuocGia.add(new QuocGia("Úc", "Canberra", R.drawable.australia_flag, "25.7 triệu dân"));
        listQuocGia.add(new QuocGia("Thái Lan", "Bangkok", R.drawable.thailand_flag, "71.6 triệu dân"));

    }

    // Override hàm của interface
    @Override
    public void onItemClick(QuocGia quocGia) {
        // Hiển thị Toast (giống video)
        Toast.makeText(this, "Bạn đã chọn: " + quocGia.getTenQuocGia(), Toast.LENGTH_SHORT).show();
    }
}