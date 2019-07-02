package testPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		TransportationWalk transportationWalk = new TransportationWalk();
//		transportationWalk.move();

		//container
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		//컨테이너에서 id로 bean을 가져와서 사용하겟다.
		TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		transportationWalk.move();
		
		//리소스 반환
		ctx.close();
	
	}

}
