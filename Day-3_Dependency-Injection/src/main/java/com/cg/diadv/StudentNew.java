package com.cg.diadv;
//2.Dependency in terms of Objects
//Student class is dependent on MathCheat Class
public class StudentNew 
{
	MathCheat math;

	
	public void cheating()
	{
		math.mathCheat();
	}
	
	//Dependency Injection using setters
	public void setMath(MathCheat math) {
		this.math = math;
	}

}
