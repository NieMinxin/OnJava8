package 内部类;

public class Sequence {
	private Object[] items;
	private int next =0;
	public Sequence(int size) {
		items = new Object[size];
	}
	void add(Object obj) {
		if(next<items.length) {
			items[next++] = obj;
		}
	}
	
	class SelectorSequence implements Selector{
		private int i=0;

		@Override
		public boolean end() {
			// TODO Auto-generated method stub
			return  i==items.length;
		}

		@Override
		public Object current() {
			// TODO Auto-generated method stub
			return items[i];
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if(i<items.length) {
				i++;
			}
		}
		
	}
	public SelectorSequence  getSelectorSequence() {
		return new SelectorSequence();
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(5);
		for(int i=0;i<5;i++) {
			sequence.add(i);
		}
		SelectorSequence slector = sequence.getSelectorSequence();
		while (!slector.end()) {
			System.out.println(slector.current());
			slector.next();
		}
	}
}
