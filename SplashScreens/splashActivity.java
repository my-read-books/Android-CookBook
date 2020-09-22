public class SplashScreen extends Activity {
	private long ms=0;
	private long splashTime=2000;
	private boolean splashActive = true;
	private boolean paused=false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		Thread mythread = new Thread() {
			public void run() {
				try {
					while (splashActive && ms < splashTime) {
						if(!paused)
							ms=ms+100;
						sleep(100);
			}
			} catch(Exception e) {}
			finally {
				Intent intent = new Intent(SplashScreen.this, Main.class);
				startActivity(intent);
			}
			}
		};
		
		mythread.start();
	}
}
/* Also add to this activity in AndroidManifest attribute android:noHistory="true" so that this Activity will not appear
in the history stack, meaning if the user uses the Back button from the main app he
will go to the expected Home screen, not back into your splash screen */