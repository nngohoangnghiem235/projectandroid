package com.example.final1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.example.final1.R;
import com.example.final1.DonHangFragment;
import com.example.final1.LichSuFragment;
import com.google.android.material.tabs.TabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

@SuppressWarnings("deprecation")
public class ActivityDonHangFragment extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    FragmentPagerItemAdapter adapter;
    FragmentPagerItems pages;
    Button btnTrangChu,btnDH,btnThongBao,btnTK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_don_hang_fragment);
        getSupportActionBar().hide();
        // Attach our tools with activity
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        btnTrangChu = findViewById(R.id.btnTrangChu);
        btnThongBao = findViewById(R.id.btnThongBao);
        btnTK = findViewById(R.id.btnTaiKhoan);

        btnTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDonHangFragment.this, trangchu.class);
                startActivity(intent);
            }
        });
        btnThongBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDonHangFragment.this, thongbao.class);
                startActivity(intent);
            }
        });
        btnTK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityDonHangFragment.this, canhan.class);
                startActivity(intent);
            }
        });

        // Add fragment we created to tablayout
        pages = new FragmentPagerItems(this);
        pages.add(FragmentPagerItem.of("Đang Đến", DonHangFragment.class));
        pages.add(FragmentPagerItem.of("Lịch Sử", LichSuFragment.class));

        // Set(color,height) indicator on tablayout
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#EF0d0d"));
        tabLayout.setSelectedTabIndicatorHeight((int) (5 * getResources().getDisplayMetrics().density));
        //  Set tablayout text color when it active or otherwise
        tabLayout.setTabTextColors(Color.parseColor("#000000"), Color.parseColor("#EF0D0D"));
        adapter = new FragmentPagerItemAdapter(getSupportFragmentManager(), pages);
        // Link viewpager with tablayout
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(pages.size());
        tabLayout.setupWithViewPager(viewPager);

        // Set viewpager  when is clicked tablayout item
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}