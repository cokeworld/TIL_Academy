package ex03;

public class Won2Dollar extends Converter {
	
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	protected double convert(double src) {
		double result = src / ratio;
		return result;
	}

	@Override
	protected String srcString() {
		return "¿ø";
	}

	@Override
	protected String destString() {
		return "´Þ·¯";
	}

}
