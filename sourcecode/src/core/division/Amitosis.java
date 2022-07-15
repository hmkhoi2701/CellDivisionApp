package core.division;

public class Amitosis implements ReproduceMethod{
	public String getReproduceMethod() {return "Amitosis";}

	@Override
	public String getDirectory() {
		// TODO Auto-generated method stub
		return "/guiVideos/Amitosis.mp4";
	}

	@Override
	public Integer[] getKeyframes() {
		return new Integer[] {0, 6, 13, 29, 34, 48};
	}
}
