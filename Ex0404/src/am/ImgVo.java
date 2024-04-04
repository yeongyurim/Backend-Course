package am;

public class ImgVo {
	int x, y, wh;
	String img_path;
	
	public ImgVo(int x, int y) {
		// 사용자가 클릭한 x,y 좌표는 인자로 받자!
		this.x = x - wh/2;
		this.y = y - wh/2;
		
		wh = (int)(Math.random()*150 + 50);
		
		int num = (int) (Math.random()*45+1);
		img_path = "src/images/"+num+".gif";
	}
}
