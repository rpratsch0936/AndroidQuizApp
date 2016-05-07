package com.example.regina.myapp;

/**
 * Created by Regina on 11/24/2015.
 */


    import com.viewpagerindicator.IconPagerAdapter;

    import android.support.v4.app.Fragment;
    import android.support.v4.app.FragmentManager;
    import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter implements IconPagerAdapter{

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getIconResId(int index) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Fragment getItem(int position) {
        // TODO Auto-generated method stub
        Fragment fragment = new Slide1();
        switch(position){
            case 0:
                fragment = new Slide1();
                break;
            case 1:
                fragment = new Slide2();
                break;
            case 2:
               fragment = new Slide3();
                break;
            case 3:
                fragment = new Slide4();
                break;
            case 4:
                fragment = new Slide5();
                break;
            case 5:
                fragment = new FinalPage();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position){
        String title = "";
        switch(position){
            case 0:
                title = "Question 1";
                break;
            case 1:
                title = "Question 2";
                break;
            case 2:
                title = "Question 3";
                break;
            case 3:
                title = "Question 4";
                break;
            case 4:
                title = "Question 5";
                break;
            case 5:
                title = "Submit Quiz";
                break;
        }
        return title;
    }

}


