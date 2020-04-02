package 接口;
//适配器设计模式。
public class FilterAdpter implements Processor{
	Filter filter;
	
	public FilterAdpter(Filter filter) {
		// TODO Auto-generated constructor stub
		this.filter = filter;
	}

	@Override
	public Waveform process(Object input) {
		// TODO Auto-generated method stub
		return filter.process((Waveform) input);
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return filter.name();
	}
	
	

}
