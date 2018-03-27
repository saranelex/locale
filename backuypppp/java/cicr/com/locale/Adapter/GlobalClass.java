package cicr.com.locale.Adapter;

/**
 * Created by harish on 21-02-2017.
 */

import android.app.Application;

public class GlobalClass extends Application{

    private String title;
    private String flower_leaf;


    public String getTitle() {

        return title;
    }

    public void setTitle(String aTitle) {

        title = aTitle;

    }

    public String getFlower_Leaf() {

        return flower_leaf;
    }

    public void setFlower_Leaf(String aFlower_Leaf) {

        flower_leaf = aFlower_Leaf;
    }

}