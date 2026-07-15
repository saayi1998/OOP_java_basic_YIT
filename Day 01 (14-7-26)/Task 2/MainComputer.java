class MainComputer{
	public static void main(String args[]){
		
		Computer C;
		C=new Computer();
		
		C.color="Black";
		C.brand="dell";
		C.ram = 4;
		C.processor="intel";
		C.price=50000;
		
		System.out.println("Color:"+C.color);
		System.out.println("Brand:"+C.brand);
		System.out.println("Ram:"+C.ram);
		System.out.println("Processor:"+C.processor);
		System.out.println("Price:"+C.price);
		C.game();
		C.code();
		C.webbrowsing();
	}
}