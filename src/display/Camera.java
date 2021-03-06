package display;

/**
 * This class contains data dealing with the position and zoom of the camera
 */
public class Camera {
	private float x;
	private float y;
	private float zoom;
	
	public Camera() {
		this.x = 50;
		this.y = 50;
		this.zoom = 20;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getZoom() {
		return zoom;
	}
	
	/**
	 * Updates the position and zoom of the camera
	 * @param dx
	 * @param dy
	 * @param mouseScroll
	 */
	public void update(float dx, float dy, float mouseScroll) {
		x+=dx;
		y+=dy;

		//set maximum values for x and y
		//should have maximum values depend on the size of the tile map
//		if (x < 0) {
//			x = 0;
//		}
//		if (x > 150) {
//			x = 150;
//		}
//		if (y < 0) {
//			y = 0;
//		}
//		if (y > 173.21f) {
//			y = 173.21f;
//		}
		
		//zoom in or out depending on how much the mouse was scrolled
		zoom += (-1 * mouseScroll * (zoom / 10f));

		//increasing zoom is zooming in, decreasing zoom is zooming out
		//minimum and maximum zoom
		if (zoom < 1) {
			zoom = 1;
		}
		if (zoom > 100) {
			zoom = 100;
		}
		
	}
}
