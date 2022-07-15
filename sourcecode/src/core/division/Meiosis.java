package core.division;

public class Meiosis implements ReproduceMethod {
	public String getReproduceMethod() {return "Meiosis";}

	@Override
	public String getDirectory() {
		return "/guiVideos/Meiosis.mp4";
	}

	@Override
	public Integer[] getKeyframes() {
		// TODO Auto-generated method stub
		return new Integer[] {0,13,64,68,72,82,94,101,103,105};
	}
}
