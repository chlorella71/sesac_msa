package sec05_innerinterface.EX02_ButtonAPIExample;

class Button {
	OnClickListener ocl;
	void setOnClickListener (OnClickListener ocl) {
		this.ocl = ocl;
	}
	interface OnClickListener {
		public abstract void onClick();
	}
	void onClick() {
		ocl.onClick();
	}
	
}

public class ButtonAPIExample {
	public static void main(String[] args) {
		//개발자 1. 클릭하면 음악재생
		Button btn1 = new Button();
		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("개발자 1: 음악재생");
			}
		});
		btn1.onClick();
		
		//개발자2. 클릭하면 네이버접속
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("개발자 2: 네이버로 접속");
				
			}
		});
		btn2.onClick();
	}
}
