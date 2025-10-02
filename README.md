# SpringbootComver1.0Gateway


Aprogram port 8001
Bprogram port 8002
Cprogram port 8003

--------------------------------------------------------------
ㄱhtml방식
I.Redturn 방식 
1.get (성공)
//localhost8001 html -> localhost8002 
2.post (성공)
//localhost8001 html -> localhost8002 

II. Redriect 방식
1.URI 파라미터 (성공)
  //localhost8001 html -> localhost8002 CONTROLLER ->localhost8002 VIEW
2.RedirectAttributes ()
  //localhost8001 html -> localhost8002 CONTROLLER ->localhost8002 VIEW
3.세션
  //localhost8001 html -> localhost8002 CONTROLLER ->localhost8002 VIEW

III. REST 방식
1.get 조회
2.post 생성
3.put 수정
4.delete 삭제
5.patch 부분수정

--------------------------------------------------------------
ㄴ컨트롤러 방식
I. Redturn 방식 
1.get 
2.post 


II. Redriect 방식
1.URI 파라미터 
2.RedirectAttributes
3.Redirect 후 FlashAttribute 받기

III. REST 방식
1.get 조회
2.post 생성
3.put 수정
4.delete 삭제
5.patch 부분수정

--------------------------------------------------------------
20250930 스프링부트 통신 테스트
20251001 스프링부트 redirect 테스트
20251002 스프링부트 request redirect 방식 통신성공, 1.같은 하드웨어 2. 다른 하드웨어



