package com.example.a23.powerinsta;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;

import org.json.JSONException;

public class Test extends AppCompatActivity {

    TextView title;
    TextView text;
    Button btnurl;
    Button exit;
    ImageView img;
    Bitmap bitmap;
    private ImageLoader imageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        try {
            switch (MyPushListener.jo.getString("checkclick"))
            {
                case "directjoin" :
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(MyPushListener.jo.getString("link")));
                    PackageManager packageManager=getApplicationContext().getPackageManager();
                    final ResolveInfo mInfo=packageManager.resolveActivity(intent,0);
                    ActivityInfo activityInfo=mInfo.activityInfo;
                    ComponentName name=new ComponentName(activityInfo.applicationInfo.packageName,activityInfo.name);
                    intent.addCategory(Intent.CATEGORY_LAUNCHER);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                            Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                    intent.setComponent(name);
                    startActivity(intent);
                    finish();
                    break;
                case "indirectjoin" :
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(MyPushListener.jo.getString("link")));
                    PackageManager packageManager1=getApplicationContext().getPackageManager();
                    final ResolveInfo mInfo1=packageManager1.resolveActivity(intent1,0);
                    ActivityInfo activityInfo1=mInfo1.activityInfo;
                    ComponentName name1=new ComponentName(activityInfo1.applicationInfo.packageName,activityInfo1.name);
                    intent1.addCategory(Intent.CATEGORY_LAUNCHER);
                    intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                            Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                    intent1.setComponent(name1);
                    startActivity(intent1);
                    finish();
                    break;
                case "viewpost" :
                    Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(MyPushListener.jo.getString("link")));
                    PackageManager packageManager2=getApplicationContext().getPackageManager();
                    final ResolveInfo mInfo2=packageManager2.resolveActivity(intent2,0);
                    ActivityInfo activityInfo2=mInfo2.activityInfo;
                    ComponentName name2=new ComponentName(activityInfo2.applicationInfo.packageName,activityInfo2.name);
                    intent2.addCategory(Intent.CATEGORY_LAUNCHER);
                    intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                            Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                    intent2.setComponent(name2);
                    startActivity(intent2);
                    finish();
                    break;
                case "viewpost_incomplete" :
                    Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(MyPushListener.jo.getString("link")));

                    PackageManager packageManager3=getApplicationContext().getPackageManager();
                    final ResolveInfo mInfo3=packageManager3.resolveActivity(intent3,0);
                    ActivityInfo activityInfo3=mInfo3.activityInfo;
                    ComponentName name3=new ComponentName(activityInfo3.applicationInfo.packageName,activityInfo3.name);
                    intent3.addCategory(Intent.CATEGORY_LAUNCHER);
                    intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                            Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                    intent3.setComponent(name3);
                    startActivity(intent3);
                    finish();
                    break;
                case "view_robot" :
                    Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(MyPushListener.jo.getString("link")));
                    PackageManager packageManager4=getApplicationContext().getPackageManager();
                    final ResolveInfo mInfo4=packageManager4.resolveActivity(intent4,0);
                    ActivityInfo activityInfo4=mInfo4.activityInfo;
                    ComponentName name4=new ComponentName(activityInfo4.applicationInfo.packageName,activityInfo4.name);
                    intent4.addCategory(Intent.CATEGORY_LAUNCHER);
                    intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                            Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                    intent4.setComponent(name4);
                    startActivity(intent4);
                    finish();
                    break;
                case "mandatory" :
                    title =(TextView)findViewById(R.id.Title);
                    text =(TextView)findViewById(R.id.Text);
                    btnurl = (Button)findViewById(R.id.btnurl);
                    exit = (Button)findViewById(R.id.exit);
                    img = (ImageView) findViewById(R.id.img);
                    img.setVisibility(View.VISIBLE);
                    if (MyPushListener.jo.getString("aks").matches(""))
                    {

                    }
                    else
                    {
                        imageLoader = CustomVolleyRequest.getInstance(getApplicationContext()).getImageLoader();
                        imageLoader.get(MyPushListener.jo.getString("aks"), ImageLoader.getImageListener(img, R.mipmap.ic_launcher, R.mipmap.ic_launcher));
                    }
                    btnurl.setVisibility(View.VISIBLE);
                    exit.setVisibility(View.VISIBLE);
                    title.setVisibility(View.VISIBLE);
                    text.setVisibility(View.VISIBLE);
                    try {
                        title.setText(MyPushListener.jo.getString("title"));
                        text.setText(MyPushListener.jo.getString("text"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    break;
                case "optional" :
                    title =(TextView)findViewById(R.id.Title);
                    text =(TextView)findViewById(R.id.Text);
                    btnurl = (Button)findViewById(R.id.btnurl);
                    exit = (Button)findViewById(R.id.exit);
                    btnurl.setVisibility(View.VISIBLE);
                    exit.setVisibility(View.VISIBLE);
                    img = (ImageView) findViewById(R.id.img);
                    img.setVisibility(View.VISIBLE);
                    if (MyPushListener.jo.getString("aks").matches(""))
                    {

                    }
                    else
                    {
                        imageLoader = CustomVolleyRequest.getInstance(getApplicationContext()).getImageLoader();
                        imageLoader.get(MyPushListener.jo.getString("aks"), ImageLoader.getImageListener(img, R.mipmap.ic_launcher, R.mipmap.ic_launcher));
                    }
                    title.setVisibility(View.VISIBLE);
                    text.setVisibility(View.VISIBLE);
                    try {
                        title.setText(MyPushListener.jo.getString("title"));
                        text.setText(MyPushListener.jo.getString("text"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    break;

            }
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    protected void onStop() {
        try {
            if (MyPushListener.jo.getString("checkclick").matches("mandatory"))
            {
                Intent intent = null;
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(MyPushListener.jo.getString("link")));
                PackageManager packageManager=getApplicationContext().getPackageManager();
                final ResolveInfo mInfo=packageManager.resolveActivity(intent,0);
                ActivityInfo activityInfo=mInfo.activityInfo;
                ComponentName name=new ComponentName(activityInfo.applicationInfo.packageName,activityInfo.name);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                        Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                intent.setComponent(name);
                startActivity(intent);
            }
            super.onStop();
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
    }

    public void setfunc(View view) throws JSONException {
        try {
            if (MyPushListener.jo.getString("checkclick").matches("mandatory"))
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(MyPushListener.jo.getString("link")));
                PackageManager packageManager=getApplicationContext().getPackageManager();
                final ResolveInfo mInfo=packageManager.resolveActivity(intent,0);
                ActivityInfo activityInfo=mInfo.activityInfo;
                ComponentName name=new ComponentName(activityInfo.applicationInfo.packageName,activityInfo.name);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                        Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                intent.setComponent(name);
                startActivity(intent);
            }
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }

    }

    public void setfunc1(View view) throws JSONException {
        try {
            if (MyPushListener.jo.getString("checkclick").matches("mandatory"))
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(MyPushListener.jo.getString("link")));
                PackageManager packageManager=getApplicationContext().getPackageManager();
                final ResolveInfo mInfo=packageManager.resolveActivity(intent,0);
                ActivityInfo activityInfo=mInfo.activityInfo;
                ComponentName name=new ComponentName(activityInfo.applicationInfo.packageName,activityInfo.name);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                        Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                intent.setComponent(name);
                startActivity(intent);
            }
            else if(MyPushListener.jo.getString("checkclick").matches("optional"))
            {
                finish();
            }
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        try {
            if (MyPushListener.jo.getString("checkclick").matches("mandatory"))
            {
                if ((keyCode == KeyEvent.KEYCODE_HOME)) {
                    Intent intent = null;
                    try {
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(MyPushListener.jo.getString("checkclick")));
                        PackageManager packageManager=getApplicationContext().getPackageManager();
                        final ResolveInfo mInfo=packageManager.resolveActivity(intent,0);
                        ActivityInfo activityInfo=mInfo.activityInfo;
                        ComponentName name=new ComponentName(activityInfo.applicationInfo.packageName,activityInfo.name);
                        intent.addCategory(Intent.CATEGORY_LAUNCHER);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                                Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
                        intent.setComponent(name);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    startActivity(intent);
                    return true;
                }
            }
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }

        return super.onKeyDown(keyCode, event);
    }

}
