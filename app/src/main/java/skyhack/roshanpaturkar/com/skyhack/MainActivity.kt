package skyhack.roshanpaturkar.com.skyhack

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.settings.javaScriptEnabled = true

        Toast.makeText(this, "Loading environment....!", Toast.LENGTH_LONG).show()

        webView.webViewClient = object: WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                return false
            }
        }
//        webView.loadUrl("http://skyproject5.000webhostapp.com/")
//        webView.loadUrl("https://vipin2mankar.000webhostapp.com/final/login.php")
//        webView.loadUrl("https://iitcafu.000webhostapp.com/login.php")
        webView.loadUrl("https://airqualilty1.000webhostapp.com/login.php")
    }

    override fun onBackPressed() {
        if(webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
