package cicr.com.locale.Adapter;

/**
 * Created by harish on 01-12-2016.
 */

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import cicr.com.locale.Gallary.ImageItem;
import cicr.com.locale.R;


public class GalleryImageAdapter extends BaseAdapter
{
    private Context mContext;
    String mtitle;



    public GalleryImageAdapter(Context context, String title)
    {
        mtitle = title;
        mContext = context;
    }

    public int getCount() {
        Integer len = null;
        if(mtitle.contains("ap")){
            len = ap.length;
        }else if(mtitle.contains("wf")){
            len = wf.length;
        }else if(mtitle.contains("ja")){
            len = ja.length;
        }else if(mtitle.contains("bw")){
            len = bw.length;
        }else if(mtitle.contains("pb")){
            len = pb.length;
        }else if(mtitle.contains("ea")){
            len = ea.length;
        }else if(mtitle.contains("th")){
            len = th.length;
        }else if(mtitle.contains("sp")){
            len = sp.length;
        }

//        if(mtitle.equals("f1ap3")) {
//            len = f1ap3.length;
//            //return mImageIds.length;
//        }else  if(mtitle.equals("f2ap4")){
//            len = f2ap4.length;
//        }else  if(mtitle.equals("l1ap1")){
//            len = l1ap1.length;
//        }else  if(mtitle.equals("l2ap5")){
//            len = l2ap5.length;
//        }else  if(mtitle.equals("l3ap6")){
//            len = l3ap6.length;
//        }else  if(mtitle.equals("l9ja1")){
//            len = l9ja1.length;
//        }else  if(mtitle.equals("l10ja2")){
//            len = l10ja2.length;
//        }else  if(mtitle.equals("l11ja3")){
//            len = l11ja3.length;
//        }else  if(mtitle.equals("l12ja4")){
//            len = l12ja4.length;
//        }else  if(mtitle.equals("l13ja5")){
//            len = l13ja5.length;
//        }else  if(mtitle.equals("l4wf1")){
//            len = l4wf1.length;
//        }else  if(mtitle.equals("l5wf2")){
//            len = l5wf2.length;
//        }else  if(mtitle.equals("l6wf3")){
//            len = l6wf3.length;
//        }else  if(mtitle.equals("l7wf4")){
//            len = l7wf4.length;
//        }else  if(mtitle.equals("l8wf5")){
//            len = l8wf5.length;
//        }
//        else {
//            len = mImageIds.length;
//        }
        return len;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }


