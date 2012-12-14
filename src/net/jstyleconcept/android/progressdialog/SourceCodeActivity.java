package net.jstyleconcept.android.progressdialog;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;

public class SourceCodeActivity extends Activity {
	private WebView sourceCodeView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_sourcecodeactivity);
		sourceCodeView=(WebView)findViewById(R.id.webView1);
		sourceCodeView.getSettings().setBuiltInZoomControls(true);
		sourceCodeView.loadUrl("file:///android_asset/sourcecode.html");
	}
}