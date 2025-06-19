package starcraft;

public class SiegeTank extends GroundUnit {
	private boolean siegeMode;

	public void toggleSiegeMode(){
		//이 메소드를 호출할 때마다 시즈모드의 값이 true면 false, false면 true 되도록
		siegeMode = !siegeMode;
	}
}
