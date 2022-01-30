<h2>java.util 패키지


<h5>java.util 패키지에는 프로그램을 개발하는 데 사용할 수 있는 유용한 유틸리티 클래스가 다수 포함되어 있습니다.
실제로 java.lang 패키지 다음으로 가장 많이 사용되는 패키지가 java.util 패키지입니다.
하지만 import 문을 사용하지 않아도 바로 사용할 수 있는 java.lang 패키지와는 달리 *java.util 패키지는 import 문으로 패키지를 불러오고 나서야 클래스 이름만으로 사용할 수 있습니다.


<h2>java.util.Arrays 클래스
<h5>Arrays 클래스에는 배열을 다루기 위한 다양한 메소드가 포함되어 있습니다.
Arrays 클래스의 모든 메소드는 클래스 메소드(static method)이므로, 객체를 생성하지 않고도 바로 사용할 수 있습니다.
이 클래스는 java.util 패키지에 포함되므로, 반드시 import 문으로 java.util 패키지를 불러오고 나서 사용해야 합니다.
  

***
***
![image](https://user-images.githubusercontent.com/86949394/151691839-1777c664-f9f1-41a4-baf9-3abb1fa29afb.png)
***
◼ 직렬화 (Serialize)
자바 시스템 내부에서 사용되는 Object 또는 Data를 외부의 자바 시스템에서도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술.
JVM(Java Virtual Machine 이하 JVM)의 메모리에 상주(힙 또는 스택)되어 있는 객체 데이터를 바이트 형태로 변환하는 기술
***
◼ 역직렬화 (Deseialize)
Byte 로 변환된 data를 원래대로 object 나 data로 변환하는 기술.
직렬화된 바이트 형태의 데이터를 객체로 변환해서 JVM 으로 상주시키는 형태
  
<h6>스트림 ,위 그림에서 보듯이 한 곳에서 다른 곳으로의 데이터 흐름을 스트림이라고 한다.그리고 스트림은 단방향이기 때문에 입력과 출력이 동시에 발생할 수 없다. 그렇기 때문에 용도에 따라 입력스트림, 출력스트림이 나뉜다.그리고 자바에서 가장 기본이 되는 입력 스트림은 InputStream 이다.
(반대로 출력 스트림은 OutputStream 이다. System.in 이 InputStream 타입의 필드를 정리하자면 in 이라는 변수는 InputStream의 변수로 결국 InputStream 타입의 새 변수를 선언하고 그 변수에 System.in 을 할당시킬 수도 있다는 뜻이다. 이렇기 때문에 System.in 과 InputStream 을 같이 묶어서 설명하게 되는 것이다.
***
1. UTF-8 로 입력을 받는다
2. read() 메소드는 1 byte 만 읽기 때문에 나머지 byte 는 스트림에 잔존하게 된다.
3. 읽어들인 byte 값은 메모리에 UTF-16 에 대응되는 문자의 인코딩방식으로 2진수 값이 저장한다.
4. 출력시 메모리에 저장되어있던 2진수에 대응되는 문자가 UTF-8 로 변환되어 출력된다.
  
<h4>Cf)
<h6>정적(static) 멤버 클래스에 고정된 멤버로서 객체(인스턴스)를 생성하지 않고 사용할 수 있다
각각 정적 필드(변수), 정적 메소드가 있다. 정적 멤버를 선언 할 때에는 앞에 static만 붙이면 된다. 정적 필드는 필드를 선언할 때, 객체마다 가지고 있을 필요성이 없는 공용적인 데이터라면 정적 필드로 선언하는 것이 좋다
  
  
  
  
<h5>Scanner(System.in) 은 입력 바이트 스트림인 InputStream 을 통해 표준 입력받으려고 하는 것이구나!
 
<h6>InputStreamReader 는 InputStream 가 문자를 그대로 읽지 못하는 경우가 발생하기 때문에 좀 더 효율적인 입력을 위해 중개자 역할인 InputStreamReader 를 쓴다고 했다.
즉 아래와 같이 쓸 수 있다는 것이다.
 
바이트스트림인 InputStream 을 통해 입력을 받으면 문자스트림인 InputStreamReader 을 통해 바이트 단위 데이터를 문자(character) 데이터로 처리할 수 있게 만들어준다는 것이다. 그리고 앞에서 보았듯이 Scanner 를 생성할 때 문자스트림으로 변환시켜 읽는다는 것을 알 수 있다.
 
즉, InputStreamReader 의 가장 큰 특징은 다음과 같다.
1. 바이트 단위 데이터를 문자(character) 단위 데이터로 처리할 수 있도록 변환해준다.
2. char 배열로 데이터를 받을 수 있다.
 
 
그동안 Scanner의 생성자와 메소드 nextInt() 의 과정을 보면 아래와 같이 해석할 수 있다.
1. InputStream (바이트스트림) 을 통해 입력 받음
2. 문자로 온전하게 받기 위해 중개자 역할을 하는 InputStreamReader(문자스트림) 을 통해 char 타입으로 데이터를 처리함
3. 입력받은 문자는 입력 메소드( next(), nextInt() 등등.. ) 의 타입에 맞게 정규식을 검사함
4. 정규식 문자열을 Pattern.compile() 이라는 메소드를 통해 Pattern 타입으로 변환함
5. 반환된 Pattern 타입을 String으로 변환함
6. String 은 입력 메소드의 타입에 맞게 반환함 ( nextInt() - Integer.parseInt() / nextDouble() - Double.parseDouble() 
 
앞서 Scanner 에서 InputStreamReader 을 설명할 때 '문자'를 처리한다고 했다. '문자열'이 아니다.
(그래서 Scanner 에서도 내부에서 임시 배열을 두어 문자열처럼 사용하고 있다.)
InputStreamReader 로 char type 으로 처리할 수 있는 장점은 개선되었는데...
 
우리가 만약 문자열을 입력하고 싶다면 매번 배열을 선언해야 한다는 단점은 그대로 남아있다. 심지어 입력받을 문자열의 길이가 가변적이라면 더욱 불편하다.그래서 쓰는 것이 Buffer(버퍼)를 통해 입력받은 문자를 쌓아둔 뒤 한 번에 문자열처럼 보내버리는 것이다.
 
BufferedReader 를 쓸 때 우리는 입력 메소드로 readLine() 을 많이 쓴다. 이 메소드는 한 줄 전체를(공백 포함) 읽기 때문에 char 배열을 하나하나 생성할 필요 없이 String 으로 리턴하여 바로 받을 수 있다는 장점이 있다.
  
![image](https://user-images.githubusercontent.com/86949394/151692032-858cb78d-4224-423b-942a-2588f15d8d33.png)

<h5>그리고 BufferedReader 의 경우 Scanner 와 다르게 문자열 그대로 읽어 들이기 때문에 별다른 정규식을 검사하지 않는다.
그렇기 때문에 Scanner 에 비해 성능이 좋을 수밖에 없다는 것.
 
즉 스트림 이러한 구성이라고 보면 된다.즉 하나하나 문자를 보내는 것이 아닌 한 번에 모아둔 다음 보내니 훨씬 속도가 빠르고 별다른 정규식을 검사하지 않으니 더더욱 속도는 빠를 수밖에 없다.
즉, 정리하자면 바이트 단위 [InputStream]로 문자를 입력받아 문자(character) [InputStreamReader]로 처리한 뒤 버퍼(buffer) [BufferedReader]에 담아두었다가 일정 조건이 되면 버퍼를 비우면서 데이터를 보내는
 
1. InputStream 은 바이트 단위로 데이터를 처리한다. 또한 System.in 의 타입도 InputStream 이다.
2. InputStreamReader 은 문자(character) 단위로 데이터를 처리할 수 있도록 돕는다. InputStream 의 데이터를 문자로 변환하는 중개 역할을 한다.
3. BufferedReader 은 스트림에 버퍼를 두어 문자를 버퍼에 일정 정도 저장해둔 뒤 한 번에 보낸다.
  
<h4>결론적으로 
![image](https://user-images.githubusercontent.com/86949394/151692072-31e2638f-dc2f-4811-9160-c8c62238b1ad.png)

  
  ***
  
<h4> next() 와 nextLine() 의 차이
  
![image](https://user-images.githubusercontent.com/86949394/151692119-a7c4bfe9-f729-44a2-b963-60359ae2e581.pngpek160114_273)
  
<h5>여러분들이 문자열을 입력받을 때 가장 주의해야 할 메소드다.
 
일단 next() 는 '한 단어' 그러니까 공백을 기준으로 문장 한 개만 읽어 들인다.
nextLine() 은 위와 반대로 '한 줄' 즉, 한 줄에 입력된 여러 문장들을 읽는다.
 
예로 들면 아래와 같다.보면 알 수 있듯이 한 줄에 "Cat is perfect animal" 이라고 입력했으나, Cat 만 str 에 담겼다.
이렇듯이 next() 의 경우 하나의 문장, 즉 앞서 말했던 공백 또는 줄 바꿈까지만 읽는다.

  ***
  ![image](https://user-images.githubusercontent.com/86949394/151692126-12490a5d-904a-4ce8-9d0b-c089fe40260a.pngpek160114_273)
<h5>반면에 nextLine() 은 다르다.
Line 이라는 말 그대로 한 줄을 읽는다. 즉 한 줄 안에 공백 유무와 상관없이 개행(줄 바꿈)까지 읽는다는 것이다.
  
  

참고자료 : https://snupi.tistory.com/46,http://www.tcpschool.com/java/java_api_arrays
  

