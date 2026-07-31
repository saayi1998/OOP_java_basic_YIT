class C extends B {
	int z;
	
	C(int z,int y,int x){
	super(y,x);
	this.z=z;
	}
	
	void getz(){
		System.out.println("Cz"+this.z);
	}
}