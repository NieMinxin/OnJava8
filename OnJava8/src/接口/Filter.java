package 接口;

public class Filter {

	public String name() {
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input) {
		return input;
		
	}
}
class Waveform {
    private static long counter;
    private final long id = counter++;
    
    @Override
    public String toString() {
        return "Waveform " + id;
    }
}


class LowPass extends Filter {
    double cutoff;
    
    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }
    
    @Override
    public Waveform process(Waveform input) {
        return input; // Dummy processing 哑处理
    }
}

// interfaces/filters/HighPass.java
class HighPass extends Filter {
    double cutoff;
    
    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }
    
    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}

// interfaces/filters/BandPass.java
class BandPass extends Filter {
    double lowCutoff, highCutoff;
    
    public BandPass(double lowCut, double highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    
    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}