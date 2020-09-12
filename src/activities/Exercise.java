package activities;

public class Exercise {
	public enum Type {FINGERSTYLE, STRUMMING, THEME};
	

	int duration;
	int bpm;
	String name;
	String source;
	public Type type;
	

	public Exercise(int duration, int bpm, String name, String source, Type type) {
		super();
		this.duration = duration;
		this.bpm = bpm;
		this.name = name;
		this.source = source;
		this.type = type;
		
	}	

	

	
	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getTime() {
		return duration;
	}

	public void setTime(int time) {
		this.duration = time;
	}
}
