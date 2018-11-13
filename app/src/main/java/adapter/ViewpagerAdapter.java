package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.ViewPager_Fragment;


/**
 * Created by wolfsoft4 on 10/8/18.
 */

public class ViewpagerAdapter extends FragmentStatePagerAdapter {
    public ViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)

        {
            case 0:
                ViewPager_Fragment tab1=new ViewPager_Fragment();
                return tab1;

            case 1:
                ViewPager_Fragment tab2=new ViewPager_Fragment();
                return tab2;

            case  2:
                ViewPager_Fragment tab3=new ViewPager_Fragment();
                return tab3;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
