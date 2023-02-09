package ch9;

public class Ex9_1 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

	}//main

}

class Value{
	int value;
	
	Value(int value){
		this.value = value;
	}
	
	//Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교 
	public boolean equals(Object obj) {
		//return this == obj; //주소비교, 서로 다른 객체는 항상 거짓을 리턴 주소가 다르니!
		
		//참조변수의 형변환 전에는 반드시 instanceof로 확인해야함.
		//instanceof를 이용한 연산 결과로 true를 얻었다는 것은 참조변수가 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.
		
		if(!(obj instanceof Value)) return false;  // => obj가 Value로 형변환이 안되면 false를 리턴하겠다.
		
		Value v = (Value)obj;
		
		return this.value==v.value;
	}
}
