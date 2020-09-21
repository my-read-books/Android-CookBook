public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		this.registerReceiver(this.myBatteryReceiver,
		new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
	/** Intent.ACTION_BATTERY_CHANGED can be replaced with
	* Intent.ACTION_BATTERY_LOW for receiving
	* a message only when battery level is low rather than sending
	* a broadcast message every time battery level changes.
	* There is also ACTION_BATTERY_OK for when the battery
	* has been charged a certain amount above the level that
	* would trigger the low condition.
	*/
	}
	
	private BroadcastReceiver myBatteryReceiver =
	new BroadcastReceiver() {
		@Override
		public void onReceive(Context ctx, Intent intent) {
			// bLevel is battery percent-full as an integer
			int bLevel = intent.getIntExtra("level", 0);
			Log.i("BatteryMon", "Level now " + bLevel);
		}
	};
}