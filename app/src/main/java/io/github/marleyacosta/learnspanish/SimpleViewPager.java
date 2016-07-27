package io.github.marleyacosta.learnspanish;

/**
 * Created by maurely on 7/15/16.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleViewPager extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "NUMBERS", "FAMILY", "COLORS","PHRASES" };

    private Context context;

    public SimpleViewPager(FragmentManager fm,Context  context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyFragment();
        } else if(position == 2){
            return new ColorsFragment();
        }
        else{
            return new PhrasesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }


    @Override
    public int getCount() {
        return 4;
    }
}



