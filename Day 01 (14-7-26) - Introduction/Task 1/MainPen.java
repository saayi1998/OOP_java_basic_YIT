class MainPen{
	public static void main(String args[]){
		
		Pen P;
		P=new Pen();
		
		P.color="Red";
		P.brand="Ten";
		P.height=5.3;
		P.madeIn="Srilanka";
		P.price=100;
		
		System.out.println("Color:"+P.color);
		System.out.println("Brand:"+P.brand);
		System.out.println("Height:"+P.height);
		System.out.println("Made In:"+P.madeIn);
		System.out.println("Price:"+P.price);
		P.write();
	}
}