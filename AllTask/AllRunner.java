class AllRunner{
	public static void main(String[] values){
		Printer.status();
		Printer.readytoprint();
		Speaker.status();
		Speaker.songs();
		SpeakerRunner.playing();
		Camera.status();
		Camera.rolling();
		CameraRunner.action();
	}

}