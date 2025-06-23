package ch07.sec07.poly2;


// Tv는 Product를 상속받는다.
// Tv의 가격은 100만원입니다.(무조건)
// Tv 객체의 주소값을 println에 찍으면 "Tv"가 출력되어야 한다.
// > toString 메소드 오버라이딩
public class Tv extends Product{

    public Tv() {
        super(100);  // super : 부모에 기본생성자가 없을때 super를 쓰지않으면 컴파일 에러가 발생함
    }
    @Override
    public String toString(){
        return "Tv";
    }
}
