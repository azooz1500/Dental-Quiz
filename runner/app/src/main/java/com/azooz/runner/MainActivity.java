package com.azooz.runner;
import android.app.*;import android.os.*;import android.webkit.*;import android.view.*;
public class MainActivity extends Activity{
 public void onCreate(Bundle b){super.onCreate(b);getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);WebView w=new WebView(this);setContentView(w);WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setAllowFileAccess(true);w.setWebViewClient(new WebViewClient());w.loadUrl("file:///android_asset/index.html");}
}