package wjs.modules;
import android.widget.Toast;
import android.content.Context;
import android.webkit.JavascriptInterface;

public class ToastWithHello {
    Context contxt;
    public ToastWithHello(Context c){
        contxt = c;
    };
    @JavascriptInterface
    public void toast(String text){
        Toast.makeText(contxt,"HELLO-MODULE: "+text,Toast.LENGTH_LONG).show();
    }
}