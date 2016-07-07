package lsp.bad;

public class Duck {
	public boolean IsTurnedOn;

	public void swim() {
		System.out.println("I am swiming");
	}

	private void turnOn() {
		this.IsTurnedOn=true;
	}

	public void makeDuckSwim() {
		swim();
	}
	
}

class ElectricDuck extends Duck{
    public void setTrunOFF(){
    	this.IsTurnedOn=false;
    }

    public void makeDuckSwim() {
    	if(IsTurnedOn){
    		swim();
    	}
    }

    static class DuckTest{
    	public static void main(String args[]) {
    		ElectricDuck eDuck = new ElectricDuck();
    		eDuck.setTrunOFF();
    		Duck duck=eDuck;
    		duck.makeDuckSwim();
    	}
    }
}