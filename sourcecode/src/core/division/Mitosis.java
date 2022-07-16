package core.division;

public class Mitosis implements GrowMethod {
	public String getGrowMethod() {return "Mitosis";}

	@Override
	public String getDirectory() {
		// TODO Auto-generated method stub
		return "/guiVideos/Mitosis.mp4";
	}

	@Override
	public Integer[] getKeyframes() {
		// TODO Auto-generated method stub
		return new Integer[] {0,48,64,72,99};
	}
}
