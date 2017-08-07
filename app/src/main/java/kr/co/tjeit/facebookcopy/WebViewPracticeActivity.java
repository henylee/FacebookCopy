package kr.co.tjeit.facebookcopy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewPracticeActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_practice);
        bindViews();

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setBuiltInZoomControls(false);

        webView.loadUrl("http://m.naver.com/");
    }

    void bindViews() {
        webView = (WebView) findViewById(R.id.webView);
    }

}





