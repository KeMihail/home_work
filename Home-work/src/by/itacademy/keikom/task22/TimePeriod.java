package by.itacademy.keikom.task22;

public class TimePeriod implements Comparable<TimePeriod> {

	private Integer seconds;
	private Integer minutes;
	private Integer hours;
	
	TimePeriod(Integer seconds, Integer minutes, Integer hours){
		if (seconds < 0 || seconds > 60) this.seconds = 0;
		else this.seconds = seconds;
		
		if (minutes < 0 || minutes > 60) this.minutes = 0;
		else this.minutes = minutes;
		
		if (hours < 0 || hours > 24) this.hours = 0;
		else this.hours = hours;
	}
	
	TimePeriod(Integer seconds){
		
		if(seconds < 0) {
			this.seconds = 0;
			this.minutes = 0;
			this.hours = 0;
			return;
		}
		
		this.seconds = seconds % 60;
		
		int m = (seconds - this.seconds) / 60;
		this.minutes = m % 60;
		
		int h = (m - this.minutes) / 60;
		this.hours = h % 24;
	}
	
	public Integer getSeconds() {
		return seconds;
	}
	public void setSeconds(Integer seconds) {
		if (seconds < 0 || seconds > 60) this.seconds = 0;
		else this.seconds = seconds;
	}
	
	public Integer getMinutes() {
		return minutes;
	}
	public void setMinutes(Integer minutes) {
		if (minutes < 0 || minutes > 60) this.minutes = 0;
		else this.minutes = minutes;
	}
	
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		if (hours < 0 || hours > 24) this.hours = 0;
		else this.hours = hours;
	}
	
	public Integer getCountSeconds(TimePeriod obj) {
		
		return seconds + (minutes * 60) + (hours * 3600);
	}
	
	@Override
	public String toString() {
		return "TimePeriod [seconds = " + seconds + ", minutes = " + minutes + ", hours = " + hours + "]";
	}

	@Override
	public int compareTo(TimePeriod obj) {
		
		if (getCountSeconds(this) > obj.getCountSeconds(obj)) return 1;
		if (getCountSeconds(this) < obj.getCountSeconds(obj)) return -1;
		return 0;
	}
}