    // Override this method according to your need
    public View getView(int index, View view, ViewGroup viewGroup)
    {
        // TODO Auto-generated method stub
        ImageView i = new ImageView(mContext);
       // i.setImageResource(Flower_Image_1[index]);

        if(mtitle.contains("ap")){
            i.setImageResource(ap[index]);
        } else if(mtitle.contains("wf")){
            i.setImageResource(wf[index]);
        }else if(mtitle.contains("ja")){
            i.setImageResource(ja[index]);
        }else if(mtitle.contains("bw")){
            i.setImageResource(bw[index]);
        }else if(mtitle.contains("pb")){
            i.setImageResource(pb[index]);
        }else if(mtitle.contains("ea")){
            i.setImageResource(ea[index]);
        }else if(mtitle.contains("th")){
            i.setImageResource(th[index]);
        }else if(mtitle.contains("sp")){
            i.setImageResource(sp[index]);
        }

       /* if(mtitle.equals("f1ap3")){
            i.setImageResource(f1ap3[index]);
        }else  if(mtitle.equals("f2ap4")){
            i.setImageResource(f2ap4[index]);
        }else  if(mtitle.equals("l1ap1")){
            i.setImageResource(l1ap1[index]);
        }else  if(mtitle.equals("l2ap5")){
            i.setImageResource(l2ap5[index]);
        }else  if(mtitle.equals("l3ap6")){
            i.setImageResource(l3ap6[index]);
        }else  if(mtitle.equals("l9ja1")){
            i.setImageResource(l9ja1[index]);
        }else  if(mtitle.equals("l10ja2")){
            i.setImageResource(l10ja2[index]);
        }else  if(mtitle.equals("l11ja3")){
            i.setImageResource(l11ja3[index]);
        }else  if(mtitle.equals("l12ja4")){
            i.setImageResource(l12ja4[index]);
        }else  if(mtitle.equals("l13ja5")){
            i.setImageResource(l13ja5[index]);
        }else  if(mtitle.equals("l4wf1")){
            i.setImageResource(l4wf1[index]);
        }else  if(mtitle.equals("l5wf2")){
            i.setImageResource(l5wf2[index]);
        }else  if(mtitle.equals("l6wf3")){
            i.setImageResource(l6wf3[index]);
        }else  if(mtitle.equals("l7wf4")){
            i.setImageResource(l7wf4[index]);
        }else  if(mtitle.equals("l8wf5")){
            i.setImageResource(l8wf5[index]);
        }
        else  if(mtitle.equals("b5ab7")){
            i.setImageResource(b5ab7[index]);
        }else  if(mtitle.equals("b6ab8")){
            i.setImageResource(b6ab8[index]);
        }else  if(mtitle.equals("b7ab9")){
            i.setImageResource(b7ab9[index]);
        }else  if(mtitle.equals("b8ab10")){
            i.setImageResource(b8ab10[index]);
        }else  if(mtitle.equals("f3ab1")){
            i.setImageResource(f3ab1[index]);
        }else  if(mtitle.equals("f4ab2")){
        i.setImageResource(f4ab2[index]);
    }else  if(mtitle.equals("f5ab3")){
        i.setImageResource(f5ab3[index]);
    }else  if(mtitle.equals("f6ab4")){
        i.setImageResource(f6ab4[index]);
    }else  if(mtitle.equals("f7ab5")){
        i.setImageResource(f7ab5[index]);
    }else  if(mtitle.equals("f8ab6")){
            i.setImageResource(f8ab6[index]);
        } */
//        else {
//            i.setImageResource(mImageIds[index]);
//        }

       i.setLayoutParams(new Gallery.LayoutParams(200, 200));

     i.setScaleType(ImageView.ScaleType.FIT_XY);




        return i;
    }



