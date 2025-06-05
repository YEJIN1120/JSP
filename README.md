# 🌐 JSP 실습 - JSP

## 📌 소개

이 저장소는 JSP(JavaServer Pages) 및 Servlet 실습을 위한 코드 모음입니다.
JSP 문법과 서버 연동 구조를 이해하고, 웹 페이지 동작 방식을 학습하는 데 목적이 있습니다.

---

## 📁 폴더 구조

| 경로 | 설명 |
|------|------|
| `/WebContent/` | JSP 파일 및 정적 리소스 (HTML, 이미지 등) |
| `/WebContent/jspTest/` | JSP 문법 실습 파일 (스크립틀릿, 선언문 등) |
| `/WebContent/servletTest/` | JSP와 Servlet 연동 실습 예제 |
| `/WebContent/member/` | 회원가입 폼, 데이터 전송 실습 페이지 |
| `/src/` | Java Servlet 코드 |
| `web.xml` | 서블릿 매핑 설정 파일 |

---

## 🛠 사용 기술

- JSP
- Java Servlet
- HTML
- CSS (간단한 스타일링)
- Apache Tomcat

---

## ✨ 학습 포인트

- JSP 기본 문법 이해
  - `<% %>`, `<%= %>`, `<%! %>` 등 스크립틀릿/표현식/선언문 구조 실습
- JSP 페이지에서 Java 코드 삽입 및 실행 방식 확인
- `form`을 통해 입력된 데이터를 JSP에서 처리하는 흐름 실습
- Servlet과 JSP 간 요청/응답 흐름 이해 (`request`, `response`)
- `web.xml`을 통한 서블릿 매핑 설정 실습
- 간단한 회원가입 폼 구현을 통해 입력 처리와 데이터 흐름 학습
