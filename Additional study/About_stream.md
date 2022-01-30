<h2>java.util 패키지


<h5>java.util 패키지에는 프로그램을 개발하는 데 사용할 수 있는 유용한 유틸리티 클래스가 다수 포함되어 있습니다.
실제로 java.lang 패키지 다음으로 가장 많이 사용되는 패키지가 java.util 패키지입니다.
하지만 import 문을 사용하지 않아도 바로 사용할 수 있는 java.lang 패키지와는 달리 *java.util 패키지는 import 문으로 패키지를 불러오고 나서야 클래스 이름만으로 사용할 수 있습니다.


<h2>java.util.Arrays 클래스
<h5>Arrays 클래스에는 배열을 다루기 위한 다양한 메소드가 포함되어 있습니다.
Arrays 클래스의 모든 메소드는 클래스 메소드(static method)이므로, 객체를 생성하지 않고도 바로 사용할 수 있습니다.
이 클래스는 java.util 패키지에 포함되므로, 반드시 import 문으로 java.util 패키지를 불러오고 나서 사용해야 합니다.
  

  
***
◼ 직렬화 (Serialize)
자바 시스템 내부에서 사용되는 Object 또는 Data를 외부의 자바 시스템에서도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술.
JVM(Java Virtual Machine 이하 JVM)의 메모리에 상주(힙 또는 스택)되어 있는 객체 데이터를 바이트 형태로 변환하는 기술
***
◼ 역직렬화 (Deseialize)
Byte 로 변환된 data를 원래대로 object 나 data로 변환하는 기술.
직렬화된 바이트 형태의 데이터를 객체로 변환해서 JVM 으로 상주시키는 형태