    public Integer[] ap = {
            R.drawable.b14ap7,
            R.drawable.f1ap3,
            R.drawable.f2ap4,
            R.drawable.l1ap1,
            R.drawable.l2ap5,
            R.drawable.l3ap6,
            R.drawable.l17ap8,
            R.drawable.s1ap2,
            R.drawable.s4ap9
    },wf = {
            R.drawable.l4wf1,
            R.drawable.l5wf2,
            R.drawable.l6wf3,
            R.drawable.l7wf4,
            R.drawable.l8wf5,
            R.drawable.l14wf6,
            R.drawable.l15wf7
    },ja = {
            R.drawable.l9ja1,
            R.drawable.l10ja2,
            R.drawable.l11ja3,
            R.drawable.l12ja4,
            R.drawable.l13ja5,
            R.drawable.l16ja6
    },bw = {
            R.drawable.b5bw7,
            R.drawable.b6bw8,
            R.drawable.b7bw9,
            R.drawable.b8bw10,
            R.drawable.f3bw1,
            R.drawable.f4bw2,
            R.drawable.f5bw3,
            R.drawable.f6bw4,
            R.drawable.f7bw5,
            R.drawable.f8bw6,
            R.drawable.l30bw11,
            R.drawable.l31bw12
    }, pb= {
            R.drawable.b9pb2,
            R.drawable.b10pb4,
            R.drawable.b11pb5,
            R.drawable.b12pb6,
            R.drawable.b13pb8,
            R.drawable.b19pb9,
            R.drawable.f9pb1,
            R.drawable.f10pb3,
            R.drawable.f11pb7

    },ea= {
            R.drawable.b15ea4,
            R.drawable.b16ea6,
            R.drawable.b17ea7,
            R.drawable.f12ea2,
            R.drawable.f13ea3,
            R.drawable.l25ea5,
            R.drawable.s6ea1
    },sp= {
            R.drawable.f14sp8,
            R.drawable.l18sp1,
            R.drawable.l19sp2,
            R.drawable.l20sp3,
            R.drawable.l21sp4,
            R.drawable.l22sp5,
            R.drawable.l23sp6,
            R.drawable.l24sp7

    },th = {
            R.drawable.l26th1,
            R.drawable.l27th2,
            R.drawable.l28th3,
            R.drawable.l29th4,
            R.drawable.l32th5,
            R.drawable.l33th6
    };
//
//            f1ap3 = {
//            R.drawable.f2ap4,
//            R.drawable.f1ap3,
//            R.drawable.l1ap1,
//            R.drawable.l2ap5,
//            R.drawable.l3ap6
//
//    },f2ap4={
//            R.drawable.f2ap4,
//            R.drawable.f1ap3,
//            R.drawable.l1ap1,
//            R.drawable.l2ap5,
//            R.drawable.l3ap6
//    },l2ap5= {
//            R.drawable.f2ap4,
//            R.drawable.f1ap3,
//            R.drawable.l1ap1,
//            R.drawable.l2ap5,
//            R.drawable.l3ap6
//    },l3ap6= {
//            R.drawable.f2ap4,
//            R.drawable.f1ap3,
//            R.drawable.l1ap1,
//            R.drawable.l2ap5,
//            R.drawable.l3ap6
//    },l1ap1= {
//            R.drawable.f2ap4,
//            R.drawable.f1ap3,
//            R.drawable.l1ap1,
//            R.drawable.l2ap5,
//            R.drawable.l3ap6
//    },l9ja1={
//                    R.drawable.l9ja1,
//                    R.drawable.l10ja2,
//                    R.drawable.l11ja3,
//                    R.drawable.l12ja4,
//                    R.drawable.l13ja5
//
//
//    },l10ja2={
//            R.drawable.l10ja2,
//            R.drawable.l9ja1,
//            R.drawable.l11ja3,
//            R.drawable.l12ja4,
//            R.drawable.l13ja5
//
//    },l11ja3={
//            R.drawable.l10ja2,
//            R.drawable.l9ja1,
//            R.drawable.l11ja3,
//            R.drawable.l12ja4,
//            R.drawable.l13ja5
//
//    },l12ja4={
//            R.drawable.l10ja2,
//            R.drawable.l9ja1,
//            R.drawable.l11ja3,
//            R.drawable.l12ja4,
//            R.drawable.l13ja5
//
//    },l13ja5={
//            R.drawable.l10ja2,
//            R.drawable.l9ja1,
//            R.drawable.l11ja3,
//            R.drawable.l12ja4,
//            R.drawable.l13ja5
//
//    },l4wf1={
//            R.drawable.l4wf1,
//            R.drawable.l5wf2,
//            R.drawable.l6wf3,
//            R.drawable.l7wf4,
//            R.drawable.l8wf5
//
//    },l5wf2={
//            R.drawable.l4wf1,
//            R.drawable.l5wf2,
//            R.drawable.l6wf3,
//            R.drawable.l7wf4,
//            R.drawable.l8wf5
//
//    },l6wf3={
//            R.drawable.l4wf1,
//            R.drawable.l5wf2,
//            R.drawable.l6wf3,
//            R.drawable.l7wf4,
//            R.drawable.l8wf5
//
//    },l7wf4={
//            R.drawable.l4wf1,
//            R.drawable.l5wf2,
//            R.drawable.l6wf3,
//            R.drawable.l7wf4,
//            R.drawable.l8wf5
//    },l8wf5={
//            R.drawable.l4wf1,
//            R.drawable.l5wf2,
//            R.drawable.l6wf3,
//            R.drawable.l7wf4,
//            R.drawable.l8wf5




}