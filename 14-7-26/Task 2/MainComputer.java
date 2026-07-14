class MainComputer{
	public static void main(String args[]){
		
		Computer C;
		C=new Computer();
		
		C.color="Black";
		C.brand="Dell";
		C.weight=2;
		C.madeIn="China";
		C.price=50000;
		
		System.out.println("Color:"+C.color);
		System.out.println("Brand:"+C.brand);
		System.out.println("Height:"+C.weight);
		System.out.println("Made In:"+C.madeIn);
		System.out.println("Price:"+C.price);
		C.write();
	}
}